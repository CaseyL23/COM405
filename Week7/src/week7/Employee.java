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
    protected double payRate;
    protected int noContractedHrs;
    protected int Holidays;
    
    
public Employee (String NameIn, double payRateIn, int noContractedHrsIn, int HolidaysIn)
{
    Name = NameIn;
    payRate = payRateIn;
    noContractedHrs = noContractedHrsIn;
    Holidays = HolidaysIn;
    
}

public void setPay(double payRateIn)
{
    payRate = payRateIn;
}

public boolean setnoContractedHrs(int noContractedHrsIn)
{
    if (noContractedHrs <= 40)
    {
        noContractedHrs = noContractedHrsIn;
        return true;
    }
    return false;
}

public double getYearlySalary()
{
    return payRate;
}

public boolean bookHoliday(int reduceBy)
{
    if (Holidays - reduceBy >=0)
    {
        Holidays -= reduceBy;
        return true;
    }
    return false;
}

public String getDetails()
{
    return Name + " " + Holidays + " " + getYearlySalary();
}

}
