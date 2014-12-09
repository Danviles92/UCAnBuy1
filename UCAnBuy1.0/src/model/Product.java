/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class Product {
    private final static Logger log = Logger.getLogger(Product.class);
    String name;
    String provider;
    String description;
    String category;
    double price;
    int quantity;
    ArrayList <Image> productImages;
    
    public ArrayList<Image> getProductImages() {
        return productImages;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getProvider() {
        return provider;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setProductImages(ArrayList<Image> productImages) {
        this.productImages = productImages;
    }
}
