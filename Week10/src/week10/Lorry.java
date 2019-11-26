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
public class Lorry extends Vehicle
{
    public Lorry(String regNoIn, double weightIn)
    {
        super (regNoIn, weightIn);
    }
    
    @Override
    public double calculateFee()
    {
        if(weight <= 8000)
       {
        return 10.00;
                      
       }
        return 15.00;
    }
    
}
