/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import org.apache.log4j.Logger;

/**
 *
 *@author Jesus Di Bari
 */
public class MyOwnJFrame extends JFrame{
    private final static Logger log = Logger.getLogger(MyOwnJFrame.class);
    /*Class variables*/
    private JFrame  fatherWindow;
    private boolean isFatherWindowHide;
    private boolean isFatherWindowDisable;
    
    /*method that returns the parent window*/
    public JFrame getFatherWindow()
    {
        return fatherWindow;
    }
    /*method that indicates which is the parent window of the project*/
    public void setFatherWindow(JFrame fatherWindow, boolean hideFatherWindow)
    {
        this.fatherWindow = fatherWindow;
        
        if (hideFatherWindow)
        {
            this.fatherWindow.setVisible(false); 
            this.isFatherWindowHide = true;
            this.isFatherWindowDisable = false;
        }
        else
        {
            this.fatherWindow.setEnabled(false);
        //    this.setAlwaysOnTop(true);
            this.isFatherWindowHide = false;
            this.isFatherWindowDisable = true;
        }
    }
    
    public void setFatherWindow2(JFrame fatherWindow, boolean hideFatherWindow)
    {
        this.fatherWindow = fatherWindow;
        
        if (hideFatherWindow)
        {
            this.fatherWindow.setVisible(false); 
            this.isFatherWindowHide = true;
            this.isFatherWindowDisable = false;
        }
        else
        {
            this.fatherWindow.setEnabled(false);
            this.setAlwaysOnTop(true);
            this.isFatherWindowHide = false;
            this.isFatherWindowDisable = true;
        }
    }
    
    /*method that returns the parent window of the project*/
    public void restoreFatherWindow()
    {
        if (this.isFatherWindowHide)
            this.fatherWindow.setVisible(true);
        
        if (this.isFatherWindowDisable)
            this.fatherWindow.setEnabled(true);
        
        this.dispose();
    }
    /*method that enables the parent window of the project*/
    public void setEnableWindow(boolean setEnable)
    {
        this.setEnabled(setEnable);
        this.setAlwaysOnTop(true);       
    }
}
