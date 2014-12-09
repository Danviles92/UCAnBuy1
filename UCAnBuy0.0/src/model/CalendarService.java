/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Util;
import javax.swing.JComboBox;

/**
 *
 * @author Jesús
 */
public class CalendarService implements CalendarServiceInterface {
    @Override
    public JComboBox setComboMonth(JComboBox month){
        int i;
        
        for(i=0; i<Util.totalMonths; i++){
            month.addItem(Util.MONTHS[i]);
        }
        
        return month;
    };
    
    @Override
    public JComboBox setComboDay(JComboBox day){
        int i;
        
        for(i=1; i<=Util.TOTAL_DAYS; i++){
            day.addItem(i);
        }
        
        return day;
    }
    
    @Override
    public JComboBox setComboYear(JComboBox year){
        int i;
        
        for(i=Util.MINIMUM_YEAR; i<=Util.MAXIMUM_YEAR; i++){
            year.addItem(i);
        }
        
        return year;
    }
}
