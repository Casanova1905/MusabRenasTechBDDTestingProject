package Guru99.pages;

import Guru99.util.CommonUtils;
import Guru99.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage_Guru99 {

    public PaymentPage_Guru99() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement CardNumber;

    @FindBy(id = "month")
    private  WebElement ExpMonth;

    @FindBy(id = "year")
    private WebElement ExpYear;

    @FindBy(id = "cvv_code")
    private  WebElement Cvv;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement PayButton;

    public void setCardNumber(String cardNumber) {
        CardNumber.sendKeys(cardNumber);
    }

    public void setExpMonth(String expMonth) {
        ExpMonth.sendKeys(expMonth);
    }

    public void setExpYear(String expYear) {
        ExpYear.sendKeys(expYear);
    }

    public void setCvv(String cvv) {
        Cvv.sendKeys(cvv);
    }

    public void setPayButton() {
        CommonUtils.clickWithWait(PayButton);
    }

}
