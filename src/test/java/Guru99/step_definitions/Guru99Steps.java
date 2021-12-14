package Guru99.step_definitions;

import Guru99.pages.OrderPage_Guru99;
import Guru99.pages.PaymentPage_Guru99;
import Guru99.pages.PaymentVerify_Guru99;
import Guru99.util.CommonUtils;
import Guru99.util.ConfigurationReader;
import Guru99.util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Guru99Steps {

    OrderPage_Guru99 orderPage_guru99 = new OrderPage_Guru99();
    PaymentPage_Guru99 paymentPage_guru99 = new PaymentPage_Guru99();
    PaymentVerify_Guru99 paymentVerify_guru99 = new PaymentVerify_Guru99();

    @Given("user navigates to Guru99")
    public void user_navigates_to() {
        System.out.println("Chrome browser started");
    }
    @When("Verify that the expected header contains {string}")
    public void verify_that_the_expected_header_contains(String expected) {
        orderPage_guru99.setHeader(expected);
    }

    @Then("Verify that the toy price is {string}")
    public void verify_that_the_toy_price_is(String expectedPrice) {
        orderPage_guru99.setPrice(expectedPrice);
    }

    @Then("Verify that the URL contains {string}")
    public void verify_that_the_url_contains(String expectedUrl) {
        orderPage_guru99.urlVerification(expectedUrl);
    }

    @When("User choose the quantity as {string}")
    public void user_choose_the_quantity_as(String five) {
        orderPage_guru99.setQuantity(five);
    }
    @Then("User click on Buy Now button")
    public void user_click_on_buy_now_button() {
        orderPage_guru99.setBuyNow();
        CommonUtils.hardWait(1000);
    }

    @When("User input informations as below")
    public void user_input_informations_as_below(Map<String,String> dataTable) {
        paymentPage_guru99.setCardNumber(dataTable.get("CardNumber"));
        paymentPage_guru99.setExpMonth(dataTable.get("ExpMonth"));
        paymentPage_guru99.setExpYear(dataTable.get("ExpYear"));
        paymentPage_guru99.setCvv(dataTable.get("CvvCode"));
    }
    @Then("User clicks on Pay button")
    public void user_clicks_on_pay_button() {
        CommonUtils.hardWait(1000);
        paymentPage_guru99.setPayButton();
    }
    @Then("User should be able to verify {string} text")
    public void user_should_be_able_to_verify_text(String expectedText) {
        paymentVerify_guru99.setPaymentVerify(expectedText);
    }






}
