package com.test.actions;

import com.test.base.BaseActions;
import com.test.pages.Pages;
import com.test.util.Constants;
import org.openqa.selenium.WebDriver;

public class GoogleActions  extends BaseActions {


    public void loadGoogle (WebDriver driver)
    {
        driver.get(Constants.BASE_URL);

        wait(5);

    }
    public void inputQuery (String query)
    {


        Pages.StartGooglePage().sendQ(query);



    }

    public void submitQuery ()
    {

        Pages.StartGooglePage().submit();
    }

    public boolean  checkSearchResult ()
    {
        return Pages.ResultsPage().checkSearchResult();
    }



}
