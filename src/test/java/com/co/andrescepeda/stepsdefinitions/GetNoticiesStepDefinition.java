package com.co.andrescepeda.stepsdefinitions;

import conm.co.andrescepeda.questions.VerifyNotices;
import conm.co.andrescepeda.tasks.NoticeTask;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class GetNoticiesStepDefinition {

    @When("^he enters the news module$")
    public void heEntersTheNewsModule() {
        OnStage.theActorInTheSpotlight().attemptsTo(NoticeTask.noticeTasks());
    }

    @Then("^he could the news$")
    public void heCouldTheNews() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyNotices.verifyNotices(), Matchers.equalTo(Boolean.TRUE)));

    }
}
