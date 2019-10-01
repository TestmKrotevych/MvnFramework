package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.ID;
import com.test.locators.XPath;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage {


    XPath results = new XPath("//*[@id=\"rso\"]/child::*");

    public int getSearchesSize ()
    {
      return getElementsCount(results);

    }


}
