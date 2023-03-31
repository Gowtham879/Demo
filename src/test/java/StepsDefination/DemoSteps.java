package StepsDefination;

import Commands.DemoCommands;
import PageObjects.RegistorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps extends DemoCommands {
    DemoCommands demoCommands=new DemoCommands();
    RegistorPage registorPage=new RegistorPage();
    @Given("User is able to Launch the Application")
    public void user_is_able_to_Launch_the_Application() {
        demoCommands.openBrowser();
    }

    @When("User is Enter valid data is {string} {string} {string} {string}")
    public void user_is_Enter_valid_data_is(String FirstName, String LastName, String Email, String PhoneNumber) throws InterruptedException {
       registorPage.Credentials(FirstName,LastName,Email,PhoneNumber);
    }


    @When("Enter Valid {string} {string}")
    public void enter_Valid(String Password, String ConfirmPasswor) throws InterruptedException {
        registorPage.Credentilas1(Password,ConfirmPasswor);
    }



    @Then("Verify User is able to Registor")
    public void verify_User_is_able_to_Registor() {
    driver.close();
    }
}
