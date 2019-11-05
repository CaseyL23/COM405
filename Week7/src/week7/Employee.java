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
public class Employee 
{
    protected String Name;
    protected String payRate;
    protected double noContractedHrs;
    protected double Holidays;
    
    
public Employee (String NameIn, String payRateIn, double noContractedHrsIn, double HolidaysIn)
{
    Name = NameIn;
    payRate = payRateIn;
    noContractedHrs = noContractedHrsIn;
    Holidays = HolidaysIn;
    
}

public String getName()
{
    return Name;
}






}
