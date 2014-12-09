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
    public boolean readUserFromDataBase(User user)
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

                name            = child.getAttributeValue(Util.USER_NAME_TAG);
                lastName        = child.getAttributeValue(Util.USER_LASTNAME_TAG);
                id              = child.getAttributeValue(Util.USER_ID_TAG);
                username        = child.getAttributeValue(Util.USER_USERNAME_TAG);
                email           = child.getAttributeValue(Util.USER_EMAIL_TAG);
                password        = child.getAttributeValue(Util.USER_PASSWORD_TAG);
                

                if(name     != null          && name.equals(user.getName()) &&
                   lastName != null          && lastName.equals(user.getLastname()) &&
                   username != null          && username.equals(user.getUsername()) &&
                   id       != null          && username.equals(user.getUsername()) &&
                   email    != null          && email.equals(user.getId())  &&
                   password != null          && password.equals(user.getPassword()))
                   
                {
                    found = true;
                }
                else
                {
                    //errores en los campos donde no encontró 
                    if (name == null)
                        System.out.println(Util.ERROR_USER_NAME_TAG);

                    if (lastName == null)
                        System.out.println(Util.ERROR_USER_LASTNAME_TAG);
                    
                    if (id == null)
                        System.out.println(Util.ERROR_USER_ID_TAG);
                    
                    if (username == null)
                        System.out.println(Util.ERROR_USER_NICKNAME_TAG);
                    
                    if (email == null)
                        System.out.println(Util.ERROR_USER_MAIL_TAG);
                    
                    if (password == null)
                        System.out.println(Util.ERROR_USER_PASSWORD_TAG);
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
}
