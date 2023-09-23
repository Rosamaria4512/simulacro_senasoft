package com.co.andrescepeda.stepsdefinitions;

import conm.co.andrescepeda.tasks.PhotoTask;
import conm.co.andrescepeda.tasks.ReleasesTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReleasesStepDefiniton {
    @When("^he enters the launch module$")
    public void heEntersTheLaunchModule() {
        OnStage.theActorInTheSpotlight().attemptsTo(ReleasesTask.releases());

    }


    @Then("^he will see the latest launches correctly$")
    public void heWillSeeTheLatestLaunchesCorrectly() {

    }

}
