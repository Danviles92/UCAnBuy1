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
public class User {
    private final static Logger log = Logger.getLogger(User.class);
    String name;
    String lastname;
    String id;
    String username;
    String email;
    String password;
    boolean isAdmin;
    Date signUpDate;

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public Date getSignUpDate() {
        return signUpDate;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }
}
