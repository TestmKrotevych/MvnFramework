package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.Name;

public class StartGooglePage extends BasePage {
    Name searchbox = new Name("q");
    Name btnname = new Name("btnK");

    public void  sendQ (String query)
    {
        waitForElementVisibility(searchbox);
        type("Query is sent",query,searchbox);

    }

    public void submit ()
    {
        waitForElementVisibility(btnname);
        click("Request sent", btnname);

    }


}
