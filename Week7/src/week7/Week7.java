/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 4littc85
 */
public class Week7 {

    
    public static void main(String[] args) {
        Employee em = new Employee("Susan",1200,37,28);
        
        Manager mg = new Manager("Sam",2750,42,30,19,100);
        
        System.out.println(em.getDetails());
        
        System.out.println(mg.getDetails());
        
        
        
    }
    
}
