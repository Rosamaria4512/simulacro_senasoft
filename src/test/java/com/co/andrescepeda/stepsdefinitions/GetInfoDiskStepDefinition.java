package com.co.andrescepeda.stepsdefinitions;

import conm.co.andrescepeda.questions.VerifyBIO;
import conm.co.andrescepeda.questions.VerifyDisk;
import conm.co.andrescepeda.tasks.BIOTask;
import conm.co.andrescepeda.tasks.DiskTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class GetInfoDiskStepDefinition {
    @When("^he enters the news DISCOGRAFIC$")
    public void heEntersTheNewsDISCOGRAFIC() {
    OnStage.theActorInTheSpotlight().attemptsTo(DiskTask.diskTask());
    }


    @Then("^he could the information about a album discografic$")
    public void heCouldTheInformationAboutAAlbumDiscografic() {
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyDisk.verifyDisk(),Matchers.is("Andrés Cepeda, Gusi - Duele (Video Oficial)")));

    }
}
