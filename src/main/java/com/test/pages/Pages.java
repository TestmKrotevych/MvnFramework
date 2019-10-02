package com.test.pages;
import com.test.pages.amazon.*;
public class Pages {

    private static LoginPage loginPage;

    public static LoginPage loginPage() {
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    private static StartGooglePage StartGooglePage;

    public static StartGooglePage StartGooglePage() {
        if (StartGooglePage == null){
            StartGooglePage = new StartGooglePage();
        }
        return StartGooglePage;
    }

    private static ResultsPage ResultsPage;

    public static ResultsPage ResultsPage() {
        if (ResultsPage == null){
            ResultsPage = new ResultsPage();
        }
        return ResultsPage;
    }

    private static AmazonStartPage AmazonStartPage;

    public static AmazonStartPage AmazonStartPage() {
        if (AmazonStartPage == null){
            AmazonStartPage = new AmazonStartPage();
        }
        return AmazonStartPage;
    }

    private static AmazonResPage AmazonResPage;

    public static AmazonResPage AmazonResPage() {
        if (AmazonResPage == null){
            AmazonResPage = new AmazonResPage();
        }
        return AmazonResPage;
    }

    private static BookToCheck BookToCheck;

    public static BookToCheck BookToCheck() {
        if (BookToCheck == null){
            BookToCheck = new BookToCheck();
        }
        return BookToCheck;
    }


}
