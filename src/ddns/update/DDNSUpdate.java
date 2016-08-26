
package ddns.update;

import java.net.*;
import java.io.*;

/**
 *
 * @author james
 */
public class DDNSUpdate {

    
    boolean loop = false;
    Config con;
    String site;
    String update;
    int delay;
    
    public DDNSUpdate(String site2, String updateurl)
    {
        site = site2;
        update = updateurl;
        
    }

    public static void main(String[] args) {
        
    }
    
    public String getIP()
    {
        try
        {
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
        
        String ip = in.readLine();
        return ip;
        }
        catch(Exception e)
        {
            return e.toString();
        }
                
    }
    
    public String getSiteIP(String site)
    {
        try
        {
        InetAddress getAddress = java.net.InetAddress.getByName(site);
        String address = getAddress.getHostAddress();
        return address;
        }
        catch(Exception e)
        {
            return e.toString();
        }
    }
                
    
    public boolean getLoop()
    {
        return loop;
    }
    
    public void setLoop(boolean lop)
    {
        loop = lop;
    }
    
    public String getSite()
    {
        return site;
    }
    
    public void setSite(String si)
    {
        site = si;
    }
    
    public String getUpdateURL()
    {
        return update;
    }
    
    public void setUpdateURL(String up)
    {
        update = up;
    }
    
    public int getDelay()
    {
        return delay;
    }
    
    public void setDelay(int del)
    {
        delay = del;
    }
    
    public void setConfig(Config con1)
    {
        con = con1;
    }
    
    public Config getConfig()
    {
        return con;
    }
    
    public String setIP(String update)
    {
        URL url;

        try {
            // get URL content

            String a=update;
            url = new URL(a);
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                    //System.out.println(inputLine);
            }
            br.close();

            System.out.println("Done");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return "updating url";
        

    }


    
    void writeNewLine()
    {
        
    }
    
    void writeDateTime()
    {
        
    }
    
    void writeToFile(String str2)
    {
        
    }
    
    
    
}
