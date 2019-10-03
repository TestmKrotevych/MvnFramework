package com.test.actions;

import com.test.base.BaseActions;
import com.test.pages.Pages;
import com.test.util.Book;
import com.test.util.Constants;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;


public class AmzActions extends BaseActions {

    public void loadAmazon (WebDriver driver)
    {
        driver.get(Constants.AMZ_URL);
        wait(5);
    }

    public void inputQuery (String query)
    {
        Pages.AmazonStartPage().sendQ(query);
    }

     public ArrayList<Book> getAmazonBooks ()
    {
        return Pages.AmazonResPage().getBooks();
    }

    public Book getBook ()
    {
        return Pages.BookToCheck().getBook();
    }

    public boolean checkBookPresence (WebDriver driver, ArrayList<Book> books)
    {
        driver.get(Constants.CHECK_BOOK);
        boolean check=false;
       /* if (books.contains(getBook()))
        { check=true;}*/
        for (int i=0; i<books.size(); i++)
        {
            if (getBook().getTitle().equals(books.get(i).getTitle()) && getBook().getAuthor().equals(books.get(i).getAuthor()))
            {   check=true;
                break;
            }
        }
        return check;
    }
}
