package com.qa.pages.life;

import com.qa.commands.WebCommands;
import com.qa.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Set;

import static com.qa.base.TestBase.driver;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class TermLifeForSharePlanPage {

    public TermLifeForSharePlanPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id=\"Radio-F\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement yes;

    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement no;

    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calender;

    @FindBy(xpath = "//select[@class=\"sc-iQKALj gwKrYD\"]")
    WebElement yearselect;

    @FindBy(xpath = "(//select[@class=\"sc-iQKALj gwKrYD\"])[2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, August 5th, 1992\"]")
    WebElement dateselect;

    @FindBy(xpath = "//span[text()= 'Next']")
    WebElement NextButton;

    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement gotIt;

    @FindBy(xpath = "//button[text()='OK, GOT IT!']")
    WebElement OkGotit;

    @FindBy(xpath = "//span[@id='shareQuotes'][1]")
    WebElement shareplan;

    @FindBy(xpath = "//span[text()=' Share Plan']")
    WebElement sharePlanText;

    @FindBy(xpath = "//p[text()='Brochure']")
    WebElement clickBrochure;

    @FindBy(xpath = "//div[text()= ' Copy Link ']")
    WebElement copyLink;

    @FindBy(xpath = "//div[text()= ' Whatsapp ']")
    WebElement clickWhatsapp;

    @FindBy(xpath = "//div[text()=' Download ']")
    WebElement download;

    @FindBy(xpath = "//p[text()='One Pager'][@class='ng-binding']")
    WebElement OnePager;

    @FindBy(xpath = "//a[@ng-click='backToPrevious()']//*[name()='svg']")
    WebElement back;

    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Sampoorna Raksha Supreme (SRS)']")
    WebElement tata;

    @FindBy(xpath = "//p[text()='Benefit Illustration']")
    WebElement BI;

    public String val;

    public void selectGender() throws InterruptedException {
        WebCommands.staticSleep(2000);
    }

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
            WebCommands.staticSleep(1000);
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
        WebCommands.staticSleep(1000);
    }

    public void smoke_chewTobaco(String yesNo) {
        WebCommands.staticSleep(1000);
        if (yesNo == "yes") {
            TestUtil.click(yes, "Yes Selected");
            WebCommands.staticSleep(1000);
        } else
            TestUtil.click(no, "No Selected");
        WebCommands.staticSleep(1000);
    }

    public void datepicker() {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText("Aug");
        WebCommands.staticSleep(1000);
        TestUtil.click(dateselect, "5 aug date select");
        WebCommands.staticSleep(5000);
        TestUtil.click(NextButton, "Clicked on Next button");
    }

    public void Switch() {
        WebCommands.staticSleep(3000);
        String currentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
            }
        }

    }

    public void SharePlan()  {
        WebCommands.staticSleep(3000);
        String parent = driver.getWindowHandle();

        TestUtil.click(shareplan, "clicked on share plan option");

        String sharetext = sharePlanText.getText();
        System.out.println(sharetext + "text for share plan");
        Assert.assertEquals(sharetext, "Share Plan");

        // Verify Brochure click and download event
        boolean clickbrochure = TestUtil.clickable(clickBrochure, "Clicked on brochure option on share plan screen");

        Assert.assertEquals(clickbrochure, true);
        WebCommands.staticSleep(3000);
        boolean brochuredownload = TestUtil.clickable(download, " clicked on download button");
        Assert.assertEquals(brochuredownload, true);
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        driver.switchTo().window(parent);

        // Verify OnePager click and download event
        WebCommands.staticSleep(3000);
        boolean onepager = TestUtil.clickable(OnePager, "One Page text displayed");

        Assert.assertEquals(onepager, true);
        boolean onepagerdownload = TestUtil.clickable(download, " clicked on download button");
        Assert.assertEquals(onepagerdownload, true);
        WebCommands.staticSleep(3000);

        driver.switchTo().window(parent);


        // Verify copy link event
        WebCommands.staticSleep(3000);
        boolean cplink = TestUtil.clickable(copyLink, "Clicked on copy link option");

        Assert.assertEquals(cplink, true);

        // Verify BI click and download event
        try {
            if (driver.findElement(By.xpath("//p[text()='Benefit Illustration']")).isDisplayed()) {
                boolean bi = TestUtil.clickable(BI, "Clicked on Benefit Illustration");
                Assert.assertEquals(bi, true);
                boolean bidownload = TestUtil.clickable(download, " clicked on download button");
                Assert.assertEquals(bidownload, true);

            }
        } catch (Exception e) {
            System.out.println("Benefit Illustration in not available for this plan");
        }
    }
}