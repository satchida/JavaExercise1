package com.stackroute.pe1;


public class Question2 {
    public String oddEven(int number)
    {

        if((number>=20) && (number<=30))//Checked the number whether lies between 20 and 30 or not
        {
            if((number%2)==0)//Checked whether the number is odd or even
            {
                return("Jerry");//Displays if even
            }
            else
            {
                return("Tom");//Displays if odd
            }
        }else{
            return("Wrong Entry");//If number does not lies between the limit
        }
    }
}
