/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import view.Main;

/**
 *
 * @author Jesús
 */
public class MainService {
    private final static Logger log = Logger.getLogger(MainService.class);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BasicConfigurator.configure();
        
    //    log.trace("Probando el trace");
    //    log.warn("Este es un warning");
        
        Main mainWindow = new Main();
        mainWindow.setVisible(true);
    }
}
