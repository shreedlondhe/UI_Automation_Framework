package com.qa.pages.login;

import com.qa.base.TestBase;
import com.qa.pages.sell.GrowPageSellButton;
import com.qa.util.LogUtils;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//span[text()='Create an account/ Sign in']")
    WebElement CreateAccount;

    @FindBy(xpath ="//input[@name='mobileNumber']")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public GrowPageSellButton ValidateLogin(String username, String otp) {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
       // TestUtil.click(CreateAccount, "Creat an account/Sign in Button Clicked");
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");

        return new GrowPageSellButton();

    }
}
