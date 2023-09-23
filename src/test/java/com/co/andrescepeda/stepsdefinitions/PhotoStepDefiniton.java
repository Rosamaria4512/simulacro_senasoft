package com.co.andrescepeda.stepsdefinitions;

import conm.co.andrescepeda.tasks.EventsTask;
import conm.co.andrescepeda.tasks.PhotoTask;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.runner.RunWith;


public class PhotoStepDefiniton {
    @When("^he enters the photos module$")
    public void heEntersThePhotosModule() {
        OnStage.theActorInTheSpotlight().attemptsTo(PhotoTask.photo());


    }


    @Then("^he will be able to view the photos and videos correctly$")
    public void heWillBeAbleToViewThePhotosAndVideosCorrectly() {

    }
}
