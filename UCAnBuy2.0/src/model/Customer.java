/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class Customer extends Administrator {
    private final static Logger log = Logger.getLogger(Customer.class);
    String address; 
    Date birthDate;
    
    public String getAddress() {
        return address;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
