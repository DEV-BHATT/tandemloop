/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soultion;
import java.util.Scanner;

/**
 *
 * @author dattd
 */
public class Soultion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n,i;
        System.out.println("Please Enter the Number");
        Scanner scan =new Scanner(System.in);
       n= scan.nextInt();
       scan.close();
       
       for(i=1;i<=2*n;i++){
    
      if(i%2==0)
      {
          System.out.println();
      }
          
          else
      
          System.out.println(i);
      
       }
    }
    
}
