import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { InputTextComponent } from 'src/@components/input/text/input-text.component';

@Component({
  selector: 'geocon-clock',
  standalone: true,
  imports:[InputTextComponent],
  templateUrl: './clock.component.html',
  styleUrl: './clock.component.scss'
})
export class ClockComponent
{
    public currentTime:string='';
    constructor()
    {
        this.updateTime();
        setInterval(()=>
        {
            this.updateTime();
        },1000);
    }
    updateTime() : void{
      const now =new Date();
      this.currentTime=now.toLocaleTimeString();
    }   
}


