package com.test.pages.amazon;

import com.test.base.BasePage;
import com.test.locators.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AmazonResPage extends BasePage {
    XPath results = new XPath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/child::*");

     List<WebElement> goods ()
    {
        waitForElementVisibility(results);
        return getElements(results);
    }

    String getAuthor (WebElement element)
    {
        String author=null;
        try
        {
            List<WebElement> authors=element.findElements(By.xpath("./div/span/div/div/div[2]/div[3]/div/div[1]/div/child::*"));

            author=authors.get(1).getText(); }
        catch (Exception e)
        {
            author="Not retrieved";
        }
        return author;
    }

    String getTitle (WebElement titlepart)
    {
        String title = null;
        title=titlepart.findElement(By.xpath("./div/span/div/div/div[2]/div[3]/div/div[1]/h2/a/span")).getText();

        return title;

    }

    public List<String[]> getBooks ()
    {   List<String[]> books = new ArrayList<String[]>();
        String[] book;
        for (WebElement element:goods())
        {

            book=new String[] {getTitle(element),getAuthor(element)};
            books.add(book);
        }

        return books;
    }


}
