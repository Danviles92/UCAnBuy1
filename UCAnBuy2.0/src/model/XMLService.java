/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Util;

import org.apache.log4j.Logger;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
//import org.jdom2.Namespace;
import org.jdom2.input.JDOMParseException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Jesús
 */
public class XMLService implements XMLServiceInterface{
    private final static Logger log = Logger.getLogger(XMLService.class);
    
    @Override
    public boolean readUsernameFromDataBase(String userLogging)
    {
        Document        doc;
        Element         root, child;
        List <Element>  rootChildren;
        String          name, lastName, id, username, email, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);

                username        = child.getAttributeValue(Util.USER_USERNAME_TAG);

                if(username != null          && username.equals(userLogging))
                {
                    found = true;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return found;
    }
    
    @Override
    public boolean readUserEmailFromDataBase(String userEmail)
    {
        Document        doc;
        Element         root, child;
        List <Element>  rootChildren;
        String          name, lastName, id, username, email, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);

                email        = child.getAttributeValue(Util.USER_EMAIL_TAG);

                if(email != null          && email.equals(userEmail))
                {
                    found = true;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (email == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return found;
    }
    
    @Override
    public boolean readUserPasswordFromDataBase(String userLogging, String userPassword)
    {
        Document        doc;
        Element         root, child;
        List <Element>  rootChildren;
        String          name, lastName, id, username, email, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);

                username        = child.getAttributeValue(Util.USER_USERNAME_TAG);

                if(username != null          && username.equals(userLogging))
                {
                    password = child.getAttributeValue(Util.USER_PASSWORD_TAG);
                    
                    if(password.equals(userPassword)){
                        found = true;
                    }else
                        return false;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return found;
    }
    
    public boolean readAdminUsernameFromDataBase(String adminUsername)
    {
        Document        doc;
        Element         root, child;
        List <Element>  rootChildren;
        String          name, lastName, id, username, email, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.ADMINS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);

                username        = child.getAttributeValue(Util.ADMIN_USERNAME_TAG);
                
                log.warn("XMLusername: " + username + "\nadminUsername: " + adminUsername);
                
                if(username != null          && username.equals(adminUsername))
                {
                    log.warn("XMLusername: " + username + "\nadminUsername: " + adminUsername);
                    
                    found = true;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return found;
    }
    
    @Override
    public boolean saveUserInDataBase(User user)
    {
        Document    doc;
        Element     root, newChild;

        SAXBuilder  builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            // Creamos una nueva etiqueta
            newChild = new Element(Util.USER_TAG);

            // Añadimos un atributo
            newChild.setAttribute(Util.USER_NAME_TAG, user.getName());
            newChild.setAttribute(Util.USER_LASTNAME_TAG, user.getLastname());
            newChild.setAttribute(Util.USER_ID_TAG, user.getId());
            newChild.setAttribute(Util.USER_USERNAME_TAG, user.getUsername());
            newChild.setAttribute(Util.USER_EMAIL_TAG, user.getEmail());
            newChild.setAttribute(Util.USER_PASSWORD_TAG, user.getPassword());

            // La añadimos como hija a una etiqueta ya existente
            root.addContent(newChild);
            
            try
            {
                Format format = Format.getPrettyFormat();

                /* Se genera un flujo de salida de datos XML */
                XMLOutputter out = new XMLOutputter(format);

                /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                FileOutputStream file = new FileOutputStream(Util.USERS_XML_PATH);

                /* Se manda el documento generado hacia el archivo XML */
                out.output(doc,file);

                /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                file.flush();
                file.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return true;
    }
    
    public boolean saveAdminInDataBase(Administrator admin){
        Document    doc;
        Element     root, adminChild, productChild;

        SAXBuilder  builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.ADMINS_XML_PATH);

            root = doc.getRootElement();

            // Creamos una nueva etiqueta
            adminChild = new Element(Util.ADMIN_TAG);
            productChild = new Element(Util.PRODUCT_TAG);
            
            // Añadimos un atributo
            adminChild.setAttribute(Util.ADMIN_USERNAME_TAG, admin.getId());
            Iterator<Product> productIterator = admin.getInventory().getProductsList().iterator();
            while(productIterator.hasNext()){
                    Product product = productIterator.next();
                    productChild.setAttribute(Util.PRODUCT_NAME_TAG, product.getName());
                    productChild.setAttribute(Util.PRODUCT_CATEGORY_TAG, product.getCategory());
                    productChild.setAttribute(Util.PRODUCT_PRICE_TAG, Double.toString(product.getPrice()));
                    productChild.setAttribute(Util.PRODUCT_QUANTITY_TAG, Integer.toString(product.getQuantity()));
            }
            

            // La añadimos como hija a una etiqueta ya existente
            root.addContent(adminChild);
            adminChild.addContent(productChild);
            
            try
            {
                Format format = Format.getPrettyFormat();

                /* Se genera un flujo de salida de datos XML */
                XMLOutputter out = new XMLOutputter(format);

                /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                FileOutputStream file = new FileOutputStream(Util.ADMINS_XML_PATH);

                /* Se manda el documento generado hacia el archivo XML */
                out.output(doc,file);

                /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                file.flush();
                file.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return true;
    }
    
    @Override
    public User getUserFromDataBase(String userUsername)
    {
        Document        doc;
        Element         root, child;
        List <Element>  rootChildren;
        String          name, lastName, id, username, email, password;
        User            userGotten = new User();
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);

                username        = child.getAttributeValue(Util.USER_USERNAME_TAG);

                if(username != null          && username.equals(userUsername))
                {
                    userGotten.setName(child.getAttributeValue(Util.USER_NAME_TAG));
                    userGotten.setLastname(child.getAttributeValue(Util.USER_LASTNAME_TAG));
                    userGotten.setId(child.getAttributeValue(Util.USER_ID_TAG));
                    userGotten.setUsername(child.getAttributeValue(Util.USER_USERNAME_TAG));
                    userGotten.setEmail(child.getAttributeValue(Util.USER_EMAIL_TAG));
                    userGotten.setPassword(child.getAttributeValue(Util.USER_PASSWORD_TAG));
                    
                    log.warn("child.getAttributeValue(Util.USER_USERNAME_TAG)" + child.getAttributeValue(Util.USER_USERNAME_TAG));
                    found = true;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return userGotten;
    }
    
    @Override
    public ArrayList getAdminProductsFromDataBase(String adminUsername)
    {
        Document            doc;
        Element             root, child, productChild;
        List <Element>      rootChildren, productsListChildren;
        ArrayList <String>  productsList = new ArrayList<>();
        String              name, lastName, id, username, email, password;
        boolean             found = false;
        int                 pos = 0, pos2 = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.ADMINS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);
                username        = child.getAttributeValue(Util.ADMIN_USERNAME_TAG);
                
                if(username != null          && username.equals(adminUsername))
                {
                    productsListChildren = child.getChildren();
                    
                    while(pos2 < productsListChildren.size()){
                        productChild = productsListChildren.get(pos2);
                        
                        log.warn("productChild.getAttributeValue(Util.PRODUCT_NAME_TAG: " + productChild.getAttributeValue(Util.PRODUCT_NAME_TAG));
                        productsList.add(productChild.getAttributeValue(Util.PRODUCT_NAME_TAG));
                        
                        pos2++;
                    }
                    
                    found = true;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return productsList;
    }
    
    public boolean addProductToAdminInventoryInDataBase(Administrator admin)
    {
        Document        doc;
        Element         root, child, productChild;
        List <Element>  rootChildren;
        String          name, lastName, id, username, email, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.ADMINS_XML_PATH);
            root = doc.getRootElement();
            rootChildren = root.getChildren();

            while(!found && pos < rootChildren.size())
            {
                child = rootChildren.get(pos);

                username        = child.getAttributeValue(Util.ADMIN_USERNAME_TAG);

                if(username != null          && username.equals(admin.getUsername()))
                {
                    // Creamos una nueva etiqueta
                    productChild = new Element(Util.PRODUCT_TAG);
                    
                    Iterator<Product> productIterator = admin.getInventory().getProductsList().iterator();
                    while(productIterator.hasNext()){
                        Product product = productIterator.next();
                        productChild.setAttribute(Util.PRODUCT_NAME_TAG, product.getName());
                        productChild.setAttribute(Util.PRODUCT_CATEGORY_TAG, product.getCategory());
                        productChild.setAttribute(Util.PRODUCT_PRICE_TAG, Double.toString(product.getPrice()));
                        productChild.setAttribute(Util.PRODUCT_QUANTITY_TAG, Integer.toString(product.getQuantity()));
                    }
                    
                    child.addContent(productChild);
                    
                    found = true;
                    
                    try
                    {
                        Format format = Format.getPrettyFormat();

                        /* Se genera un flujo de salida de datos XML */
                        XMLOutputter out = new XMLOutputter(format);

                        /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                        FileOutputStream file = new FileOutputStream(Util.ADMINS_XML_PATH);

                        /* Se manda el documento generado hacia el archivo XML */
                        out.output(doc,file);

                        /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                        file.flush();
                        file.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                else
                {
                    //errores en los campos donde no encontró 
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);

                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return found;
    }
}
