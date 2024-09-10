package com.qa.pages.life;

import com.qa.commands.WebCommands;
import com.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.qa.base.TestBase.driver;

public class Term_Life_plan {
    public Term_Life_plan() {
        PageFactory.initElements(driver, this);
    }

    TestUtil tl = new TestUtil();
    LeadNamePage leadpage = new LeadNamePage();

    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id=\"Radio-F\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement yes;

    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement no;

    @FindBy(xpath = "//div[@class=\"sc-eqIVtm cCBzET\"]")
    WebElement approxAmount;

    @FindBy(xpath = "//li[text()='7 Lac to 10 Lac']")
    WebElement Amount_7to10lac;

    @FindBy(xpath = "//li[text()='10 Lac to 15 Lac']")
    WebElement Amount_10lacto15lac;


    @FindBy(xpath = "//span[text()='₹1 Crs']")
    WebElement sumassuredamt;

    @FindBy(xpath = "//li[text()='₹1.50 Crs']")
    WebElement sumassuredamt_1_5Crs;

    @FindBy(xpath = "//li[text()='₹1.25 Crs']")
    WebElement sumassuredamt_1_25Crs;

    @FindBy(xpath = "//li[text()='₹3 Crs']")
    WebElement sumassuredamt_3Crs;

    @FindBy(xpath = "//li[text()='₹3.05 Crs']")
    WebElement sumassuredamt_3_05Crs;


    @FindBy(id = "paymentFrequency")
    WebElement paymentFrequency;

    @FindBy(xpath = "//a[text()='Half-Yearly']")
    WebElement halfYearly;

    @FindBy(id = "coverAmount")
    WebElement coverAmount;

    @FindBy(xpath = "//a[text()='₹2 Crs']")
    WebElement coverAmt_2Crs;

    @FindBy(id = "maturityAge")
    WebElement maturityAge;

    @FindBy(xpath = "//a[text()='65 years']")
    WebElement maturityAge_65Yr;

    @FindBy(xpath = "//button[@id=\"premiumPaymentTerm\"]")
    WebElement premiumPaymentTerm;

    @FindBy(xpath = "//li[@data-auto='premiumPaymentTerm-dropdown-list-34']//a[text()='35 years']")
    WebElement premiumPaymentTerm_25yr;



    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calender;

    @FindBy(xpath = "(//input[@placeholder=\"Enter Date\"])[2]")
    WebElement calenderchild;

    @FindBy(xpath = "//select[@class=\"sc-iQKALj gwKrYD\"]")
    WebElement yearselect;

    @FindBy(xpath = "(//select[@class=\"sc-iQKALj gwKrYD\"])[2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, August 5th, 1992\"]")
    WebElement dateselect_5Aug;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 1985\"]")
    WebElement dateselect_1Dec;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 2002\"]")
    WebElement dateselect_1dec2002;

    @FindBy(xpath = "//div[@aria-label=\"Choose Saturday, January 1st, 2000\"]")
    WebElement dateselect_1jan2000;

    @FindBy(xpath = "//div[@aria-label='Choose Tuesday, October 15th, 1996']")
    WebElement dateselect_15joct1996;



    @FindBy(xpath = "//span[text()='Next']")
    WebElement next;

    @FindBy(xpath = "//div[@data-auto=\"modify-results\"]")
    WebElement modify;

    @FindBy(id = "proceed-btn")
    WebElement buyNowButton;

    @FindBy(xpath = "//input[@placeholder=\"Mr. / Ms. / Mrs.\"]")
    WebElement title;

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobilrNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;

    @FindBy(id = "insuredMemberMaritalStatus-uiSelect")
    WebElement maritalstatusDropdown;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//span[text()='Single']")
    WebElement single;

    @FindBy(xpath = "//button[@data-auto=\"Continue\"]")
    WebElement continu;

    @FindBy(xpath = "//button[@data-auto=\"submit-btn\"]")
    WebElement submit;

    @FindBy(xpath = "data-auto=\"proceed to payment-btn\"")
    WebElement ProceedToBuy;

    @FindBy(xpath = "//span[@class='title-text']")
    WebElement clickDownloads;

    @FindBy(xpath = "//span[@class='download-icon']//*[name()='svg']")
    WebElement BrochureDownload;

//    @FindBy(xpath = "//a[@ng-click=‘downloadFn(item)’]//span[@class=‘download-icon’]")
//    WebElement Benefit_Illustration;
    @FindBy(xpath = "//div[@ng-click='config.goToBenefitPage()']")   //new add
    WebElement Benefit_Illustration;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-TATAAIALI-Sampoorna Raksha Supreme (SRS)\"]")
    WebElement TataAIA;

    @FindBy(xpath = "//button[contains(@data-auto,'viewdetail-BAJAJLI-Smart Protect')]")
    //button[contains(@data-auto,'viewdetail-BAJAJLI-Smart Protect')]
    WebElement BajajAllianz;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-ICICIPRULI-iProtect Smart\"]")
    WebElement ICIC_ismart;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-MAXLIFELI-Smart Secure Plus\"]")
    WebElement Maxlife_smartSecure;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-HDFCLI-Click 2 Protect Life\"]")
    WebElement HdfcClick2_protectLife;


    @FindBy(xpath = "//input[@id='insuredMemberPlaceOfBirth']")
    WebElement PlaceofBirth;

    @FindBy(xpath = "//input[@id='insuredMemberFatherFName']")
    WebElement FathersFirstName;

    @FindBy(xpath = "//input[@id='insuredMemberFatherLName']")
    WebElement FathersLastName;

    @FindBy(xpath = "//input[@id='insuredMemberMotherFName']")
    WebElement MothersFirstName;

    @FindBy(xpath = "//input[@id='insuredMemberMotherLName']")
    WebElement MothersLastName;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisjammukashmirresident-no-radio']")
    WebElement JammuResidentNo;

    @FindBy(xpath = "//div[@id='insuredMemberOccupation-uiSelect']//span[@aria-label='Select box activate']")
    WebElement OccupationDropDown;

    @FindBy(xpath = "//div[@id='insuredMemberQualification-uiSelect']//span[@aria-label='Select box activate']")
    WebElement QualificationDropDown;

    @FindBy(xpath = "//span[contains(text(),'Salaried')]")
    WebElement OccupationSalaried;

    @FindBy(xpath = "//span[contains(text(),'Graduate')]")
    WebElement QualificationGraduate;

    @FindBy(xpath = "//input[@id='insuredMemberPanNumber']")
    WebElement PanNumber;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisaadhaarcardavailable-yes-radio']")
    WebElement AadharAvailableCheckBox;

    @FindBy(xpath = "//input[@id='insuredMemberAadhaarNumber']")
    WebElement AadharNumber;

    @FindBy(xpath = "//label[@data-auto='insuredmemberispoliticallyexposed-no-radio']")
    WebElement PoliticalExposedNo;

    @FindBy(xpath = "//label[@data-auto='insuredmemberhashistoryofconviction-no-radio']")
    WebElement NoCriminalRecord;

    @FindBy(xpath = "//label[@data-auto='insuredmemberishandicapped-no-radio']")
    WebElement  PhysicallyDisabled;


    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress1']")
    WebElement AddressLine1;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress2']")
    WebElement AddressLine2;

    @FindBy(xpath = "//div[@id='insuredMemberRegisteredPinCode-uiSelect']//span[@aria-label='Select box activate']")
    WebElement PinCodeClick;

    @FindBy(xpath = "//input[@placeholder='Enter 6 digit Pincode']")
    WebElement PinCodeEnter;

    @FindBy(xpath = "//span[text()='Mumbai, Maharashtra']")
    WebElement MumbaiSelect;

    @FindBy(xpath = "//label[@class='checkout-checkbox flex layout-row']")
    WebElement SameAsRegisteredCheckBox;

    @FindBy(xpath = "//input[@placeholder='Mr. / Ms. / Mrs.']")
    WebElement TitleNominee;

    @FindBy(xpath = "//span[text()='Mr.']")
    WebElement NomineeMrSelect;

    @FindBy(xpath = "//input[@id='nomineeFName']")
    WebElement NomineeFname;

    @FindBy(xpath = "//input[@id='nomineeLName']")
    WebElement NomineeLName;

    @FindBy(xpath = "//input[@id='nomineeDOB-datepicker']")
    WebElement NomineeDOBDropDown;

    @FindBy(xpath = "//td[@data-handler='selectDay']")
    WebElement DateSelect;

    @FindBy(xpath = "//input[@id='nomineePlaceOfBirth']")
    WebElement nomineePlaceofBirth;

    @FindBy(xpath = "//div[@id='nomineeMaritalStatus-uiSelect']//span[@aria-label='Select box activate']")
    WebElement NomineeMaritalStatus;

    @FindBy(xpath = "//span[text()='Single']")
    WebElement NomineeSingle;

    @FindBy(xpath = "//div[contains(@placeholder,'Select relationship')]//span[contains(@aria-label,'Select box activate')]")
    WebElement NomineeisMy;

    @FindBy(xpath = "//span[text()='Brother']")
    WebElement Brother;

    @FindBy(xpath = "//input[@id='nomineeFatherFName']")
    WebElement nomineeFatherFname;

    @FindBy(xpath = "//input[@id='nomineeFatherLName']")
    WebElement nomineeFatherLname;

    @FindBy(xpath = "//input[@id='nomineeRegisteredAddress1']")
    WebElement nomineeRegisteredAddress1;

    @FindBy(xpath = "//input[@id='nomineeRegisteredAddress2']")
    WebElement nomineeRegisteredAddress2;

    @FindBy(xpath = "//span[@class='ui-select-placeholder text-muted ng-binding']")
    WebElement NomineePinCodeClick;

    @FindBy(xpath = "//input[@placeholder='Enter 6 digit Pincode']")
    WebElement NomineePinCodeEnter;

    @FindBy(xpath = "//span[text()='Mumbai, Maharashtra']")
    WebElement NomineeMumbai;
    @FindBy(xpath = "//label[text()=' Critical Illness - 22 Illness ']/preceding-sibling::input[@type='checkbox']")
    WebElement MaxRider;


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
    }

    public void smoke_chewTobaco(String yesNo) {
        WebCommands.staticSleep(500);
        if (yesNo == "yes") {
            TestUtil.click(yes, "Yes Selected");
        } else
            TestUtil.click(no, "No Selected");
    }

    public void datepicker(String year,String Month, WebElement Date) {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(Month);
        WebCommands.staticSleep(1000);
        TestUtil.click(Date, "5 aug date select");
        WebCommands.staticSleep(1000);
    }

    public void datepickerChild(String year,String Month, WebElement Date) {
        TestUtil.click(calenderchild, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(Month);
        WebCommands.staticSleep(1000);
        TestUtil.click(Date, "Date select");
        WebCommands.staticSleep(1000);
    }

    public void modifylow() {
        TestUtil.click(modify, "modify clicked");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(7000);
    }
    public void modifylowNew() {
        TestUtil.click(modify, "modify clicked");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(7000);
    }
    public void checkout() {
      //  TestUtil.sendKeys(title, "mr", "");
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(maritalstatusDropdown, "next button click");
        TestUtil.click(married, "married click");
        TestUtil.click(continu, "Continue button click");
    }

    public void checkoutDownloadsFunctionality(){
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
    public void downloadsFunctionalityPDP(){
        WebCommands.staticSleep(2000);
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        WebCommands.staticSleep(10000);
        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }
    public void downloadsFunctionalityPDPtata(){
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        WebCommands.staticSleep(10000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();

//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);
    }
    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        TestUtil.click(continu,"continye clicked");
        WebCommands.staticSleep(10000);

        TestUtil.getScreenShot();
    }

    public void Submit_ProceedToBuy() {
        WebCommands.staticSleep(6000);
       TestUtil.click(submit,"submit button clicked");
        WebCommands.staticSleep(3000);
       TestUtil.click(ProceedToBuy,"Proceed To Buy clicked");

    }

    public void HdfcCheckOut(){
        TestUtil.sendKeys(lastname, "Test", "Name Entered");
        TestUtil.sendKeys(PlaceofBirth, "amerika","Place of Birth Entered");
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        TestUtil.click(single, "single clicked");
        TestUtil.sendKeys(FathersFirstName,"random","Father First Name entered");
        TestUtil.sendKeys(FathersLastName,"last","Father Last Name entered");
        TestUtil.sendKeys(MothersFirstName,"mother","Mothers First Name Entered");
        TestUtil.sendKeys(MothersLastName,"mother","Mothers Last Name Entered");
        TestUtil.click(JammuResidentNo,"Not a Jammu Resident Selected");
        TestUtil.click(OccupationDropDown,"Occupation Dropped Down");
        TestUtil.click(OccupationSalaried,"Salaried selected");
        TestUtil.click(QualificationDropDown,"Qualification Dropped Down");
        TestUtil.click(QualificationGraduate,"Graduate selected");
        TestUtil.sendKeys(PanNumber,"AWQER1233R","Pan Number Entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(AadharAvailableCheckBox, "Aadhar Radio Button Yes Pressed");
        TestUtil.sendKeys(AadharNumber,"443211234321","Aadhar Number Entered");
        TestUtil.click(PoliticalExposedNo, "Not Politically Exposed");
        TestUtil.click(NoCriminalRecord, "No Criminal Record");
        TestUtil.click(PhysicallyDisabled, "No physically diabled Record");
        TestUtil.sendKeys(AddressLine1,"jkh","Address Line 1 Entered");
        TestUtil.sendKeys(AddressLine2,"jhkh","Address Line 2 Entered");
        TestUtil.click(PinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(PinCodeEnter,"400011","Pin Entered");
        TestUtil.click(MumbaiSelect,"Mumbai Maharashtra Selected");
        TestUtil.click(SameAsRegisteredCheckBox,"Same as Registered Address Clicked");
        TestUtil.click(continu,"Continue Press after filling details");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(TitleNominee,"Mr","Mr Selected");
        TestUtil.click(NomineeMrSelect,"Nominee Mr Selected");
        TestUtil.sendKeys(NomineeFname,"Fname","Nominee Fname entered");
        TestUtil.sendKeys(NomineeLName,"Lname","Nominee LName entered");
        TestUtil.click(NomineeDOBDropDown,"Calendar opened");
        TestUtil.click(DateSelect, "Date Selected");
        TestUtil.sendKeys(nomineePlaceofBirth, "AbcD", "Nominee Place of Birth Entered");
        TestUtil.click(NomineeMaritalStatus,"Nominee Marital Status Dropped Down");
        TestUtil.click(NomineeSingle, "Single Selected");
        TestUtil.click(NomineeisMy,"Nominee is my drop down opened");
        TestUtil.click(Brother,"Brother Selected");
        TestUtil.sendKeys(nomineeFatherFname, "NFname","Nominee Father First Name");
        TestUtil.sendKeys(nomineeFatherLname,"NLname","Nominee Father Last Name");
        TestUtil.sendKeys(nomineeRegisteredAddress1,"random address","Registered Address 1");
        TestUtil.sendKeys(nomineeRegisteredAddress2,"random address2","Registered Address 2");
        TestUtil.click(NomineePinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(NomineePinCodeEnter,"400055","Pin Entered");
        TestUtil.click(NomineeMumbai,"Mumbai Maharashtra Selected");
        TestUtil.click(continu,"Final Continue Pressed");
    }

    public void TataSRSLifeProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("male");
        smoke_chewTobaco("yes");
        datepicker("1992", "Aug", dateselect_5Aug);
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());

    }
    public void TataLifeResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        WebCommands.staticSleep(10000);
        TestUtil.click(TataAIA, "view button TataAIA click");
        TestUtil.getFullPageScreenShot();
//        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
//        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        downloadsFunctionalityPDPtata();
        WebCommands.staticSleep(10000);
        js.executeScript("arguments[0].click();", buyNowButton);

       // checkoutDownloadsFunctionality();

        String parent = driver.getWindowHandle();
       //TestUtil.click(buyNowButton, "buy Now Button click");
        WebCommands.staticSleep(6000);
        TestUtil.waitElementToBeClickable(Benefit_Illustration);


        WebCommands.staticSleep(1000);
        driver.switchTo().window(parent);


    }

    public void BajajSmartProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("female");
        smoke_chewTobaco("no");
        datepicker("1985", "Dec", dateselect_1Dec);
        TestUtil.click(approxAmount, "");
        TestUtil.click(Amount_7to10lac, "7 to 10 lac amount select");
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_1_5Crs, "sum assured amt 1.5 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());
    }
    public void BajajSmartResultPage() throws InterruptedException, IOException {

        leadpage.GotItButton();
        TestUtil.JsClick(paymentFrequency,"");
        TestUtil.click(halfYearly,"Half yearly selected");
    //    TestUtil.click(coverAmount,"");
        //WebCommands.staticSleep(6000);
       // TestUtil.click(coverAmt_2Crs, "Cover amount 2 Cr is selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(maturityAge,"");
        TestUtil.click(maturityAge_65Yr,"Maturity Age 65 is selected");
        WebCommands.staticSleep(2000);
      //  TestUtil.click(premiumPaymentTerm,"");
        WebCommands.staticSleep(3000);
     //   TestUtil.click(premiumPaymentTerm_25yr,"Premium payment term year 25 is selected");
      TestUtil.waitElementToBeClickable(BajajAllianz);
        TestUtil.JsClick(BajajAllianz,"");
      TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", buyNowButton);
        // TestUtil.click(buyNowButton, "buy Now Button click");
        WebCommands.staticSleep(5000);
        checkoutDownloadsFunctionality();
    }

    public void IcicProfile() throws InterruptedException {
        GenderButtonClick("male");
        smoke_chewTobaco("yes");
        datepicker("2002", "Dec", dateselect_1dec2002);
        TestUtil.click(approxAmount, "");
        TestUtil.click(Amount_10lacto15lac, "10 to 15 lac amount select");
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_1_25Crs, "sum assured amt 1.25 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());
    }
    public void IcicResult() throws InterruptedException, IOException {

        leadpage.GotItButton();
        modifylow();
        TestUtil.click(ICIC_ismart, "view button TataAIA click");
        TestUtil.getFullPageScreenShot();
//        TestUtil.click(buyNowButton, "buy Now Button click");
//        checkout();
//        checkmarks();
//        WebCommands.staticSleep(10000);
//        TestUtil.getScreenShot();
    }
    public void MaxlifeProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("male");
        smoke_chewTobaco("yes");
        datepicker("2000", "Jan", dateselect_1jan2000);
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_3Crs, "sum assured amt 1.25 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());

    }
    public void MaxlifeResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        modifylow();
        WebCommands.staticSleep(5000);
        TestUtil.waitUntilElementToBeVisible(By.xpath("//div[text()='Certified']"));
        TestUtil.click(MaxRider,"rider selected");
        TestUtil.waitUntilElementToBeVisible(By.xpath("//div[text()='IRDA']"));
        WebCommands.staticSleep(3000);
        TestUtil.JsClick(Maxlife_smartSecure, "view button maxlife click");
        TestUtil.getFullPageScreenShot();
//      TestUtil.click(buyNowButton, "buy Now Button click");
//        checkout();
//        checkmarks();
//        WebCommands.staticSleep(10000);
//        TestUtil.getScreenShot();
    }

    public void HdfcClick_2ProfilePage() throws InterruptedException {
        GenderButtonClick("female");
        smoke_chewTobaco("yes");
        datepicker("1996", "Oct", dateselect_15joct1996);
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_3_05Crs, "sum assured amt 3.05 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());
    }
    public void HdfcClick_2ResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        WebCommands.staticSleep(10000);

        if(HdfcClick2_protectLife.isDisplayed()) {
            System.out.println("if code ran");
            TestUtil.click(HdfcClick2_protectLife, "Hdfc Sanchay Plan Selected");

        }
        else{
            System.out.println("else code ran");
            WebCommands.staticSleep(3000);
            TestUtil.click(maturityAge,"");
            WebCommands.staticSleep(1000);
            TestUtil.click(maturityAge_65Yr,"Maturity Age 65 is selected");
            WebCommands.staticSleep(10000);
            TestUtil.click(HdfcClick2_protectLife, "Hdfc Sanchay Plan Selected");
        }

        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", buyNowButton);
        checkoutDownloadsFunctionality();
    }
}