
package ddns.update;

import java.net.*;
import java.io.*;

/**
 *
 * @author james
 */
public class DDNSUpdate {


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
    
    public String getSiteIP()
    {
        try
        {
        InetAddress getAddress = java.net.InetAddress.getByName("mrsaladbowl.com");
        String address = getAddress.getHostAddress();
        return address;
        }
        catch(Exception e)
        {
            return e.toString();
        }
    }
                
    
    
    
    public void setIP()
    {
        
    }
    
    
    
    
}
