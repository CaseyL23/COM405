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
        Employee em = new Employee("Susan",12500,37,28);
        
        Manager mg = new Manager("Sam",27150,42,30,19,100);
        
        FrontLineStaff fs = new FrontLineStaff("Kelly",9,37,30,12);
        
        Admin am = new Admin("Jonah",800,37,25,9,7);
        
        System.out.println(em.getDetails());
        
        System.out.println(mg.getDetails());
        
        System.out.println(fs.getDetails());
        
        System.out.println(am.getDetails());
        
        
        
    }
    
}
