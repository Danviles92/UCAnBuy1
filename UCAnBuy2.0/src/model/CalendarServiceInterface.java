/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JComboBox;

/**
 *
 * @author Jesús
 */
public interface CalendarServiceInterface {
    public JComboBox setComboMonth(JComboBox month);
    public JComboBox setComboDay(JComboBox day);
    public JComboBox setComboYear(JComboBox year);
}
