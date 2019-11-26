/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author 4littc85
 */
public class Car extends Vehicle 
{
public Car(String regNoIn, double weightIn)
    {
        super (regNoIn, weightIn);
    }
    
    @Override
    public double calculateFee()
    {
       if(weight <= 1590)
       {
        return 5.00;
                      
       }
       
       return (weight - 1590);
    }
    
}
