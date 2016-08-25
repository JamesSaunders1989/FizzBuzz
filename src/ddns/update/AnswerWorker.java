/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddns.update;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author james
 */
public class AnswerWorker extends SwingWorker<Integer, Integer>

{

    DDNSUpdate dnsup;
    boolean loopy;
    int i;
    Config con;
    String site;
    String update;
    String siteip;
    String ip;
    
    
    public AnswerWorker(DDNSUpdate ddnsup2, boolean lop)
    {
        dnsup = ddnsup2;
        loopy = lop;
    }
    

    protected Integer doInBackground() throws Exception
    {
        try
        {
            System.out.println("before runloop ");
            runLoop();
            
        }
        
        catch(Exception e)
        {
                    
        }
        return 19;
    }
        
//////        // Do a time-consuming task.
////////        Thread.sleep(5000);
//////        loopy = dnsup.getLoop();
//////        i = 0;
//////        
//////        //loopy = true;
//////        
//////        while(loopy == true)
//////        {
//////        loopy = dnsup.getLoop();
//////        con = dnsup.getConfig();
//////        site = con.getProp("Site");
//////        update = con.getProp("URLupdate");
//////        siteip = dnsup.getSiteIP(site);
//////        ip = dnsup.getIP();
//////        i = 5;
//////        System.out.println(i);
//////        
//////        
//////        
//////        try {
//////            dnsup.setIP(update);
//////            Thread.sleep(5000);
//////        } catch (InterruptedException ex) {
//////            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
//////        }
//////        
//////        }
//////        //System.out.println("12");
//////        return i;
//////    }

    protected void done()
    {
        
            System.out.println("dont method?");
//////        loopy = dnsup.getLoop();
//////        i = 0;
//////        
//////        //loopy = true;
//////        
//////        while(loopy == true)
//////        {
//////        loopy = dnsup.getLoop();
//////        con = dnsup.getConfig();
//////        site = con.getProp("Site");
//////        update = con.getProp("URLupdate");
//////        siteip = dnsup.getSiteIP(site);
//////        ip = dnsup.getIP();
//////        i = 5;
//////        System.out.println(i);
//////        
//////        
//////        
//////        try {
//////            dnsup.setIP(update);
//////            Thread.sleep(5000);
//////        } catch (InterruptedException ex) {
//////            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
//////        }
        
//////        }
        
        
        
        
        
        
        
    }
    
    public void runLoop()
    {
        System.out.println("in runloop ");
        loopy = dnsup.getLoop();
        
        while(loopy == true)
        {
        con = dnsup.getConfig();
        site = con.getProp("Site");
        siteip = dnsup.getSiteIP(site);
        update = con.getProp("URLupdate");
        ip = dnsup.getIP();
        
        
        
        try {
            dnsup.setIP(update);
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
    }
    
}