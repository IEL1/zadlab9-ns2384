/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.Random;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
     
        //Zad 1
        
     /* int[] tab = new int[100];
        System.out.println("Losowanie:");
        Random r = new Random();
            
            for(int i=0;i<100;i++)
            {
                    tab[i]=r.nextInt();
                    System.out.println(tab[i]);
            }
            
        System.out.println("Sortowanie: ");
        Arrays.sort(tab);
        for(int i=0;i<100;i++)
        {
            System.out.println(tab[i]);
        }
        }
       */
   
    //Zad 2
     int a;
     
     Random r = new Random();
     TreeSet x = new TreeSet();
     for(int i=0; i<100; i++)
     {
         a = r.nextInt();
         x.add(a);
     }
     Iterator it = x.iterator();
     while(it.hasNext())
     {
         System.out.println(it.next());
     }
    }
    
    
           
    
}
