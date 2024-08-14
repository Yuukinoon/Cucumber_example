import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {
    @Given("chrome browser is used")
    public void chromeBrowserIsUsed() {
        System.out.println("test");
    }
    @When("user navigates to the login page")
    public void user_navigates_to_the_login_page() {
        System.out.println("test");
    }
    @And("user types username on the username field")
    public void user_types_username_on_the_username_field() {
        System.out.println("test");
    }
    @And("user types password on the password field")
    public void user_types_password_on_the_password_field() {
        System.out.println("test");
    }
    @And("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("test");
    }
    @Then("user can login the application")
    public void user_can_login_the_application() {
        System.out.println("test");
    }

}
