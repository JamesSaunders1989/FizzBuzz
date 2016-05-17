
package ddns.update;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author james
 */
public class WriteFile {
     
    String fileName = "temp.txt";
    

    
    
    
    public void writeToFile(String str)
    {
        try
	{	
	FileWriter file = new FileWriter(str);

        BufferedWriter buffer = new BufferedWriter( file );

        buffer.append(str);
        buffer.newLine();
                        
        System.out.println("WritingFile: " + str);

        buffer.close();
        }
        catch( IOException e )
        {
        System.out.println( "A write error has occurred." );
        }
                        
        
    }
    
     
    
    
}
