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
    
    
    public AnswerWorker(DDNSUpdate ddnsup2, boolean lop)
    {
        dnsup = ddnsup2;
        loopy = lop;
    }
    

    protected Integer doInBackground() throws Exception
    {
        // Do a time-consuming task.
//        Thread.sleep(5000);
        
           
        loopy = dnsup.getLoop();
        
    while(loopy == true)
        {
        Config con = dnsup.getConfig();
        String site = con.getProp("Site");
        String siteip = dnsup.getSiteIP(site);
        String ip = dnsup.getIP();
        
        
        
        try {
            dnsup.setIP(site);
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        //System.out.println("12");
        return 12;
    }

    protected void done()
    {
        try
        {
            //JOptionPane.showMessageDialog(f, get());
            System.out.println(get());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void runLoop()
    {
        
        loopy = dnsup.getLoop();
        
    while(loopy == true)
        {
        Config con = dnsup.getConfig();
        String site = con.getProp("Site");
        String siteip = dnsup.getSiteIP(site);
        String ip = dnsup.getIP();
        
        
        
        try {
            dnsup.setIP(site);
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
    }
    
}