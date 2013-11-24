package de.orchit.java.introduction.basics;

public class UsesSimpleClass {
    public void useSimpleClass(SimpleClass subject){
        subject.everyone=true;
        subject.onlyVisibleForClassesInSamePackage=1;
        subject.onlyVisibleForSubClassesAndSamePackage=2.0;
        //subject.onlyVisibleInClass = "Doesn't work!";

        //won't work as Test3 is private!
        //new SimpleClass.Test.Test1.Test2.Test3.Test4();
    }

    public UsesSimpleClass() {
        //You can do initialization stuff here
    }
}
