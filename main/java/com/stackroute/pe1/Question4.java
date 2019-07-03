package com.stackroute.pe1;

public class Question4 {
    public String pattern(int number)
    {
        String string="";//Initializing the error

        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                String n = String.valueOf(i);//Converting the integer in to String
                string=string+n;//Concatinating the string
                string=string+" ";
            }
        }
        return string;//Returning the string
    }
}
