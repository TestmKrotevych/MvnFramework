package com.test.util;

public class Constants {
    public static final String DEFAULT_BROWSER = System.getProperty("browser", "chrome");
    public static String DEFAULT_LIB_DIR = System.getProperty("lib.dir");

    public static final int ELEMENT_MEGA_EXTRALONG_TIMEOUT_SECONDS = 360;
    public static final int ELEMENT_EXTRALONG_TIMEOUT_SECONDS = 180;
    public static final int ELEMENT_LONG_TIMEOUT_SECONDS = 120;
    public static final int ELEMENT_TIMEOUT_SECONDS = 60;
    public static final int ELEMENT_SMALL_TIMEOUT_MILLISECONDS = 10;
    public static final int ELEMENT_EXTRASMALL_TIMEOUT_SECONDS = 5;
    public static final int ELEMENT_MICRO_TIMEOUT_SECONDS = 2;

    public static String BASE_URL = System.getProperty("baseurl");

    public static String G_URL = "http://google.com";
    //public static String BASE_QUERY = "Java";
    public static String AMZ_URL ="https://www.amazon.com/";
    public static  String CHECK_BOOK ="https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/ref=sr_1_3";
    public static String BASE_QUERY = System.getProperty("query_for_search");
}
