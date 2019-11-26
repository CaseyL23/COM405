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
public abstract class Vehicle 
{
    protected String regNo;
    protected double weight;
    public abstract double calculatefee();
    
    public Vehicle(String regNoIn, double weightIn)
    {
        regNo = regNoIn;
        weight = weightIn;
    }
    
    public String getregNo()
    {
        return regNo;
    }
    
    public double getweight()
    {
        return weight;
    }
    
        
}
