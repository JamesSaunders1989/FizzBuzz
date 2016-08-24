/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddns.update;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author james
 */

 
public class Config {
 
	
    public static Properties prop = new Properties();
    
    public void saveProp(String title, String value)
    {
        
        try
        {
            prop.setProperty(title, value);
            prop.store(new FileOutputStream("config.tut"), null);
        }
        catch(IOException e)
        {
            
        }
        
    }
    
        public String getProp(String title)
    {
        String value = "";
        try
        {
            prop.load(new FileInputStream("config.tut"));
            value = prop.getProperty(title);
        }
        catch(IOException e)
        {
            
        }
        return value;
    }
    
    
    
    
    
}

