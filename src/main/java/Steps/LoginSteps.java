package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("userIsOnLoginPage");
        System.out.println("Welcome to Login page");
        System.out.println("abd");
    }

    @When("user enters user name and password")
    public void userEntersUserNameAndPassword() {
        System.out.println("userEntersUserNameAndPassword");
        System.out.println("Today is Wednesday");
    }
    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("clickOnLoginButton");
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage");
    }
}