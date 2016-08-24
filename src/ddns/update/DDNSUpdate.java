
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
                
    
    
    
    public String setIP(String update)
    {
        return "updating";
        //UNCOMENT FROM HERE
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
//        return "updating url";
        //UNCOMMENT TO HERE

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
