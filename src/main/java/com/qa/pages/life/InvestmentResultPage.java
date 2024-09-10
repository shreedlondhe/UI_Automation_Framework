package com.qa.pages.life;

import com.qa.base.TestBase;
import com.qa.commands.WebCommands;
import com.qa.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class InvestmentResultPage extends TestBase {

    public InvestmentResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Fortune Guarantee']")

    WebElement TataFortuneGuarantee;

    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Fortune Guarantee Plus']")

    WebElement TataFortuneGuaranteePlus;
    @FindBy(xpath = "//button[@data-auto='viewdetail-ICICIPRULI-Savings Suraksha - Regular Pay']")
    WebElement IciciPruRegular;

    @FindBy(xpath = "//button[@data-auto='viewdetail-BAJAJLI-POS Goal Suraksha']")
    WebElement BalicPOS;

    @FindBy(xpath = "//button[@data-auto='viewdetail-HDFCLI-Sanchay Plus']")
    WebElement HdfcSanchay;

    @FindBy(xpath = "//button[@data-auto='viewdetail-MAXLIFELI-Smart Wealth Plan']")
    WebElement MaxSmartWealth;

    @FindBy(xpath = "//button[@data-auto='viewdetail-LICLI-New Jeevan Anand']")
    WebElement LicNewJeevan;

    @FindBy(xpath = "//button[@data-auto='viewdetail-LICLI-Jeevan Lakshya']")
    WebElement LicJeevanLakshya;

    @FindBy(xpath = "//button[@id='proceed-btn']")
    WebElement CommonBuyNowBtn;

    @FindBy(xpath = "//span[@class='title-text']")
    WebElement clickDownloads;

    @FindBy(xpath = "//span[@class='download-icon']//*[name()='svg']")
    WebElement BrochureDownload;


    public void downloadsFunctionalityPDP(){
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        //WebCommands.staticSleep(4000);

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


    public void downloadsFunctionalityPDPTATAINVESTMENT(){
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        //WebCommands.staticSleep(4000);

//        WebCommands.staticSleep(10000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//
//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);
    }
    public void windowSwitch(){
        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
       // String c=it.next();

      //  driver.switchTo().window(c);
       // driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
        WebCommands.staticSleep(3000);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void TataFortuneGuaranteePlan() throws IOException {
        WebCommands.staticSleep(7000);
        TestUtil.click(TataFortuneGuarantee,"Tata Fortune Guarantee Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }
    public void TataFortuneGuaranteePlanPlus() throws IOException {
        WebCommands.staticSleep(7000);
        TestUtil.click(TataFortuneGuaranteePlus,"Tata Fortune Guarantee Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDPTATAINVESTMENT();
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }


    public void IciciPrudentialPlan() throws IOException {
        TestUtil.click(IciciPruRegular,"Icici Pru Regular Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
//        downloadsFunctionalityPDP();
//        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
//        WebCommands.staticSleep(3000);
    }

    public void HdfcSanchayPlan() throws IOException {

        WebCommands.staticSleep(10000);
        if(HdfcSanchay.isDisplayed()) {
            TestUtil.click(HdfcSanchay, "Hdfc Sanchay Plan Selected");
        }
        else{
            driver.navigate().refresh();
            TestUtil.click(HdfcSanchay, "Hdfc Sanchay Plan Selected");
        }
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        windowSwitch();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void MaxSmartWealthPlan() throws IOException {
        TestUtil.click(MaxSmartWealth,"Max Smart Wealth Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
//        downloadsFunctionalityPDP();
//        windowSwitch();
//        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
//        WebCommands.staticSleep(3000);
    }

    public void BalicPOS() throws IOException {
        TestUtil.click(BalicPOS,"Bajaj Allians POS Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void LicNewJeevanPlan() throws IOException {
        TestUtil.click(LicNewJeevan,"Lic New Jeevan Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void LicJeevanLakshyaPlan() throws IOException {
        TestUtil.click(LicJeevanLakshya,"Tata Fortune Guarantee Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

}
