package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question4Test {

    Question4 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question4();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Basic test cases for different numbers
    @Test
    public void one(){
        String result=ob.pattern(1);
        assertEquals("1 ",result);
    }
    @Test
    public void three(){
        String result=ob.pattern(3);
        assertEquals("1 2 2 3 3 3 ",result);
    }
    @Test
    public void six(){
        String result=ob.pattern(6);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 ",result);
    }
}