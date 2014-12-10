/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;

import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class MainController {
    private final static Logger log = Logger.getLogger(MainController.class);
    private static final User u = new User();
    
    public void resetActualUser(User actualUser){
        Util.ACTUAL_USER = new User();
    }
}
