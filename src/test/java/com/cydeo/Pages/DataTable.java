package com.cydeo.Pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTable {
    public DataTable(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(id="month")
    public WebElement searchmonth;
}
