package de.orchit.java.introduction.basics;

public class UsesSimpleClass {
    public void useSimpleClass(SimpleClass subject){
        subject.everyone=true;
        subject.onlyVisibleForClassesInSamePackage=1;
        subject.onlyVisibleForSubClassesAndSamePackage=2.0;
        //subject.onlyVisibleInClass = "Doesn't work!";
    }
}