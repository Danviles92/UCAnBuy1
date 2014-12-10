/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Administrator;
import model.XMLService;

/**
 *
 * @author Jesús
 */
public class SellingMenuController {
    private static final XMLService xs = new XMLService();
    
    public boolean saveAdminInDataBase(Administrator admin){
        return xs.saveAdminInDataBase(admin);
    }
    
    public boolean adminExists(String adminUsername){
        return xs.readAdminUsernameFromDataBase(adminUsername);
    }
    
    public boolean addProductToAdminsInventory(Administrator admin){
        return xs.addProductToAdminInventoryInDataBase(admin);
    }
}
