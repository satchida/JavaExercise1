package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question7Test {

    Question7 ob;

    @Before
    public void setUp() throws Exception {
        ob = new Question7();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    //Different test cases
    @Test
    public void numberFalse(){
        String result=ob.nonDecreasing(234534);
        assertEquals("Sorted number in non-increasing order : 544332\n\nSum of even numbers :10\n\nFalse",result);
    }
    @Test
    public void numberTrue(){
        String result=ob.nonDecreasing(234534222);
        assertEquals("Sorted number in non-increasing order : 544332222\n\nSum of even numbers :16\n\nTrue",result);
    }
    @Test
    public void otherNumber(){
        String result=ob.nonDecreasing(7634582);
        assertEquals("Sorted number in non-increasing order : 8765432\n\nSum of even numbers :20\n\nTrue",result);
    }
}