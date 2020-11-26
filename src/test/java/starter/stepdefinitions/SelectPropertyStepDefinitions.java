package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import starter.Property.Clickheadermenu;
import starter.Property.PropertyInfo;
import starter.Property.PropertyName;
import starter.verifyaccount.AccountData;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectPropertyStepDefinitions {
    String name;

    @Before
    public void setTheStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("the_User_is_successfully_logged_in")
    public void the_User_is_successfully_logged_in() {
        theActorInTheSpotlight().should(
                seeThat("ProfileName", AccountData.currentProfileName(), equalTo("System Administrator"))
        );
    };

    @When("the User navigates through the menu to property list")
    public void the_User_Navigates_Through_The_MenuToPropertyList() {
        theActorInTheSpotlight().attemptsTo(Clickheadermenu.properties());

    };

    @And("Clicks_on_a_property")
    public void Clicks_on_a_property() {
        theActorInTheSpotlight().attemptsTo();

    }
    @Then("User can see_the_property_profile")
                public void the_User_can_see_the_property_profile() {
            theActorInTheSpotlight().should(
                    seeThat("Profile Name", PropertyName.ProfileName(),equalTo("Asheville MOB"))
            );
        }
    }


