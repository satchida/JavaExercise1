package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question1Test {

    Question1 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question1();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test Case for pallindrome number and and sum of even integers greater than 25
    @Test
    public void pallinGreater(){
        String result=ob.pallin(2468642);
        assertEquals("2468642 is palindrome and the sum of even numbers is greater than 25.",result);
    }


    //Test case for number is not a pallindrome number
    @Test
    public void notPallin() {
        String result=ob.pallin(12345);
        assertEquals("12345 is not palindrome",result);
    }

    //Test case for number is a pallindrome number but sum of even integers is less than 25
    @Test
    public void pallinLesser() {
        String result=ob.pallin(2456542);
        assertEquals("2456542 is palindrome and the sum of even numbers is less than 25.",result);
    }

}