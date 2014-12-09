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
public class Calendar {
    private final static Logger log = Logger.getLogger(Calendar.class);
    String month;
    String dayString;
    int monthInt;
    int dayInt;
    int year;

    public int getDayInt() {
        return dayInt;
    }
    public String getDayString() {
        return dayString;
    }
    public String getMonth() {
        return month;
    }
    public int getMonthInt() {
        return monthInt;
    }
    public int getYear() {
        return year;
    }
    public void setDayInt(int dayInt) {
        this.dayInt = dayInt;
    }
    public void setDayString(String dayString) {
        this.dayString = dayString;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public void setMonthInt(int monthInt) {
        this.monthInt = monthInt;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
