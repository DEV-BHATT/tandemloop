/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

/**
 *
 * @author dattd
 */
import java.util.*;
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Number");
        input=sc.nextInt();
        List<Integer>ar= new ArrayList<Integer>();
        int temp =1;
        ar.add(temp);
        if(input % 2 == 0){
            input-=1;
            
        }
        for(int i=1;i<input;i++){
            temp +=2;
        ar.add(temp);
        temp =ar.get(i);
        
        }
    System.out.println(ar);
    
}
}


    
    

