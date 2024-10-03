package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Global_Variables;

public class Droppable_PO  extends Base_PO {

    private @FindBy(xpath ="/html//div[@id='draggable']")
    WebElement drag_me_box;

    private @FindBy(xpath ="/html//div[@id='droppable']")
    WebElement drop_here_box;

    public Droppable_PO() {
        super();
    }

    public void Navigate_To_Droppable_URL_Page()
    {
      navigateTo_URL(Global_Variables.DEMOQA_HOMEPAGE_URL+ "/droppable");
    }
    public void click_and_hold_drag_me_box()
    {
        waitForElementAndClickAndHold(drag_me_box);
    }
    public void move_drag_me_box_to_drop()
    {
      waitForElementAndMove(drop_here_box);
    }
    public void release_drag_me_box()
    {
        waitForRelease(drop_here_box);
    }

    public boolean is_drop_here_box_blue()
    {
        String backgroundColor=drop_here_box.getCssValue("div#droppable");
        return backgroundColor.equals("rgba(70,130,180,1");
    }
}
