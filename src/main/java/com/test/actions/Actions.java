package com.test.actions;

public class Actions {

    private static MainActions mainActions;
    private static LoginActions loginActions;
    private static GoogleActions GoogleActions;

    public static MainActions mainActions() {
        if (mainActions == null) {
            mainActions = new MainActions();
        }
        return mainActions;
    }

    public static LoginActions loginActions() {
        if (loginActions == null) {
            loginActions = new LoginActions();
        }
        return loginActions;
    }

    public static GoogleActions GoogleActions() {
        if (GoogleActions == null) {
            GoogleActions = new GoogleActions();
        }
        return GoogleActions;
    }

}

