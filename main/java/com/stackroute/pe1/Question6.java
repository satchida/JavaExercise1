package com.stackroute.pe1;

public class Question6 {
    public String characterCheck(char chara)
    {
       String string;
        int a=(int)chara;//Finded the ASCII value of the character enetered by the user


        if((a>47) && (a<58))//Checking the ASCII value for the digit
        {
            string="Digit";
        }
        else if((a>64) && (a<91))//Checking the ASCII value for the Upper Case letter
        {
            string="Capital Letter";
        }
        else if((a>96) && (a<123))//Checking for the lower Case letter
        {
            string="Small Case Letter";
        }
        else//Default is the Special Character
        {
            string="Special Character";
        }
        return string;
    }
}
