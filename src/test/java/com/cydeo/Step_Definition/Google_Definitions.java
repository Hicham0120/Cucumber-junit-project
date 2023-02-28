package com.cydeo.Step_Definition;

import com.cydeo.Pages.GooglePOM;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_Definitions {

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
   /* @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String expectTiltle= "Google";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectTiltle,actualTitle);
    }
*/
    @And("user search apple")
    public void userSearchApple() {
        GooglePOM serchbar=new GooglePOM();
        serchbar.searchgar.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("user should see title is apple - Google")
    public void userShouldSeeTitleIsAppleGoogle() {
        String expectTiltle= "apple - Google Search";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectTiltle,actualTitle);
    }
}
