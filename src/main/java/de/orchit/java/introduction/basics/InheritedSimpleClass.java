package de.orchit.java.introduction.basics;

public class InheritedSimpleClass extends SimpleClass{

    @Override
    void myMagicMethod() {
        int output= 1;
        super.myMagicMethod();
        output=2;
    }

    void myMagicMethod(int initialOutput) {
        int output= initialOutput;
        super.myMagicMethod();
        output=2;
    }

/*  This doesn't work, because we can only modify the parameter list or do "compatible refinements" of the return value
    int myMagicMethod() {
        int output= 1;
        super.myMagicMethod();
        output=2;
        return output;
    }    */

    public String reverse(String input){
        String output="";
        while(input.length()>0){
            output=input.charAt(0)+output;
            input=input.substring(1);
        }
        return output;
    }

    @Override //This works, because InteritedSimpleClass "is a" SimpleClass
    InheritedSimpleClass getInstance() {
        return new InheritedSimpleClass();
    }
}
