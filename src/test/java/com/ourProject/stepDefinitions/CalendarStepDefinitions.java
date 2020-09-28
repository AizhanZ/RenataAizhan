package com.ourProject.stepDefinitions;

import com.ourProject.pages.BasePage;
import com.ourProject.pages.CalendarPage;
import com.ourProject.pages.LoginPage;
import com.ourProject.utilities.ConfigurationReader;
import com.ourProject.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CalendarStepDefinitions extends BasePage {

    CalendarPage calendarPage = new CalendarPage();
    LoginPage loginPage = new LoginPage();

    @Then("User enters credentials")
    public void user_enters_credentials() {
        loginPage.login();
        //calendarPage.userNameElement.sendKeys(ConfigurationReader.getProperty("hr_username"));
        //calendarPage.passwordElement.sendKeys(ConfigurationReader.getProperty("bitrix_password"));
    }
    @Then("User clicks on Calendar icon")
    public void user_clicks_on_calendar_icon() throws Exception {
        //Thread.sleep(1000);
        calendarPage.CalendarIcon.click();
        Thread.sleep(1000);
        calendarPage.September22.click();
    }
    @Then("User fill out the event pop-up")
    public void user_fill_out_the_event_pop_up() throws Exception{

        Thread.sleep(3000);

        calendarPage.EventInputBox.sendKeys("Birthday Event");
        Thread.sleep(1000);
        calendarPage.ClearReminderTime.click();
        calendarPage.PlusIcon.click();
        //calendarPage.OneHourBefore.click();

        Actions actions = new Actions(Driver.getDriver());

        WebElement OneHourBefore1 = Driver.getDriver().findElement(By.xpath("(//span[.='1 hour before event'])[2]"));
        actions.moveToElement(OneHourBefore1).build().perform();
        calendarPage.OneHourBefore.click();
        calendarPage.LocationInputBox.sendKeys("My office");

    }
    @Then("User should be able to click on save button")
    public void user_should_be_able_to_click_on_save_button() {

        calendarPage.SaveButton.click();
    }


}
