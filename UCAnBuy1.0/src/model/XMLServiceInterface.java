/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jesús
 */
public interface XMLServiceInterface {
    public boolean readUserFromDataBase(User user);
    public boolean saveUserInDataBase(User user);
    public boolean saveAdminInDataBase(Administrator admin);
}
