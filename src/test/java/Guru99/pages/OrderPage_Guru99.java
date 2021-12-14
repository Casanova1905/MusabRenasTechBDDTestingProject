package Guru99.pages;

import Guru99.util.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage_Guru99 {

    public OrderPage_Guru99() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement header;

    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement price;

    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantity;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;


    public void setBuyNow() {
        buyNow.click();
    }

    public void setQuantity(String five) {
        Select select = new Select(quantity);
        select.selectByVisibleText(five);
    }

    public void setPrice(String expectedPrice) {
    Assert.assertEquals(price.getText(),expectedPrice);
    }

    public void setHeader(String expected) {
        Assert.assertEquals(header.getText(),expected);
    }

    public void urlVerification(String expectedUrl) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }

}
