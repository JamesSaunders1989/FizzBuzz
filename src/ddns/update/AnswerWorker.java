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
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    JTextArea jTextFieldLoop;
    DateTime date;
    
    
    public AnswerWorker(DDNSUpdate ddnsup2)
    {
        dnsup = ddnsup2;
        loopy = dnsup.getLoop();
        jTextFieldLoop = dnsup.getJTextFieldLoop();
        date = new DateTime();
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
        
        try
        {
            
            System.out.println("done method?");
            get();
            
        }
        
        catch (Exception e)
        {
                    
        }
            
        
        
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
    
    
    
    public void runLoop() throws InterruptedException
    {
        System.out.println("in runloop ");
        loopy = true;
        //loopy = dnsup.getLoop();
        int cal = dnsup.getDelay();
        int l = 0;
        String loopoutput = "";
        
        //Thread.sleep(cal);
        
        while(loopy == true)
        {
        
        try {
        l++;
        //loopoutput = loopoutput + "Starting update Loop " + l + "   " + date.getDate() + "\n";
        jTextFieldLoop.setText("Starting update loop " + l + "   " + date.getDate() + "\n" + jTextFieldLoop.getText());
        loopy = dnsup.getLoop();
        System.out.println("after getLoop ");
        con = dnsup.getConfig();                    //gets config file
        System.out.println("after getConfig ");
        site = dnsup.getSite();                 //gets site to check ip address of from config file
        System.out.println("after getProp site ");
        siteip = dnsup.getSiteIP(site);             //checks ip of site
        System.out.println("after getSiteIP ");
        update = dnsup.getUpdateURL();          //gets update url from the config file
        System.out.println("after getProp URLupdate ");
        ip = dnsup.getIP();                         //gets local ip
        System.out.println("getIP ");
        System.out.println("in while loop ");
        
        dnsup.setSiteTextField(siteip);
        dnsup.setIPTextField(ip);
        
        dnsup.setIP(update);
        
        TimeUnit.MINUTES.sleep(cal);
        //Thread.sleep(cal);
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
    
    }
    
}