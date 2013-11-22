package de.orchit.java.introduction.logic;


/**
 * FizzBuzz needs to print Fizz when the given number
 * is dividable with 3, when the number is dividable with
 * 5 then it returns buzz. When it's dividable with 15 then it needs to return FizzBuzz.
 * In every other case it returns the given number.
 */
public interface FizzBuzz {
    String buzzMe(int number);
}
