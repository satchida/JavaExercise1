package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question9Test {

    Question9 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question9();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test case for reversing the string of capital letter
    @Test
    public void capitalReverse(){
        String result=ob.reverse("ABCDEF");
        assertEquals("FEDCBA",result);
    }

    //Test case for reversing the string of smaller letter
    @Test
    public void smallerReverse(){
        String result=ob.reverse("abcdefg");
        assertEquals("gfedcba",result);
    }
    @Test
    public void smallerReverse1(){
        String result=ob.reverse("london");
        assertEquals("nodnol",result);
    }
    //test case for reversin the null string
    @Test
    public void nothingToReverse(){
        String result=ob.reverse("");
        assertEquals("Nothing to reverse",result);
    }
}