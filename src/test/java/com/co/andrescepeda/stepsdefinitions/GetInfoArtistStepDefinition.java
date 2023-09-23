package com.co.andrescepeda.stepsdefinitions;

import conm.co.andrescepeda.questions.VerifyBIO;
import conm.co.andrescepeda.tasks.BIOTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class GetInfoArtistStepDefinition {


    @When("^he enters the news BIO$")
    public void heEntersTheNewsBIO() {
        OnStage.theActorInTheSpotlight().attemptsTo(BIOTask.bioTask());

    }


    @Then("^he could the information about your artist$")
    public void heCouldTheInformationAboutYourArtist() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBIO.verifyBIO(), Matchers.is("SOBRE ANDRÉS CEPEDA")));
    }
}
