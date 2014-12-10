/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class Inventory {
    private final static Logger log = Logger.getLogger(Inventory.class);
    
    ArrayList <Product> productsList;

    public ArrayList<Product> getProductsList() {
        return productsList;
    }
    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }
}
