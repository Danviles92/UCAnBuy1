/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;
import model.XMLService;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class SignUpController {
    private final static Logger log = Logger.getLogger(SignUpController.class);
    private static final XMLService xs = new XMLService();
    
    public boolean userExists(String userLogging){
        return xs.readUsernameFromDataBase(userLogging);
    }
}
