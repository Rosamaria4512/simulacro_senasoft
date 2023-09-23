package com.co.andrescepeda.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/getinfodiscografic.feature",
        glue = "com.co.andrescepeda.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GetInfoDiskRunner {
}
