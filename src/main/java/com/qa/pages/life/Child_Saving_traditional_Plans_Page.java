package com.qa.pages.life;

import com.qa.base.TestBase;
import com.qa.commands.WebCommands;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Child_Saving_traditional_Plans_Page extends TestBase {

    public Child_Saving_traditional_Plans_Page() {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//label[@id='Radio-M']")
    WebElement male;

    @FindBy(xpath = "//label[@id='Radio-F']")
    WebElement female;
    @FindBy(xpath = "//input[@placeholder='Enter Date']")
    WebElement calender1;
    @FindBy(xpath = "(//input[@placeholder='Enter Date'][@class='sc-eNQAEJ jyGtOU'])[2]")
    WebElement calender2;

    @FindBy(xpath = "//span[text()='Select annual income']")
    WebElement click_annual_income ;

    @FindBy(xpath = "//div[@class='sc-eqIVtm cCBzET']")
    WebElement click_annual_income_modify ;

    @FindBy(xpath = "//li[text()='5 lakhs']")
    WebElement annual_income_5lakh ;

    @FindBy(xpath = "//li[text()='10 lakhs']")
    WebElement annual_income_10lakh ;

    @FindBy(xpath = "//li[text()='7 lakhs']")
    WebElement annual_income_7lakh ;

    @FindBy(xpath = "//span[text()='Back']")
    WebElement back_btn ;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement next_btn ;

    @FindBy(xpath = "//span[text()='Yearly']")
    WebElement yearly ;

    @FindBy(xpath = "//li[text()=\"Half-Yearly\"]")
    WebElement halfyearly ;

    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement amount ;


    @FindBy(xpath = "//li[text()='10 years']")
    WebElement invest_for_ppt_10yr ;

    @FindBy(xpath = "//li[text()='12 years']")
    WebElement invest_for_ppt_12yr ;


    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement got_it ;

    @FindBy(xpath = "//button[text()='OK, GOT IT!']")
    WebElement ok_got_it ;
    @FindBy(xpath = "//div[@class=\"sc-eqIVtm cCBzET\"]//following::span[text()='Select frequency']")
    WebElement invest_for_ppt ;

    @FindBy(xpath = "(//div[@class='sc-eqIVtm cCBzET'])[2]")
    WebElement invest_for_ppt_modify ;

    @FindBy(xpath = "//input[@name='customerName']")
    WebElement leadName ;

    @FindBy(xpath = "//input[@name='customerName']")
    WebElement calender ;

    @FindBy(xpath = "//select[@class='sc-iQKALj gwKrYD'][1]")
    WebElement year ;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 1985\"]")
    WebElement date ;

    @FindBy(xpath = "//div[@aria-label=\"Choose Monday, December 1st, 1980\"]")
    WebElement date_icici ;
    @FindBy(xpath = "//div[@aria-label=\"Choose Saturday, December 1st, 1990\"]")
    WebElement date_modify ;

    @FindBy(xpath = "//div[@aria-label=\"Choose Thursday, December 1st, 2022\"]")
    WebElement date1 ;

    @FindBy(xpath = "//div[@aria-label=\"Choose Saturday, December 8th, 2012\"]")
    WebElement datechildmodify ;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, May 1st, 2016\"]")
    WebElement datechildicici ;
    @FindBy(xpath = "//select[@class='sc-iQKALj gwKrYD'][2]")
    WebElement month ;
    @FindBy(xpath = "//span[text()='Modify']")
    WebElement modify ;

    @FindBy(xpath = "//span[@class='title-text']")
    WebElement clickDownloads;

    @FindBy(xpath = "//span[@class='download-icon']//*[name()='svg']")
    WebElement BrochureDownload;
    @FindBy(xpath = "//span[text()='Benefit Illustration ']")
    WebElement Benefit_Illustration ;

    @FindBy(xpath = "//input[@name='insuredMemberLName']")
    WebElement lastName ;

    @FindBy(xpath = "//input[@name='insuredMemberMobile']")
    WebElement mobile ;

    @FindBy(xpath = "//input[@name='insuredMemberEmail']")
    WebElement email ;

    @FindBy(xpath = "//div[@class='desktop-search mobileKeyPadEnter ui-select-container ui-select-bootstrap dropdown ng-pristine ng-scope ng-empty ng-invalid ng-invalid-required ng-touched']//span[@aria-label='Select box activate']")
    WebElement maritalstatus ;

    @FindBy(xpath = "//span[text()='Divorced']")
    WebElement divorsed ;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement Continue ;

    @FindBy(xpath = "(//button[text()='Buy Now'])[2]")
    WebElement Buynow ;
    @FindBy(xpath = "//span[text()='See all Plans']")
    WebElement seeallplans ;

    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Fortune Guarantee']")
    WebElement viewdetailstata ;

    @FindBy(xpath = "//button[@data-auto='viewdetail-ICICIPRULI-Savings Suraksha - Limited Pay']")
    WebElement viewdetailsicici ;

    @FindBy(xpath = "//button[@data-auto='viewdetail-ICICIPRULI-Guaranteed Income For Tomorrow(Long Term)']")
    WebElement viewdetailsiciciGiftLt ;


    @FindBy(xpath = "(//span[@class ='checkmark'])[1]")
    WebElement checkmark1 ;

    @FindBy(xpath = "(//span[@class ='checkmark'])[2]")
    WebElement checkmark2 ;

    @FindBy(xpath = "(//button[text() ='Submit and Proceed'])[1]")
    WebElement submitandproceed ;
//button[@ng-click='downloadBI()']

    @FindBy(xpath = "//button[@ng-click='downloadBI()']")
    WebElement DownloadBI ;
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
    @FindBy(xpath = "//li[text()='Child Education']")
    WebElement ChildEducation;
    @FindBy(xpath = "//li[text()='Child Marriage']")
    WebElement ChildMarriage;
    @FindBy(xpath = "//li[text()='Medium']")
    WebElement Medium;
    @FindBy(xpath = "//span[text()='Low']")
    WebElement Low;
    @FindBy(xpath = "//span[text()='High']")
    WebElement High;
//    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
//    WebElement EnterAmountSutabolity;
    @FindBy(xpath = "//span[text()='Next']")
     WebElement NextButton;
    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement EnterAmount;
    public  void suitabilityPage1()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(MarriedWithKids,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(ChildEducation,"clicked on ChildEducation");

        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void suitabilityPage2()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(NearRetirement,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(ChildMarriage,"clicked on MarriedWithKids");
        TestUtil.click(High,"selecting risk appetite as high");
        TestUtil.sendKeys(EnterAmount, "80000","80,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }

public void DownloadBI(){
    WebCommands.staticSleep(2000);
    DownloadBI.click();
    WebCommands.staticSleep(2000);
}
    public void enterlastName(){
        TestUtil.sendKeys(lastName,"xyz","last name entered");
        WebCommands.staticSleep(2000);
    }
    public void entermobilenumber(){
        TestUtil.sendKeys(mobile,"9999999999","mobile no entered");
        WebCommands.staticSleep(2000);
    }
    public void enteremail(){
        TestUtil.sendKeys(email,"xyz.xyz@xyz.xyz","email entered");
        WebCommands.staticSleep(2000);
    }
    public void selectmaritalStatus(){
        WebCommands.staticSleep(2000);
        TestUtil.click(maritalstatus,"clicked on marital status");
        WebCommands.staticSleep(3000);
        TestUtil.click(divorsed,"selected divorsed");

    }



    public void Date_picker(String yearname) {
        TestUtil.click(calender1,"clicked on calender");
        WebCommands.staticSleep(2000);
        Select years = new Select(year);
        WebCommands.staticSleep(2000);
        years.selectByValue(yearname);
        WebCommands.staticSleep(2000);
        Select months = new Select(month);
        WebCommands.staticSleep(2000);
        months.selectByVisibleText("Dec");
        WebCommands.staticSleep(2000);
        TestUtil.click(date,"1 dec date select");
        WebCommands.staticSleep(2000);


    }
    public void Date_picker_modify(String yearname) {
        TestUtil.click(calender1,"clicked on calender");
        WebCommands.staticSleep(2000);
        Select years = new Select(year);
        WebCommands.staticSleep(2000);
        years.selectByValue(yearname);
        WebCommands.staticSleep(2000);
        Select months = new Select(month);
        WebCommands.staticSleep(2000);
        months.selectByVisibleText("Dec");
        WebCommands.staticSleep(2000);
        TestUtil.click(date_modify,"1 dec date select");
        WebCommands.staticSleep(2000);


    }

    public void Date_picker_ICICI(String yearname) {
        TestUtil.click(calender1,"clicked on calender");
        WebCommands.staticSleep(2000);
        Select years = new Select(year);
        WebCommands.staticSleep(2000);
        years.selectByValue(yearname);
        WebCommands.staticSleep(2000);
        Select months = new Select(month);
        WebCommands.staticSleep(2000);
        months.selectByVisibleText("Dec");
        WebCommands.staticSleep(2000);
        TestUtil.click(date_icici,"1 dec date select");
        WebCommands.staticSleep(2000);


    }
    public void Date_picker_child(String yearname) {
        TestUtil.click(calender2,"clicked on calender");
        WebCommands.staticSleep(2000);
        Select years = new Select(year);
        WebCommands.staticSleep(2000);
        years.selectByValue(yearname);
        WebCommands.staticSleep(2000);
        Select months = new Select(month);
        WebCommands.staticSleep(2000);
        months.selectByVisibleText("Dec");
        WebCommands.staticSleep(2000);
        TestUtil.click(date1,"1 dec date select");
        WebCommands.staticSleep(2000);
    }

    public void Date_picker_child_modify(String yearname) {
        TestUtil.click(calender2,"clicked on calender");
        WebCommands.staticSleep(2000);
        Select years = new Select(year);
        WebCommands.staticSleep(2000);
        years.selectByValue(yearname);
        WebCommands.staticSleep(2000);
        Select months = new Select(month);
        WebCommands.staticSleep(2000);
        months.selectByVisibleText("Dec");
        WebCommands.staticSleep(2000);
        TestUtil.click(datechildmodify,"8 dec date select");
        WebCommands.staticSleep(2000);
    }
    public void Date_picker_child__ICICI(String yearname) {
        TestUtil.click(calender2,"clicked on calender");
        WebCommands.staticSleep(2000);
        Select years = new Select(year);
        WebCommands.staticSleep(2000);
        years.selectByValue(yearname);
        WebCommands.staticSleep(2000);
        Select months = new Select(month);
        WebCommands.staticSleep(2000);
        months.selectByVisibleText("May");
        WebCommands.staticSleep(2000);
        TestUtil.click(datechildicici,"1 may date select");
        WebCommands.staticSleep(2000);
    }
    public void annualIncome() {
       TestUtil.click(click_annual_income, "income selected entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(annual_income_5lakh, "income selected entered");
    }
    public void annualIncomeModify() {
        TestUtil.click(click_annual_income_modify, "income selected entered");
        WebCommands.staticSleep(5000);
        TestUtil.click(annual_income_10lakh, "income selected entered");
    }

    public void annualIncomeICICI() {
        TestUtil.click(click_annual_income, "income selected entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(annual_income_7lakh, "income selected entered");
    }
    public void back_next() {
        TestUtil.click(back_btn,"back button clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(next_btn,"next button clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(next_btn,"next button clicked");
    }


    public void downloadsFunctionalityPDPTATA(){
        WebCommands.staticSleep(3000);
        try {
            TestUtil.getFullPageScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }

    public void downloadsFunctionalityPDPICICI(){
        WebCommands.staticSleep(3000);
        try {
            TestUtil.getFullPageScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");

//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//
//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
 //       driver.switchTo().window(p);
    }
        public void tell_us_about_the_Insured() {

        TestUtil.click(male, "gender selected" );
        WebCommands.staticSleep(2000);
        Date_picker("1985");
        WebCommands.staticSleep(2000);
        annualIncome();
        Date_picker_child("2022");
        TestUtil.click(next_btn, "next selected" );
    }
    public void tell_us_about_the_Insured_ICICI() {

        TestUtil.click(female, "gender selected" );
        WebCommands.staticSleep(2000);
        Date_picker_ICICI("1980");
        WebCommands.staticSleep(2000);
        annualIncomeICICI();
        Date_picker_child__ICICI("2016");
        TestUtil.click(next_btn, "next selected" );
    }

    public void Select_the_Sum_Assured_Amount(String enteramount) {
        WebCommands.staticSleep(2000);
        suitabilityPage1();
        WebCommands.staticSleep(2000);

        TestUtil.clear(amount,"amount cleared");
        WebCommands.staticSleep(2000);

        TestUtil.sendKeys(amount,enteramount,"amount entered");
        WebCommands.staticSleep(2000);

        TestUtil.click(invest_for_ppt,"clicked on ppt invest");
        WebCommands.staticSleep(2000);

        TestUtil.click(invest_for_ppt_10yr,"clicked on ppt invest 10 yr");
        WebCommands.staticSleep(2000);

       back_next();

    }

    public void Select_the_Sum_Assured_Amount_modify(String enteramount) {
        WebCommands.staticSleep(2000);
        suitabilityPage2();
        WebCommands.staticSleep(2000);
        TestUtil.click(yearly,"clicked on (yearly) premium frequency");
        WebCommands.staticSleep(2000);
        TestUtil.click(halfyearly,"selected halfyearly premium frequency");
        WebCommands.staticSleep(2000);
        TestUtil.clear(amount,"amount cleared");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(amount,enteramount,"amount entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(invest_for_ppt_modify,"clicked on ppt invest");
        WebCommands.staticSleep(2000);
        TestUtil.click(invest_for_ppt_12yr,"clicked on ppt invest 12 yr");
        WebCommands.staticSleep(2000);
        back_next();
    }


    public void Save_your_quote_now(String enterleadname) {
        WebCommands.staticSleep(2000);
        TestUtil.clear(leadName,"leadname cleared");
        WebCommands.staticSleep(2000);
        TestUtil.click(leadName,"lead name selected");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(leadName,enterleadname,"leadname entered");
        WebCommands.staticSleep(2000);
        back_next();

    }
    public void gotIt() {
        WebCommands.staticSleep(7000);
        TestUtil.JsClick(ok_got_it, "ok GotIt is clicked");
        WebCommands.staticSleep(7000);
        TestUtil.JsClick(got_it, "GotIt is clicked");
    }

    public void check_modify_functionality() {
        TestUtil.click(modify,"clicked on modify cta");
        TestUtil.click(female,"gender female selected");
        WebCommands.staticSleep(2000);
        Date_picker_modify("1990");
        annualIncomeModify();
        Date_picker_child_modify("2012"); //
        TestUtil.click(next_btn,"next cta clicked");
        Select_the_Sum_Assured_Amount_modify("100000");
        Save_your_quote_now("ashish");
        //TestUtil.fullpagescreenshot();

    }

    public void viewdetailstata(){
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(viewdetailstata,"clicked on viewdetails");
        WebCommands.staticSleep(2000);
        //TestUtil.fullpagescreenshot();
    }
    public void viewdetailsicici(){
        TestUtil.JsClick(viewdetailsicici,"clicked on viewdetails");
        WebCommands.staticSleep(2000);
        //TestUtil.fullpagescreenshot();
    }
    public void viewdetailsiciciGiftLt(){
        TestUtil.JsClick(viewdetailsiciciGiftLt,"clicked on viewdetails");
        WebCommands.staticSleep(2000);
        //TestUtil.fullpagescreenshot();
    }
    public void BuyNow(){
        WebCommands.staticSleep(3000);
        //TestUtil.fullpagescreenshot();
        WebCommands.staticSleep(2000);
        TestUtil.click(Buynow,"clicked on buy now");
        WebCommands.staticSleep(2000);

    }

    public void seeallplansicici(){
       TestUtil.JsClick(seeallplans,"clicked on see all plans");
        WebCommands.staticSleep(2000);
        //TestUtil.fullpagescreenshot();
        viewdetailsicici();
    }

    public void seeallplansiciciGiftLt(){
        WebCommands.staticSleep(4000);
       // TestUtil.click(seeallplans,"clicked on see all plans");
        TestUtil.JsClick(seeallplans,"clicked on see all plans");
        WebCommands.staticSleep(2000);
        //TestUtil.fullpagescreenshot();
        viewdetailsiciciGiftLt();
    }
    public void seeallplanstata(){
        TestUtil.JsClick(seeallplans,"clicked on see all plans");
        WebCommands.staticSleep(2000);
        //TestUtil.fullpagescreenshot();
        viewdetailstata();
    }


    public void checkoutDownloadsFunctionalityOfLife(){

        TestUtil.click(Benefit_Illustration,"Clicked on download Benefit Illustration");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }

    public void checkoutPage(){
        enterlastName();
        entermobilenumber();
        enteremail();
       // selectmaritalStatus();
        TestUtil.click(Continue,"clicked on continue");
    }

    public void submitandProceed(){

        WebCommands.staticSleep(3000);
    TestUtil.click(checkmark1,"checkmark1 selected");
        WebCommands.staticSleep(3000);
    TestUtil.click(checkmark2,"checkmark2 selected");
    WebCommands.staticSleep(2000);
    TestUtil.click(submitandproceed,"clicked on submit and proceed");
    WebCommands.staticSleep(4000);
    TestUtil.getScreenShot();
    }




    }








