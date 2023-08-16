package JavaSeleniumUITemplate.step_defenitions;

import JavaSeleniumUITemplate.pages.MainPage;
import JavaSeleniumUITemplate.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class TestOpenWebPage {
    MainPage mainPage = new MainPage();
    String url;
    @Given("I navigate to the website")
    public void i_navigate_to_the_website() {
        url = "https://www.google.com/";
    }
    @Given("I open the chrome page")
    public void i_open_the_chrome_page()
    {

        Driver.getDriver().get(url);
    }
    @When("I locate an element")
    public void i_locate_an_element() {
        Driver.getDriver().findElement(By.xpath("//textarea[@id='APjFqb']"));
    }
    @Then("I am able to close the webdriver")
    public void i_am_able_to_close_the_webdriver() {

        Driver.closeDriver();
    }

}
