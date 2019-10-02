package com.test.pages.amazon;

import com.test.base.BasePage;
import com.test.locators.ID;

public class AmazonStartPage extends BasePage {
ID searchField = new ID("twotabsearchtextbox");

public void sendQ (String query)
{
    waitForElementVisibility(searchField);
    type("Query is sent",query,searchField);
    pressEnter(searchField);

}

public void submit ()
{

}




}
