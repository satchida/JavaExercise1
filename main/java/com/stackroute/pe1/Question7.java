package com.stackroute.pe1;

public class Question7 {
    public String nonDecreasing(int number){

        int[] arr=new int[100];
        int i=0;//Index of the array while enytering the digits of the number in an array
        int se=0;//Sum of even integers
        int ndn=0;//Non descending number
        String string;
        //Inserting the number in an array along with finding the sum of even integers
        while(number>0)
        {
            int reminder=(int)(number%10);
            number=number/10;
            arr[i]=reminder;
            i++;
            //Sum of evev integers of the number
            if(reminder%2==0)
            {
                se=se+reminder;
            }
        }
        //Sorting the array in non-increasing order
        for (int a = 0; a< i-1; a++)

            for (int b = 0; b < i-a-1; b++)
                if (arr[b] < arr[b+1])
                {
                    int temp=arr[b+1];
                    arr[b+1]=arr[b];
                    arr[b]=temp;
                }
        //Creating the non-increasing number from the array
        for(int k=0;k<i;k++) {
            ndn=ndn*10+arr[k];
        }
        String ndnu=String.valueOf(ndn);
        string="Sorted number in non-increasing order : ";
        string=string+ndnu;
        string=string+"\n";
        string=string+"\nSum of even numbers :";
        String soe=String.valueOf(se);
        string=string+soe;
        //Checking whether the sum of even integers is more than 15 or not
        if(se>15){
            string=string+"\n\nTrue";
        }else{
            string=string+"\n\nFalse";
        }
        return  string;

    }
}