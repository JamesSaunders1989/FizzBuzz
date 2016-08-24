/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddns.update;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author james
 */
public class UpdateLoop implements Runnable {
    
    String update = null;
    boolean loopy = false;
    
    public UpdateLoop(String site2)
    {    
        update = site2;
    }
    
    public UpdateLoop()
    {    
        
    }
    
    public void run()
    {
        loopy = true;
        
//        URL url;
//
//        try {
//            // get URL content
//
//            String a=update;
//            url = new URL(a);
//            URLConnection conn = url.openConnection();
//
//            // open the stream and put it into BufferedReader
//            BufferedReader br = new BufferedReader(
//                               new InputStreamReader(conn.getInputStream()));
//
//            String inputLine;
//            while ((inputLine = br.readLine()) != null) {
//                    //System.out.println(inputLine);
//            }
//            br.close();
//
//            System.out.println("Done");
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//        //return "updating url";
        System.out.println("updating12");
        if (loopy == true)
        {
            run();
        }
        else
        {
            
        }
    }
    
    public static void main(String args[])
    {
        //(new MyThread(new UpdateLoop())).start();
    }
    
}
