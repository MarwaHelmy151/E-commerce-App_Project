package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistration extends TestBase {

	HomePage homeObject;
	UserRegistrationPage registerObject;
	String firstName = "Marwa";
	String lastName = "Helmy";
	String email = "Marwa600@gmail.com";
	String oldPassword = "123456";

	@Given ("The user open the website")
	public void user_open_Website () {
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
	}

	@When ("The user click on register link")
	public void the_user_click_on_register_link() {

		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

	@And ("The user enter the required data")
	public void user_enter_required_data() {

		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration(firstName, lastName, email, oldPassword);

	}
	
	@Then ("The user can register successfully")
	public void user_can_register_successfully() {
		
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.retrunToHomePage();
	}

}
