package com.qa.pages.sell;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowPageSellButton extends TestBase {

    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;

    public GrowPageSellButton() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateSellButton() {
        SellBtn.click();
    }
}
