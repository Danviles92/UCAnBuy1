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
public interface ValidationServiceInterface {
    public boolean validateEmail(String email);
    public boolean passwordLengthIsCorrect(String password);
    public boolean emailLengthIsCorrect(String email);
    public boolean equalStrings(String string1, String string2);
}
