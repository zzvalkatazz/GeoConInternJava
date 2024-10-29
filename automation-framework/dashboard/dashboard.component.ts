import {
  AfterViewInit,
  Component,
  OnDestroy,
  OnInit,
  ViewChild,
} from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { TranslateService, TranslateModule } from '@ngx-translate/core';
import moment from 'moment';
import { firstValueFrom, map, skip, Subscription } from 'rxjs';
import { DashboardChatbotDialogComponent } from 'src/@components/@dashboard-chatbot/dashboard-chatbot.component';
import { BreadcrumbComponent } from 'src/@components/breadcrumb/breadcrumb.component';
import { HolidayPlanButtonsComponent } from 'src/@components/dialog/button-groups/holiday-plan-buttons/holiday-plan-buttons.component';
import { AbsencesFormComponent } from 'src/@components/nomenclature-forms/databases-tab/absences-form/absences-form.component';
import { DutiesFormComponent } from 'src/@components/nomenclature-forms/databases-tab/duties-form/duties-form.component';
import { ShiftsFormComponent } from 'src/@components/nomenclature-forms/databases-tab/shifts-form/shifts-form.component';
import { HolidayPlanFormComponent } from 'src/@components/nomenclature-forms/holiday-plan/holiday-plan.component';
import { TimeRecordingButtonsComponent } from 'src/@components/nomenclature-forms/interface/time-recording/time-recording-buttons/time-recording-buttons.component';
import { TimeRecordingComponent } from 'src/@components/nomenclature-forms/interface/time-recording/time-recording.component';
import { EmployeesFormService } from 'src/@components/nomenclature-forms/personal-tab/employees-form/services/employees-form.service';
import { HttpService } from 'src/@core/backend/api/http.service';
import { CommonRights } from 'src/@core/enums/common-rights.enum';
import { OptionTypes } from 'src/@core/enums/option-types.enum';
import { RegOptionTypes } from 'src/@core/enums/reg-option-types.enum';
import { RightGroups } from 'src/@core/enums/right-groups.enum';
import { BreadCrumbModel } from 'src/@components/breadcrumb/models/breadcrumb.model';
import { WriteLocalSetModel } from 'src/@core/models/settings/write-local-set.model';
import { DialogService } from 'src/@core/services/dialog/dialog.service';
import { OptionService } from 'src/@core/services/options/option.service';
import { SettingsService } from 'src/@core/services/settings/settings.service';
import { StationService } from 'src/@core/services/station/station.service';
import { StatisticsService } from 'src/@core/services/statistics/statistics.service';
import { UserService } from 'src/@core/services/user/user.service';
import { CommonUtils } from 'src/@core/utils/common.utils';

import { IgxButtonDirective, IgxIconComponent } from 'igniteui-angular';
import { BreadcrumbComponent as BreadcrumbComponent_1 } from '../../@components/breadcrumb/breadcrumb.component';
import { MatCardModule } from '@angular/material/card';
import { InputTestComponent } from '../../@components/input/input-test/input-test.component';
import { DisableLinkDirective } from 'src/@core/directives/disable-router-link.directive';
import { GeneratePlanComponent } from 'src/@components/dplan-overview/dplan-plan-menu-select/components/automatic-occupation-of-shifts/components/generate-plan/generate-plan.component';
import { TestComponentComponent } from "./components/test-component/test-component.component";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss'],
  standalone: true,
  imports: [
    MatCardModule,
    BreadcrumbComponent_1,
    RouterLink,
    IgxButtonDirective,
    IgxIconComponent,
    TranslateModule,
    InputTestComponent,
    DisableLinkDirective,
    TestComponentComponent,
],
})
export class DashboardComponent implements OnInit, AfterViewInit, OnDestroy {
  public openGeneratePlan() {
    var genPlanDialogRef = this.genPlanDialog.openDialog({
      component: GeneratePlanComponent,
      width: '95%',
    });
  }

  public openChatDialog: boolean = false;

  public useHolidayPlan: boolean;
  public dutiesRights: boolean;
  public planRights: boolean;
  public employeesRights: boolean;
  public optionsRights: boolean;
  public timeRecRights: boolean;
  public shiftsRights: boolean;
  public absencesRights: boolean;
  public annualAbsencePlanRights: boolean;

  constructor(
    public translate: TranslateService,
    public userService: UserService,
    public settingsService: SettingsService,
    public router: Router,
    public activatedRoute: ActivatedRoute,
    public stationService: StationService,
    public dialog: MatDialog,
    public statisticsService: StatisticsService,
    private optionService: OptionService,
    private holidayPlanDialogService: DialogService<
      HolidayPlanFormComponent,
      HolidayPlanButtonsComponent
    >,
    private api: HttpService,
    private timeRecordingDialogService: DialogService<TimeRecordingComponent>,
    public dutiesService: DialogService<DutiesFormComponent>,
    public absencesService: DialogService<AbsencesFormComponent>,
    public shiftsFormComponentService: DialogService<ShiftsFormComponent>,
    public employeesFormService: EmployeesFormService,
    private genPlanDialog: DialogService<GeneratePlanComponent>
  ) {
    this.planRights = this.userService.getRightValue(
      CommonRights.Schedule,
      RightGroups.COMMON
    );

    this.annualAbsencePlanRights = this.userService.getRightValue(
      CommonRights.ChangeHolidayPlan,
      RightGroups.COMMON
    );

    this.employeesRights = this.userService.getRightValue(
      CommonRights.Employees,
      RightGroups.COMMON
    );

    this.optionsRights = this.userService.getRightValue(
      CommonRights.Options,
      RightGroups.COMMON
    );

    this.timeRecRights = this.userService.getRightValue(
      CommonRights.TimeRecordingSystem,
      RightGroups.COMMON
    );

    this.shiftsRights = this.userService.getRightValue(
      CommonRights.Shifts,
      RightGroups.COMMON
    );

    this.absencesRights = this.userService.getRightValue(
      CommonRights.AbsenceReasons,
      RightGroups.COMMON
    );

    this.dutiesRights = this.userService.getRightValue(
      CommonRights.Duties,
      RightGroups.COMMON
    );
    // debugger;

    this.useHolidayPlan = this.userService.getRightValue(
      CommonRights.ChangeHolidayPlan,
      RightGroups.COMMON
    );
  }

  ngOnInit(): void {}

  ngAfterViewInit(): void {
    // Skipping first value so that it does not assign the idstation twice
    // on app startup and create expression changed error
    this.settingsService.lastStationId.pipe(skip(1)).subscribe((idstation) => {
      const writeLocalSetsModel = new WriteLocalSetModel({
        p1: this.userService.userSessionId.toString(),
        p2: RegOptionTypes.LastMand,
        p3: idstation,
      });

      this.settingsService
        .setLocalSet(writeLocalSetsModel)
        .subscribe((value) => {
          this.settingsService.replaceSavedSettingValue(
            RegOptionTypes.LastMand,
            idstation
          );
        });
    });
  }

  ngOnDestroy(): void {}

  public clickChatDialog() {
    this.openChatDialog = true;

    var dialogRef = this.dialog.open(DashboardChatbotDialogComponent, {
      height: '400px',
      width: '285px',
      position: { right: '0.5rem', bottom: '4rem' },
    });
    dialogRef.afterClosed().subscribe(() => {
      this.openChatDialog = false;
    });
  }

  async onStatisticsClick() {
    const statId = this.settingsService.getSettingValue(
      RegOptionTypes.LastMand
    );

    await this.statisticsService.openStatisticsDialog(statId);
  }

  onOptionsClick() {
    this.optionService.openOptionsDialog();
  }

  public dutiesOnClick() {
    if (!this.dutiesRights) {
      return;
    }
    const dialogRef = this.dutiesService.openDialog({
      width: '95vw',
      maxWidth: '1300px',
      component: DutiesFormComponent,
      title: 'text.1182',
    });
  }

  public absencesOnClick() {
    if (!this.absencesRights) {
      return;
    }
    const dialogRef = this.absencesService.openDialog({
      width: '95vw',
      maxWidth: '1300px',
      component: AbsencesFormComponent,
      title: 'text.868',
    });
  }

  openSocket() {
    // Create WebSocket connection.
    const socket = new WebSocket(
      'ws://localhost:9090?user=999999&username=geocon'
    );

    // Connection opened
    socket.addEventListener('open', (event) => {
      socket.send('Hello Server!');
    });

    // Listen for messages
    socket.addEventListener('message', (event) => {
      console.log('Message from server ', event.data);
    });
  }

  onShiftsClick() {
    const dialogRef = this.shiftsFormComponentService.openDialog({
      width: '95vw',
      maxWidth: '1300px',
      component: ShiftsFormComponent,
      title: 'text.132',
    });

    // const dialogRef = this.shiftsFormComponentService.openDialog({
    //   component: ShiftsFormComponent,
    //   formData: {},
    // });
  }

  //Function to open a dialog with the HolidayPlanFormComponent
  async onHolidayPlanClick() {
    if (!this.useHolidayPlan) {
      return;
    }

    //oBLF_PERSONS.getPERSONAL_NAMES_toDate (curidstat,.F.,0,todate), ;
    const employees$ = this.api
      .createRequest('oBLF_PERSONS.getPERSONAL_NAMES_toDate', [
        this.settingsService.lastStationId.value,
        '.F.',
        0,
        moment().format(CommonUtils.DATE_FORMAT_STRING),
      ])
      .pipe(
        map((result) => {
          return result['data'];
        })
      );

    //oBLF_ABCENCE.getAbcenceType()

    const absencesTypes$ = this.api
      .createRequest('oBLF_ABCENCE.getAbcenceType', [])
      .pipe(
        map((result) => {
          return result['data'];
        })
      );

    //oBLP_OTPCALC.getUsedClaims(THISFORM.curidstat)
    const claims$ = this.api
      .createRequest('oBLP_OTPCALC.getUsedClaims', [
        this.settingsService.lastStationId.value,
      ])
      .pipe(
        map((result) => {
          return result['data'][0];
        })
      );

    const employeesData = await firstValueFrom(employees$);
    const absencesTypeData = await firstValueFrom(absencesTypes$);
    const claimsData = await firstValueFrom(claims$);

    const dialogRef = this.holidayPlanDialogService.openDialog({
      component: HolidayPlanFormComponent,
      buttonComponent: HolidayPlanButtonsComponent,
      height: '100vh',
      width: '100vw',
      maxWidth: '1300px',
      maxHeight: '780px',
      showSearch: false,
      title: 'text.75',
      formData: {
        employees: employeesData,
        absencesTypes: absencesTypeData,
        claims: claimsData,
      },
    });

    dialogRef.afterClosed().subscribe(() => {
      //this.openChatDialog = false;
    });
  }

  public timeRecordingImportClick() {
    this.timeRecordingDialogService.openDialog({
      component: TimeRecordingComponent,
      buttonComponent: TimeRecordingButtonsComponent,
      width: '1500px',
    });
  }

  public employeesFormClick() {
    this.employeesFormService.openNomenclature(false, false);
  }
}
