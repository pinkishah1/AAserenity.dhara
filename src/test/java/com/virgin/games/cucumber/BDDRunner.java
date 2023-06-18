package com.virgin.games.cucumber;
import com.virgin.games.testbase.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/feature/virgingames.feature/")
public class BDDRunner extends TestBase {

    }


