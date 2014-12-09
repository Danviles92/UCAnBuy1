/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Administrator;
import model.User;

import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class Util {
    private final static Logger log = Logger.getLogger(Util.class);
    
    /*CALENDAR--------------------------------------------------------CALENDAR*/
    public static final int totalMonths = 12;
    public static final String MONTHS[] = {
        "January",//31
        "February",//28
        "March",//31
        "April",//30
        "May",//31
        "June",//30
        "July",//31
        "August",//31
        "September",//30
        "October",//31
        "November",//30
        "December"//31
    };
    
    public static final int TOTAL_DAYS  = 31;
    public static final int TOTAL_DAYS2 = 30;
    public static final int TOTAL_DAYS_FEBRUARY = 28;
    
    public static final int MINIMUM_YEAR = 1900;
    public static final int MAXIMUM_YEAR = 2014;
    /*CALENDAR--------------------------------------------------------CALENDAR*/
    
    /*PRODUCT----------------------------------------------------------PRODUCT*/
    public static final int TOTAL_CATEGORIES = 25;
    public static final String CATEGORY[] = {
        "Apps, Games",
        "Arts",
        "Baby",
        "Beauty",
        "Books",
        "CDs",
        "Cellphones, Accessories",
        "Clothing",
        "Computers",
        "Electronics",//10
        "Grocery, Gourmet Food",
        "Health, Personal Care",
        "Home, Kitchen",
        "Industrial, Scientific",
        "Movies, TV",
        "Musical Instruments",
        "Office Products",
        "Patio, Lawn, Garden",
        "Pet Supplies",
        "Software",//20
        "Sports, Outdoor",
        "Tools, Home Improvement",
        "Toys, Games",
        "Videogames, Consoles",
        "Wine"//25
    };
    
    public static final int TOTAL_PRODUCTS = 99;
    /*PRODUCT----------------------------------------------------------PRODUCT*/
    
    /*XML------------------------------------------------------------------XML*/
    public static final String ADMIN_TAG = "administrator";
    public static final String INVENTORY_TAG = "inventory";
    public static final String PRODUCT_TAG = "product";
    public static final String PRODUCT_PRICE_TAG = "price";
    public static final String PRODUCT_NAME_TAG = "productName";
    public static final String PRODUCT_CATEGORY_TAG = "category";
    public static final String PRODUCT_QUANTITY_TAG = "quantity";
    
    public static final String USER_TAG = "user";
    public static final String USER_NAME_TAG = "name";
    public static final String USER_LASTNAME_TAG = "lastName";
    public static final String USER_ID_TAG = "id";
    public static final String USER_USERNAME_TAG = "username";
    public static final String USER_EMAIL_TAG = "email";
    public static final String USER_PASSWORD_TAG = "password";
    
    public static final String ERROR_USER_NAME_TAG = "Error loading User from XML - Error in the attribute " + USER_NAME_TAG + " of the XML tag";
    public static final String ERROR_USER_ID_TAG = "Error loading User from XML - Error in the attribute " + USER_ID_TAG + " of the XML tag";
    public static final String ERROR_USER_LASTNAME_TAG = "Error loading User from XML - Error in the attribute " + USER_LASTNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_NICKNAME_TAG = "Error loading User from XML - Error in the attribute " + USER_USERNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_MAIL_TAG = "Error loading User from XML - Error in the attribute " + USER_EMAIL_TAG + " of the XML tag";
    public static final String ERROR_USER_PASSWORD_TAG = "Error loading User from XML - Error in the attribute " + USER_PASSWORD_TAG + " of the XML tag";
    
    public static final String ERROR_XML_EMPTY_FILE = "Error loading XML file - The file is empty";
    public static final String ERROR_XML_PROCESSING_FILE = "Error loading XML file - It's not possible processing the file";
    
    public static final String USERS_XML_PATH = "src/model/Users.xml";
    public static final String ADMINS_XML_PATH = "src/model/Administrators.xml";
    /*XML------------------------------------------------------------------XML*/
    
    public static User ACTUAL_USER = new User();
    public static Administrator ACTUAL_ADMIN = new Administrator();
    
    public static boolean DONE = false;
    public static boolean LOGGED_IN = false;
    
    public static final String IMAGES_PATH = "images/";
}
