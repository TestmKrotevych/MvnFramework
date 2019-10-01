package net.test;

import com.test.actions.GoogleActions;
import com.test.base.BasePage;
import com.test.base.BaseTest;
import com.test.pages.Pages;
import com.test.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void runTest(){
        GoogleActions act = new GoogleActions();
        act.loadGoogle(driver);
        act.inputQuery(Constants.BASE_QUERY);
        act.submitQuery();
        Assert.assertTrue(act.getSearchSize() != 0);



    }

}
