/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddns.update;

/**
 *
 * @author james
 */
public class MyThread extends Thread{
    
    
    boolean loopy = false;
    
    
    public void setLoop(boolean lo)
    {
        loopy = lo;
    }
    
    
    public void run()
    {

        System.out.println("running 1");
      
        }
    
    }
    
    

