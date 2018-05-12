package stepdefs;

import calculatlor.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MultiplyRunSteps2 {

    private long total;

    private Calculator calculator;

    @Before
    private void init() {
        total = -999;
    }

    @Given("^I have a multiply calculator$")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("^I multiply (-?\\d+) and (-?\\d+)$")
    public void testAdd(int num1, int num2) throws Throwable {
        total = calculator.multiply(num1, num2);
    }

    @Then("^the result of multiple should be (-?\\d+)$")
    public void validateResult(int result) throws Throwable {
        Assert.assertEquals(total, result);
    }
}