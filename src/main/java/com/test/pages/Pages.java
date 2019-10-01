package com.test.pages;

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


}
