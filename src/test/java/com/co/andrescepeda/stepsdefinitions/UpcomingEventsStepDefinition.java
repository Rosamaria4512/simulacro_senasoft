package com.co.andrescepeda.stepsdefinitions;

import conm.co.andrescepeda.tasks.EventsTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class UpcomingEventsStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^he enters the website$")
    public void heEntersTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://andrescepeda.com.co/"));

    }


    @When("^he enters the events module$")
    public void heEntersTheEventsModule() {
        OnStage.theActorInTheSpotlight().attemptsTo(EventsTask.events());

    }

    @Then("^he will be able to see his upcoming events$")
    public void heWillBeAbleToSeeHisUpcomingEvents() {

    }

}
