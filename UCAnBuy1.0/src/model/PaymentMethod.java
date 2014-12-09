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
public class PaymentMethod {
    private final static Logger log = Logger.getLogger(PaymentMethod.class);
    String company;
    String cardNumber;
    Date expiringDate;
    int securityCode;

    public String getCardNumber() {
        return cardNumber;
    }
    public String getCompany() {
        return company;
    }
    public Date getExpiringDate() {
        return expiringDate;
    }
    public int getSecurityCode() {
        return securityCode;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}
