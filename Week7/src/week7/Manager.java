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
public class Manager extends Employee
{
    private int bonus;
    
  public Manager(String NameIn, double payRateIn, int noContractedHrsIn, int HolidaysIn, int hourlyRateIn, int bonusIn)  
  {
      super (NameIn, payRateIn, noContractedHrsIn, HolidaysIn);
      bonus = bonusIn;
  }
  public boolean setBonus(int bonusIn)
  {
      if(bonusIn >= 0 && bonusIn <=100)
      {
          bonus = bonusIn;
          return true;
      }
      return false;
  }
}
