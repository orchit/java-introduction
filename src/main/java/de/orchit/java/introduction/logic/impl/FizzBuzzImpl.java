package de.orchit.java.introduction.logic.impl;


import de.orchit.java.introduction.logic.FizzBuzz;

public class FizzBuzzImpl implements FizzBuzz {
    @Override
    public String buzzMe(int number) {
        String result = "";
        if (number % 3 == 0 || number % 5 == 0) {
            result += (number % 3 == 0) ? "Fizz" : "";
            result += (number % 5 == 0) ? "Buzz" : "";
        } else {
            result += number;
        }
        return result;
    }
}
