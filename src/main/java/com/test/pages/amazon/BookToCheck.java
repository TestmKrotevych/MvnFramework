package com.test.pages.amazon;

import com.test.base.BasePage;
import com.test.locators.ID;
import com.test.locators.XPath;

public class BookToCheck extends BasePage {
    public String url ="https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/ref=sr_1_3";
    ID titleID = new ID("productTitle");
    XPath author = new XPath("//*[@id=\"bylineInfo\"]/span[1]/span[1]/a[1]");

    String getTitle ()
    {
        return getElement(titleID).getText();
    }

    String getAuthor ()
    {
        return  getElement(author).getText();
    }

    public String [] getBook ()
    {
        String[] book= new String[] {getTitle(),getAuthor()};



        return book;
    }




}
