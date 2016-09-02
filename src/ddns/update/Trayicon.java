/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddns.update;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

/**
 *
 * @author Salad
 */
public class Trayicon {
    
    
   
    public static TrayIcon trayIcon;
    
    
    public static void main(String[] args)
    {
        Trayicon trayloader = new Trayicon();
        trayloader.addTray();
    }
    
    
    public void addTray()
    {
        if(!SystemTray.isSupported())
        {
            System.err.println("[Error] your System doesnt support Tray icon");
        }
        else
        {
            System.out.println("Your System is up to date enough for Tray icon");
        }
        Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Salad/Documents/NetBeans/DNS-updater/src/Images/DDNSUPsmall.png");
        trayIcon = new java.awt.TrayIcon(icon, "DDNS Update");
        
        PopupMenu menu = new PopupMenu();
        trayIcon.setPopupMenu(menu);
        
        
        
        MenuItem aboutItem = new MenuItem("About");
        
        menu.add(aboutItem);
        
        try
        {
            SystemTray tray = SystemTray.getSystemTray();
            tray.add(trayIcon);
        }
        catch (AWTException error)
        {
            error.printStackTrace();
        }
        
    }
    
    
}
