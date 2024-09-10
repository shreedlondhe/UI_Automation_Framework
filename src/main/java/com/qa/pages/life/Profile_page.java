package com.qa.pages.life;

import com.qa.base.TestBase;
import com.qa.commands.WebCommands;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Profile_page extends TestBase {

    public Profile_page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@id='Radio-M']")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id='Radio-F']")
    WebElement Femaleselected;

    @FindBy(xpath = "//input[@placeholder='Enter Date']")
    WebElement DateDropDown;

    @FindBy(xpath = "//input[@placeholder='Enter Date']")
    WebElement calender;

    @FindBy(xpath = "//select[@class='sc-iQKALj gwKrYD']")
    WebElement yearselect;

    @FindBy(xpath = "(//select[@class='sc-iQKALj gwKrYD'])[2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, December 1st, 2004']")
    WebElement ModifiedDateSelect;


    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, December 2nd, 1992']")
    WebElement dateselectTata;

    @FindBy(xpath = "//div[@aria-label='Choose Thursday, May 3rd, 1979']")
    WebElement dateselectIcici;

    @FindBy(xpath = "//div[@aria-label='Choose Monday, July 18th, 1983']")
    WebElement dateselectHdfc;

    @FindBy(xpath = "//div[@aria-label='Choose Saturday, October 10th, 1987']")
    WebElement dateselectMax;

    @FindBy(xpath = "//div[@aria-label='Choose Tuesday, December 7th, 2004']")
    WebElement dateselectBalicPos;

    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, June 24th, 1992']")
    WebElement dateselectLicNewJeevan;

    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, November 12th, 1980']")
    WebElement dateselectLicJeevanLakhsya;

    @FindBy (xpath = "//label[@id='Radio-false']")
    WebElement SmokeChewTobacco;

    @FindBy (xpath = "//div[@class='sc-eqIVtm cCBzET']")
    WebElement annualIncomeDropdown;

    @FindBy (xpath = "//li[text()='2 lakhs']")
    WebElement annualIncomeTwoLakhs;

    @FindBy (xpath = "//li[text()='3 lakhs']")
    WebElement annualIncomeThreeLakhs;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButton;

    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement EnterAmount;

    @FindBy(xpath = "//span[text()='Select']")
    WebElement PPTDropDown;

    @FindBy(xpath = "//li[text()='8 years']")
    WebElement PPTEightYears;

    @FindBy(xpath = "//li[text()='10 years']")
    WebElement PPTTenYears;

    @FindBy(xpath = "//li[text()='12 years']")
    WebElement PPTTwelveYears;

    @FindBy(xpath = "//li[text()='35 years']")
    WebElement PPTThirtyFiveYears;

    @FindBy(xpath = "//span[text()='Modify']")
    WebElement Modify;

    @FindBy(xpath = "//div[@name='policyTerm']//div[@class='sc-eqIVtm cCBzET']")
    WebElement ModifiedPPTDropDown;
    //------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@class='sc-eqIVtm cCBzET']")
    WebElement SelectLifeStage;
    @FindBy(xpath = "//li[text()='Single']")
    WebElement Single;
    @FindBy(xpath = "//li[text()='Married']")
    WebElement Married;
    @FindBy(xpath = "//li[text()='Married With Kids']")
    WebElement MarriedWithKids;
    @FindBy(xpath = "//li[text()='Near Retirement']")
    WebElement NearRetirement;
    @FindBy(xpath = "//div[@name='investmentGoals']")
    WebElement Selectinvestmentgoals;
    @FindBy(xpath = "//li[text()='Wealth Creation']")
    WebElement WealthCreation;
    @FindBy(xpath = "//li[text()='Savings']")
    WebElement Savings;
    @FindBy(xpath = "//li[text()='Medium']")
    WebElement Medium;
    @FindBy(xpath = "//span[text()='Low']")
    WebElement Low;
    @FindBy(xpath = "//span[text()='High']")
    WebElement High;
//    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
//    WebElement EnterAmountSutabolity;

public void suitabilityPage1()
{
    TestUtil.click(SelectLifeStage,"clicked on select life stage");
    TestUtil.click(MarriedWithKids,"clicked on Marrital with kids");

    TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
    TestUtil.click(WealthCreation,"clicked on MarriedWithKids");

    TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
    TestUtil.click(NextButton,"click on next");
}
    public void suitabilityPage2()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(NearRetirement,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Savings,"clicked on MarriedWithKids");
        TestUtil.click(High,"selecting risk appetite as high");
        TestUtil.sendKeys(EnterAmount, "80000","80,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void suitabilityPage3()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(Married,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Savings,"clicked on MarriedWithKids");
        TestUtil.click(Low,"selecting risk appetite as low");
        TestUtil.sendKeys(EnterAmount, "100000","100,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void suitabilityPage4()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(Single,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(WealthCreation,"clicked on MarriedWithKids");
        TestUtil.click(Low,"selecting risk appetite as low");
        TestUtil.sendKeys(EnterAmount, "500000","500,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
        } else {
            TestUtil.click(Femaleselected, "Female Gender Selected");
        }
    }

    public void profilePageForTataFortuneGuaranteePlus(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(dateselectTata,"2nd December 1992 Selected");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTEightYears,"8 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(1000);
    }

    public void profilePageForICICI(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1979");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("May");
        TestUtil.click(dateselectIcici,"5 March date select");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income Dropped down");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage1();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForHDFCSanchay(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1983");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Jul");
        TestUtil.click(dateselectHdfc,"18th July date selected");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForMaxSmartWealth(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1987");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Oct");
        TestUtil.click(dateselectMax,"10th october date selected");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage4();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForBALICPOS(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("2004");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(dateselectBalicPos,"2nd March 1980 date select");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage3();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTThirtyFiveYears,"35 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForLicNewJeevan(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Jun");
        TestUtil.click(dateselectLicNewJeevan,"24th june date select");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForLicJeevanLakshya(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1980");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Nov");
        TestUtil.click(dateselectLicJeevanLakhsya,"12th Nov 1980 date select");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void modifyTataFortune(){
        TestUtil.click(Modify,"Modify Button Clicked");
        TestUtil.click(Femaleselected,"Female Selected");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("2004");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(ModifiedDateSelect,"1st Dec 2022 date select");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
        WebCommands.staticSleep(2000);
        EnterAmount.clear();
        TestUtil.sendKeys(EnterAmount, "125000","1,25,000 Amount Entered for yearly frequency");
        WebCommands.staticSleep(2000);
        TestUtil.click(ModifiedPPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTwelveYears,"12 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        TestUtil.click(NextButton, "Next Button Pressed");
    }
}