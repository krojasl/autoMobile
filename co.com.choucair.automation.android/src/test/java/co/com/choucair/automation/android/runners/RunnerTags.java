package co.com.choucair.automation.android.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner. RunWith;

@RunWith (CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/wordpress.feature",
        //glue = {"co.com.choucair.automation.android.stepdefinitions","co.com.choucair.automation.android.utils"},
        snippets = SnippetType. CAMELCASE)

public class RunnerTags {

}