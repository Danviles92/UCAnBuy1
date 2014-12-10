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
public class LogInController {
    private final static Logger log = Logger.getLogger(LogInController.class);
    private static final XMLService xs = new XMLService();
    
    public boolean correctUsername(String username){
        return xs.readUsernameFromDataBase(username);
    }
    
    public boolean correctEmail(String userEmail){
        return xs.readUserEmailFromDataBase(userEmail);
    }
    
    public boolean correctPassword(String userLogging, String userPassword){
        return xs.readUserPasswordFromDataBase(userLogging, userPassword);
    }
    
    public User getUserFromDataBase(String userUsername){
        return xs.getUserFromDataBase(userUsername);
    }
}
