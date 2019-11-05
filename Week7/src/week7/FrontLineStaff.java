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
public class FrontLineStaff extends Employee
  {      
        protected int hourlyRate;

        public FrontLineStaff(String NameIn, double payRateIn, int noContractedHrsIn, int HolidaysIn, int hourlyRateIn)
    {
        super (NameIn, payRateIn, noContractedHrsIn, HolidaysIn);
        hourlyRate = hourlyRate;
    }

        public int gethourlyRate ()
{
        return hourlyRate;
}

}
