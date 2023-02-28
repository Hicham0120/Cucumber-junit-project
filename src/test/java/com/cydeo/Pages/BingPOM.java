package com.cydeo.Pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingPOM {


    public BingPOM(){


        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(name = "q")
    public WebElement serchbar;
}
