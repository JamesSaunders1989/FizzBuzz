/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddns.update;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

//        BufferedImage trayIconImage = ImageIO.read(getClass().getResource("/path/to/icon.png"));
//        int trayIconWidth = new TrayIcon(trayIconImage).getSize().width;
//        TrayIcon trayIcon = new TrayIcon(trayIconImage.getScaledInstance(trayIconWidth, -1, Image.SCALE_SMOOTH));

        Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Salad/Documents/NetBeans/DNS-updater/src/Images/DDNSUPsmall.png");
        trayIcon = new java.awt.TrayIcon(icon, "DDNS Update");
        
        PopupMenu menu = new PopupMenu();
        trayIcon.setPopupMenu(menu);
        
        
        
        MenuItem aboutItem = new MenuItem("About");
        MenuItem exit = new MenuItem("Exit");
        
        CheckboxMenuItem cbi = new CheckboxMenuItem("Auto Start");
        
        menu.add(aboutItem);
        
        menu.add(cbi);
        menu.addSeparator();
        menu.add(exit);
        
//        ActionListener exitListener;
//        exitListener = new ActionListener() {
//            public void ActionPerformed(ActionEvent e)
//            {
//                System.exit(0);
//            }
//        };
//        exit.addActionListener(exitListener);
                
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
