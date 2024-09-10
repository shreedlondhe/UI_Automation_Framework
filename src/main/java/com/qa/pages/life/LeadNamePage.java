package com.qa.pages.life;

import com.qa.base.TestBase;
import com.qa.commands.WebCommands;
import com.qa.util.LogUtils;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LeadNamePage extends TestBase {

    public LeadNamePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButton;

    @FindBy(xpath = "//Button[text()='OK, GOT IT!']")
    WebElement OkGotItBtn;

    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement GotItBtn;

    public void SaveLead(String LeadName) throws InterruptedException {
        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        NextButton.click();
        WebCommands.staticSleep(10000);
    }

    public void GotItButton() throws InterruptedException, IOException {
        WebCommands.staticSleep(7000);
        TestUtil.JsClick(OkGotItBtn,"GotItBtn clicked");
        WebCommands.staticSleep(3000);
        TestUtil.JsClick(GotItBtn,"Another Got It Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getFullPageScreenShot();
    }
}

