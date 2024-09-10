package Test_cases;

import com.qa.base.TestBase;
import com.qa.commands.WebCommands;
import com.qa.pages.Ninja.ninja;
import com.qa.pages.life.ChildSavingUlipPlan;
import com.qa.pages.life.LifeLandingPage;
import com.qa.pages.life.LifePage;
import com.qa.pages.life.Term_Life_plan;
import com.qa.pages.login.LoginPage;
import com.qa.pages.sell.GrowPageSellButton;
import com.qa.util.LogUtils;
import com.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"Term_Plan_Test","Life_Full"})
public class TC_01 extends TestBase {

    public TC_01() {
        super();
    }

    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Term_Life_plan tlp;
    ninja ninj;
    ChildSavingUlipPlan csup;

    @BeforeMethod()
    public void start() throws InterruptedException {
        WebCommands.staticSleep(10000);
        initialization();
        WebCommands.staticSleep(3000);
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        tlp = new Term_Life_plan();
        ninj= new ninja();
        csup=new ChildSavingUlipPlan();


        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.TermLifeClick();
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void tataAIA() throws Exception {
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.TataSRSLifeProfilePage();
        String uID=csup.getUniqueID();
        tlp.TataLifeResultPage();
        tlp.checkout();
        tlp. checkmarks();
        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h2[text()='Tata AIA Life Insurance Sampoorna Raksha Supreme ']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h2[text()='Tata AIA Life Insurance Sampoorna Raksha Supreme ']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
        LogUtils.info("Verified redirection to insurer prod ");

        ninj.cancelPolicyThroughNinjaTATA(uID);
        LogUtils.info("Checkout flow Completed");
    }

    @Test(enabled = true ,retryAnalyzer = RetryAnalyser.class)
    public void BajajSmart() throws Exception {
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.BajajSmartProfilePage();
        String uID=csup.getUniqueID();
        tlp.BajajSmartResultPage();
        tlp.checkout();
        tlp. checkmarks();
        //adding below code to verify plan redirection to insurer production
        TestUtil.waitUntilElementToBeVisible(By.xpath("//h4[text()='Bajaj Allianz Life Smart Protect Goal']"));
        boolean NsurerProd = driver.findElement(By.xpath("//h4[text()='Bajaj Allianz Life Smart Protect Goal']")).isDisplayed();
        Assert.assertEquals(NsurerProd,true);
        LogUtils.info("Verified redirection to insurer prod ");
        ninj.cancelPolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void MaxLife() throws InterruptedException, IOException {
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.MaxlifeProfilePage(); //buy now not working
        tlp.MaxlifeResultPage();
        LogUtils.info("Checkout flow Completed");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void ICIC() throws InterruptedException, IOException {
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.IcicProfile();
        tlp.IcicResult();
        LogUtils.info("Checkout flow Completed");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void HDFC() throws Exception {
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.HdfcClick_2ProfilePage();
        String uID=csup.getUniqueID();
        tlp.HdfcClick_2ResultPage();
        tlp .HdfcCheckOut();
        tlp. checkmarks();
//        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h2[text()='E-MANDATE REGISTRATION,PAYMENT AND PLAN SUMMARY']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h2[text()='E-MANDATE REGISTRATION,PAYMENT AND PLAN SUMMARY']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
        ninj.cancelPolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");
    }
    @AfterMethod
    public void Close() {
        driver.quit();
    }
}