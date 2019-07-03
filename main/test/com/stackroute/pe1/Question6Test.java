package com.stackroute.pe1;
import org.junit.*;

import static org.junit.Assert.*;

public class Question6Test {

    Question6 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question6();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test case  for the digit
    @Test
    public void digit(){
        String result=ob.characterCheck('1');
        assertEquals("Digit",result);
    }

    //Test case for the lowercase letter
    @Test
    public void lowerCase(){
        String result=ob.characterCheck('f');
        assertEquals("Small Case Letter",result);
    }

    //test case for the uppercase letter
    @Test
    public void upperCase(){
        String result=ob.characterCheck('V');
        assertEquals("Capital Letter",result);
    }

    //Test case for the special character
    @Test
    public void specialCharacter(){
        String result=ob.characterCheck('#');
        assertEquals("Special Character",result);
    }
}