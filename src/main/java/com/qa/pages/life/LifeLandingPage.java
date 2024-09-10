package com.qa.pages.life;

import com.qa.commands.WebCommands;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.base.TestBase.driver;

public class LifeLandingPage {
    public LifeLandingPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Term Life']//parent::div")
    WebElement termLifeButton;

    @FindBy(xpath = "//div[text()='Investment']")
    WebElement investmentButton;

    @FindBy(xpath = "//div[text()='Child Saving']//parent::div")
    WebElement childSavingButton;

    @FindBy(xpath = "//div[text()='Retirement']")
    WebElement retirementButton;

    @FindBy(xpath = "//div[text()='Guaranteed Returns']")
    WebElement GuaranteedReturns;

    @FindBy(xpath = "//div[text()='ULIP']")
    WebElement ULIP;

    @FindBy(xpath = "//div[text()='Participating Plans']")
    WebElement ParticipatingPlans;

    @FindBy(xpath = "//div[text()='PoS Product']//parent::div")
    WebElement posProductButton;

    @FindBy(xpath = "//span[text()='See more plans']")
    WebElement SeemorePlan;


    public void TermLifeClick() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(termLifeButton, "Clicked on Term Life Option");


    }
    public void ULIP() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ULIP, "Clicked on Term Life Option");


    }
    public void GuaranteedReturns() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(GuaranteedReturns, "Clicked on Term Life Option");


    }
    public void ParticipatingPlans() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ParticipatingPlans, "Clicked on Term Life Option");


    }
    public void Investment() throws InterruptedException {
        WebCommands.staticSleep(4000);
        TestUtil.JsClick(investmentButton,"Clicked on Investment Option");
//        try {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click()", investmentButton);//
//        } catch (Exception e) {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click()", investmentButton);
//        }


    }

    public void ChildSaving() {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(childSavingButton, "Clicked on Child Saving Option");
    }

    public void Retirement() {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(retirementButton, "Clicked on Retirement Option");
    }

    public void PoSProduct() {
        WebCommands.staticSleep(2000);
        TestUtil.click(posProductButton, "Clicked on POS Product Option");
    }

    public void SeeMorePlans() {
        WebCommands.staticSleep(2000);
        TestUtil.click(SeemorePlan, "Clicked on POS Product Option");
    }

}