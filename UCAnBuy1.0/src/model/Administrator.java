/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class Administrator extends User {
    private final static Logger log = Logger.getLogger(Administrator.class);
    Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
