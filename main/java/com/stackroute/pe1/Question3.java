package com.stackroute.pe1;


public class Question3 {
    public String consonantVowel(String word){

        int l=word.length();//Finding the length of the word
        int iw=0;//Index to check whether it is a word or not
        int z=0;//Index if it is a word print vowel or consonant
        int flag=0;//Flag to check whether it is a word or not
        String string="";

        //Checking whether any special character found
        while(l>iw) {
            if (((word.charAt(iw)) < 'a') || ((word.charAt(iw)) > 'z')) {

                //If any special character found the it is not aword
                string=string+"Not a Word";
                flag = 1;
                break;
            }
            iw++;
        }

        //If it is a word then display the list
        if(flag==0)
        {
                while(l>z)
                {
                    if((word.charAt(z))=='a' || (word.charAt(z))=='e' || (word.charAt(z))=='i' || (word.charAt(z))=='o' ||(word.charAt(z))=='u' || (word.charAt(z))=='A' || (word.charAt(z))=='E' || (word.charAt(z))=='I' || (word.charAt(z))=='O' ||(word.charAt(z))=='U')
                    {
                        string=string+"Vowel";
                    }
                    else
                    {
                        string=string+"Consonant";
                    }
                     z++;
                }
        }
        return string;
    }
}
