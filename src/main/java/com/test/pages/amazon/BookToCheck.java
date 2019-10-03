package com.test.pages.amazon;

import com.test.base.BasePage;
import com.test.locators.ID;
import com.test.locators.Locator;
import com.test.locators.XPath;
import com.test.util.Book;

public class BookToCheck extends BasePage {

    Locator titleID = new ID("productTitle");
    Locator auth =new XPath("//div[@id='bylineInfo']//a[@data-asin]");

    public String getTitle ()
    {
        return getElement(titleID).getText();
    }
    public String getAuthor ()
    {
        return  getElements(auth).get(0).getText(); }

    public Book getBook ()
    { return new Book(getTitle(),getAuthor()); }
}
