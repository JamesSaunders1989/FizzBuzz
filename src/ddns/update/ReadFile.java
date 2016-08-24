
package ddns.update;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author james
 */
public class ReadFile {
    
    FileWriter filewriter;
    FileReader filereader;
    BufferedWriter bufferwriter;
    BufferedReader bufferreader;
    String fileName = "temp.txt";
    
    
    
    public void readFile()
    {
    try
        {
        filereader = new FileReader(fileName);
        bufferreader = new BufferedReader(filereader);
            
        String line = "";
        String reline = "";
        while ((line = bufferreader.readLine())!=null)
        {
            //reline = reline + line;
            System.out.println("Reading " + line);
            
        }
        
        //return reline;
        
        bufferreader.close();
        }
        catch(Exception e)
        {
            //return e.toString();
        }
    
    }
    
    
    
}
