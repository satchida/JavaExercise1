package com.stackroute.pe1;

public class Question10 {
    public String repeat(String string, int n) {

        //length of the string
        int length = string.length();
        String result = "";
        //Check whether repeating length is not greater than the length of the screen
        if (n > length) {
            result = result + "It's impossible as length of string is shorter";

        } else {
            String repeat = string.substring(length - n);

            //Generating the final output
            result = result + string;//Final result to be displayed
            //Adding the repeated part
            for (int i = 1; i <= n; i++) {
                //Concatinating the repeated part
                result = result + repeat;
            }
        }

            //Displaying the final result
            return result;



    }
}