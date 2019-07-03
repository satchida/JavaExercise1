package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question8Test {

    Question8 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question8();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test case for if the number matches the original number
    @Test
    public void match(){
        String result=ob.guess(76);
        assertEquals("Number guessed is matches the original number",result);
    }

    //Test case for if the number greater than guessed number
    @Test
    public void larger(){
        String result=ob.guess(79);
        assertEquals("Number guessed is more than original number",result);
    }

    //Test case for the number smaller than the guessed number
    @Test
    public void smaller(){
        String result=ob.guess(59);
        assertEquals("Number guessed is less than original number",result);
    }

    //Test case for number lesser tahn the limit
    @Test
    public void outOfLimitSmaller(){
        String result=ob.guess(12);
        assertEquals("You are out of Limit",result);
    }

    //Test case for number greater than the limit
    @Test
    public void outOfLimitLarger(){
        String result=ob.guess(142);
        assertEquals("You are out of Limit",result);
    }
}