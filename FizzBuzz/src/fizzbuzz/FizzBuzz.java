/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author James Saunders
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String output = "";
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0)
            {
                output = "FIZZ";
            }
            if (i % 5 == 0)
            {
                output += "BUZZ";
            }
            else if((i % 3) != 0 && (i % 5) != 0)
            {
                output = "" + i;
            }
            System.out.println(output);
            output = "";
        }
    }
    
}
