package com.test.actions;

import com.test.base.BaseActions;
import com.test.pages.Pages;
import com.test.util.Constants;
import org.openqa.selenium.WebDriver;

import java.util.List;

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

     public List<String[]> getAmazonBooks ()
    {
        return Pages.AmazonResPage().getBooks();
    }

    String[] getBook ()
    {

        return Pages.BookToCheck().getBook();
    }

    public boolean checkBookPresence (WebDriver driver, List<String[]> books)
    {

       
        driver.get(Pages.BookToCheck().url);
        String [] checkBook = getBook();
        boolean check=false;
        for (int i=0; i<books.size(); i++)
        {
            if (checkBook[0].equals(books.get(i)[0]) && checkBook[1].equals(books.get(i)[1]))
            {   check=true;
                break;
            }
        }

        return check;
    }


}
