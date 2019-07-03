package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question10Test {

    Question10 ob;
    @Before
    public void setUp() throws Exception {
        ob=new Question10();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test cases for repeating last few characters
    @Test
    public void repeatThreeCharacter(){
        String result=ob.repeat("ABCDEF",3);
        assertEquals("ABCDEFDEFDEFDEF",result);
    }
    @Test
    public void repeatFiveCharacter(){
        String result=ob.repeat("stackroute",5);
        assertEquals("stackrouterouterouterouterouteroute",result);
    }

    //test cases fir if the enetered number of character is more than the length of the entered string
    @Test
    public void repeatSixCharacters(){
        String result=ob.repeat("route",6);
        assertEquals("It's impossible as length of string is shorter",result);
    }
}