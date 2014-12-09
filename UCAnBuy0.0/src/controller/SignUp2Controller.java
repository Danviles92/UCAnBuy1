/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JComboBox;
import model.CalendarService;
import model.User;
import model.ValidationService;
import model.XMLService;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class SignUp2Controller {
    private final static Logger log = Logger.getLogger(SignUp2Controller.class);
    private static final CalendarService cs = new CalendarService();
    private static final XMLService xs = new XMLService();
    private static final ValidationService vs = new ValidationService();
    
    public JComboBox setComboMonth(JComboBox month){
        return cs.setComboMonth(month);
    }
    
    public JComboBox setComboDay(JComboBox day){
        return cs.setComboDay(day);
    }
    
    public JComboBox setComboYear(JComboBox year){
        return cs.setComboYear(year);
    }
    
    public boolean saveUserInDataBase(User user){
        return xs.saveUserInDataBase(user);
    }
    
    public boolean validateEmail(String email){
        return vs.validateEmail(email);
    }
    
    public boolean passwordLengthIsCorrect(String password){
        return vs.passwordLengthIsCorrect(password);
    }
    
    public boolean equalStrings(String string1, String string2){
        return vs.equalStrings(string1, string2);
    }
}
