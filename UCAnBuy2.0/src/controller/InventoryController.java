/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import model.XMLService;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class InventoryController {
    private final static Logger log = Logger.getLogger(InventoryController.class);
    private static final XMLService xs = new XMLService();
    
    public ArrayList<String> getProductsList(String adminUsername){
        return xs.getAdminProductsFromDataBase(adminUsername);
    }
}
