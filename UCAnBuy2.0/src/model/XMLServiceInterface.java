/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Jesús
 */
public interface XMLServiceInterface {
    public boolean addProductToAdminInventoryInDataBase(Administrator admin);
    
    public boolean readAdminUsernameFromDataBase(String adminUsername);
    
    public boolean readUsernameFromDataBase(String user);
    public boolean readUserEmailFromDataBase(String userEmail);
    public boolean readUserPasswordFromDataBase(String userLogging, String userPassword);
    
    public boolean saveUserInDataBase(User user);
    public boolean saveAdminInDataBase(Administrator admin);
    
    public User getUserFromDataBase(String userUsername);
    public ArrayList getAdminProductsFromDataBase(String adminUsername);
}
