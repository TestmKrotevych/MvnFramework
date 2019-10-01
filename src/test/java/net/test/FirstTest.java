package net.test;

import com.test.actions.Actions;

import com.test.base.BasePage;
import com.test.base.BaseTest;
import com.test.pages.Pages;
import com.test.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void runTest(){


        Actions.GoogleActions().loadGoogle(driver);
        Actions.GoogleActions().inputQuery(Constants.BASE_QUERY);
        Actions.GoogleActions().submitQuery();
        Assert.assertTrue(Actions.GoogleActions().checkSearchResult());



    }

}
