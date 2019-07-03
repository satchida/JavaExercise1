package com.stackroute.pe1;

public class Question8 {
    public String guess(int number){

        String result="";//result string initialized
        int guess=76;//Guessed number

        if(guess==number)//Entered number matches with the guessed number
        {
            result=result+"Number guessed is matches the original number";
        }
        else if((number<guess) && (number>50))//Number entered less than the guessed number
        {
            result=result+"Number guessed is less than original number";
        }
        else if((number>guess) && (number<=100))//Number entered greater than the guessed number
        {
            result=result+"Number guessed is more than original number";
        }
        else//If the entered number is out of limit
        {
            result=result+"You are out of Limit";
        }
        return result;

    }
}
