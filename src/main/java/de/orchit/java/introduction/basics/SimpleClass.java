package de.orchit.java.introduction.basics;


public class SimpleClass {
    private String onlyVisibleInClass;
    int onlyVisibleForClassesInSamePackage;
    protected double onlyVisibleForSubClassesAndSamePackage;
    public boolean everyone;

    void myMagicMethod(){
        //I can do magic here - for real!
        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;
        System.out.println(x == y); //this will print out false!
    }

    SimpleClass getInstance(){
        return new SimpleClass();
    }
}
