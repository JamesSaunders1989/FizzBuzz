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
    
    public Interface interfacey;
    public boolean booleanstart;
    
    CheckboxMenuItem cbi = new CheckboxMenuItem("Auto Start");
//    public static void main(String[] args)
//    {
//        Trayicon trayloader = new Trayicon();
//        trayloader.addTray();
//    }
//    
    
    
    public Trayicon(Interface int1)
    {
        interfacey = int1;
        addTray();
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
        
        trayIcon.setImageAutoSize(true);
        
        PopupMenu menu = new PopupMenu();
        trayIcon.setPopupMenu(menu);
        
        
        MenuItem show = new MenuItem("Show");
        MenuItem exit = new MenuItem("Exit");
        
        
        
        
        
        
        menu.add(show);
        menu.add(cbi);
        menu.addSeparator();
        menu.add(exit);
        

        
        
        ActionListener exitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        };
        exit.addActionListener(exitListener);
          
        
        show.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                interfacey.setVisible(true);
                boolean boo1 = interfacey.con.getProp("Startup").equalsIgnoreCase("true");
                interfacey.setjCheckboxSet(boo1);
            }
        });
        
        cbi.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                interfacey.boostart = cbi.getState();
                interfacey.runonstart = "" + cbi.getState();
                interfacey.setjCheckboxSet(cbi.getState());
                interfacey.con.saveProp("Startup", "" + cbi.getState());
            }
        });
        
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
    
    
    public void setcheckbox(boolean boostart)
    {
        booleanstart = boostart;
        cbi.setState(boostart);
    }
    
    
}
