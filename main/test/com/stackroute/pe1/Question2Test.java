package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question2Test {

    Question2 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question2();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test case for number lies between limit and odd
    @Test
    public void oddNumberTest(){
        String result=ob.oddEven(27);
        assertEquals("Tom",result);
    }

    //Test case for number lies between limit and even
    @Test
    public void evenNumberTest() {
        String result=ob.oddEven(24);
        assertEquals("Jerry",result);
    }

    //test case for number does not lies in the limit
    @Test
    public void outOfLimit() {
        String result=ob.oddEven(12);
        assertEquals("Wrong Entry",result);
    }

}