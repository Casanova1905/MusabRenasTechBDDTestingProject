package Guru99.pages;

import Guru99.util.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentVerify_Guru99 {

    public PaymentVerify_Guru99() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement PaymentVerify;

    public void setPaymentVerify(String expectedText) {
        Assert.assertEquals(PaymentVerify.getText(),expectedText);
    }

}
