package com.test.pages.amazon;

import com.test.base.BasePage;
import com.test.locators.Locator;
import com.test.locators.XPath;
import com.test.util.Book;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AmazonResPage extends BasePage {
    Locator results = new XPath("//div[contains(@class, 's-search-results')]/div[contains(@class, 's-result-item')]");
    Locator title =new XPath("//div[h2]//a/span");
    Locator author = new XPath("//div[h2]//div/*[2]");

    public int countResults ()
    {
        return getElementsCount(results);
    }

    public ArrayList<Book> getBooks ()
    {
        ArrayList<Book> books = new ArrayList<>();
        Locator temptitle;
        Locator tempauthor;
        for (int i=1; i<=countResults(); i++)
        {   temptitle = new XPath( results+"["+i+"]"+title);
            tempauthor = new XPath(results+"["+i+"]"+author);
            if (isElementPresent(tempauthor))
            {
                books.add(new Book(getElementText("Ttl got",temptitle),getElementText("Auth got",tempauthor)));
            }
        }
        return books;
    }
}
