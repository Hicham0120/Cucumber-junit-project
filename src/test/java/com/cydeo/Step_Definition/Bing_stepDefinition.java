package com.cydeo.Step_Definition;

import com.cydeo.Pages.BingPOM;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Bing_stepDefinition {
    //Task 2: Bing Search Title Verification
    //1. Go to https://www.bing.com
    //2. Search for “orange”
    //3. Verify title is:
    //a. Expected = “orange – Search”
    //
    //Note:
    //1. Follow POM Design Pattern
    //2. BDD implementation

        @When("user user in bing page")
        public void user_user_in_bing_page() {
            Driver.getDriver().get("https://www.bing.com");
        }
        @When("user search orange")
        public void user_search_orange() {
                BingPOM srch=new BingPOM();
                srch.serchbar.sendKeys("orange"+ Keys.ENTER);
             //   srch.serchbar.click();


        }
        @Then("user should see the title orange – Search")
        public void user_should_see_the_title_orange_search() {
                String esp="orange - Search";
              Assert.assertEquals(Driver.getDriver().getTitle(),esp);

        }
    }

