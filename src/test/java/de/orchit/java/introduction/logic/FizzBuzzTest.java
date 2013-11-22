package de.orchit.java.introduction.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz=new FizzBuzzImpl();
    }

    @Test
    public void buzzMeReturnsFizzFor3() {
        assertEquals("Fizz", fizzBuzz.buzzMe(3));
    }

    @Test
    public void buzzMeReturnsBuzzFor5() throws Exception {
        //todo
    }

    @Test
    public void buzzMeReturnsFizzBuzzFor15() throws Exception {
        //todo
    }

    @Test
    public void buzzMeReturns2For2() throws Exception {
        //todo
    }

    @Test
    public void buzzMeReturns7For7() throws Exception {
        //todo
    }

    @Test
    public void buzzMeReturnsFizzFor6() throws Exception {
        //todo
    }

    @Test
    public void buzzMeReturnsBuzzFor10() throws Exception {
        //todo
    }

}
