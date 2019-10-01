package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.Name;

public class StartGooglePage extends BasePage {
    Name locator= new Name("q");
    Name btnname = new Name("btnK");

    public void  type (String query)
    {
        getElement(locator ).sendKeys(query);
        wait(5);
    }

    public void submit ()
    {
        getElement(btnname).click();
        wait(5);
    }


}
