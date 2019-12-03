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
public class Motorbike extends Vehicle 
{
    public Motorbike(String regIn, int weightIn)
    {
        super(regIn, weightIn);
    }

    @Override
    public double calcFee() {
        return 3.0;
    }
    
}
