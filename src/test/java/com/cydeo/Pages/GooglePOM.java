package com.cydeo.Pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePOM {

    public GooglePOM(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@class='gLFyf'] ")
    public WebElement searchgar;
}
