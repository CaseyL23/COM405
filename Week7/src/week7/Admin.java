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
public class Admin extends Manager 
{
    protected String Manager;
    
    public Admin(String NameIn, double payRateIn, int noContractedHrsIn, int HolidaysIn, int hourlyRateIn, int bonusIn) {
        super(NameIn, payRateIn, noContractedHrsIn, HolidaysIn, hourlyRateIn, bonusIn);
    }
    
    public String getManager()
    {
        return Manager;
    }
}
