package net.test;

import com.test.actions.Actions;
import com.test.base.BaseTest;
import com.test.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonTest extends BaseTest {

    @Test
    public void runTest()
    {
        Actions.AmzActions().loadAmazon(driver);
        Actions.AmzActions().inputQuery(Constants.BASE_QUERY);

        List<String[]> books = Actions.AmzActions().getAmazonBooks();
        Assert.assertTrue(Actions.AmzActions().checkBookPresence(driver, books));

    }

}
