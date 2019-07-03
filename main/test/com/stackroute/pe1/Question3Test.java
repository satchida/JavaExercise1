package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class Question3Test {

    Question3 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question3();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test case for a single character
    @Test
    public void singleCharacter(){
        String result=ob.consonantVowel("p");
        assertEquals("Consonant",result);
    }

    //Test case for multiple characters to check
    @Test
    public void multipleCharacter(){
        String result=ob.consonantVowel("ap");
        assertEquals("VowelConsonant",result);
    }

    //Test case if any special character found
    @Test
    public void notWord(){
        String result=ob.consonantVowel("ap#");
        assertEquals("Not a Word",result);
    }
}