package com.stackroute.pe1;


public class Question1 {
    public String pallin(long number)
    {

        //Save the original number for future reference
        long original_no=number;//Same number taken from user stored
        long reverse=0;//Reversed Number
        int sum_even=0;//Sum of even integers
        String string="";

        //Reversing the number
        while(number>0)
        {
            long reminder=number%10;

            //Checking the digit is whether odd or even
            if((reminder%2)==0)
            {
                sum_even=sum_even +(int)reminder;
            }
            number=number/10;
            reverse=(reverse*10)+reminder;
        }

        //Checking whether the number is same with reversed no or not
        if(original_no==reverse) {
            String s=String.valueOf(original_no);
            string=string+s;
            string=string+" is palindrome";


            //Checking whether sum of even integers is greater than 25 or not
            if(sum_even>25){
                string=string+" and the sum of even numbers is greater than 25.";
            }
            else{
                string=string+" and the sum of even numbers is less than 25.";
            }
        }
        else{
            String s=String.valueOf(original_no);
            string=string+s;
            string=string+" is not palindrome";
        }
        return string;

    }
}
