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
    private String Name;
    private double payRate;
    private int noContractedHrs;
    private int Holidays;
    
    
public Employee (String NameIn, double payRateIn, int noContractedHrsIn, int HolidaysIn)
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

public double getpayRate ()
{
    return payRate;
}

public int getnoContractedHrs ()
{
    return noContractedHrs;
}

public int getHolidays ()
{
    return Holidays;
}

}
