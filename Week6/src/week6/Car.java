/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 4littc85
 */
public class Car 
{
//Attribute
    private String regNo;
    
    
    //Getter
    public String getRegNo()
    {
        return regNo;
    }
    
    //Setter
    public void setRegNo (String regNoIn)
    {
      regNo = regNoIn;  
    }
    
    private Car[] car;
    
   //Constructor
    public Car()
    {
        car = new Car[15];
    }
    
    public boolean addCar (Car carIn)
    {
        for(int i = 0; i< car.length; i++)
        {
            if(car[i] == null)
            {
                car[i] = carIn;
                return true;
            }
        }
       return false;
    }
        
}
