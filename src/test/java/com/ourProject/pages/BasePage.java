package com.ourProject.pages;

import com.ourProject.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {//change to abstract so login page can extend

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2000);

    public BasePage() {//constructor
        //this line to bo able to use @Findby,@FindBys annotations
        PageFactory.initElements(Driver.getDriver(), this);
        //library.init these Elements
    }
}
