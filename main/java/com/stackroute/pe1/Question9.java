package com.stackroute.pe1;

public class Question9 {
    public String reverse(String string)
    {

        //Checking if anything available to reverse or not
        if(string.length()>0) {
            //Reveresing the string
            String reverse = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                //Concatinating one character from end of the string
                reverse = reverse + string.charAt(i);
            }

            //Displaying the final result
            return reverse;
        }
        else
        {
            return "Nothing to reverse";
        }
    }
}
