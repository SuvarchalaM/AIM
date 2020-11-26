package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.Credentials;
import starter.navigation.NavigateTo;
import starter.verifyaccount.AccountData;

import java.util.List;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.apache.http.auth.Credentials.*;
import static starter.login.Credentials.*;

public class LoginStepDefinitions {

    String name;
    //private starter.verifyaccount.AccountData AccountData;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the (.*) is on page WMU")
    public void the_User_is_on_page_WMU(String User) {
        this.name = User;
        theActorCalled(User).attemptsTo(
                NavigateTo.WmuPage()
        );
    }

    @When("enters the credentials")
    public void enters_the_credentials(List<String> form) {
        theActorInTheSpotlight().attemptsTo((Performable) withTheData(form));
    }

    @Then("the user is successfully logged in")
    public void the_User_is_successfully_logged_in() {
        theActorInTheSpotlight().should(
                seeThat("ProfileName", AccountData.currentProfileName(), equalTo("System Administrator"))
        );
    }

}

