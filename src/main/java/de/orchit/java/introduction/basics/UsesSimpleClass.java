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

    public void thisMayBeConfusing(){
        SimpleClass test1 = new SimpleClass();
        //Works:
        test1.getInstance().myMagicMethod();
        //Works not of course, as reverse is only defined in InheritedSimpleClass
        //test1.getInstance().reverse("1234");

        InheritedSimpleClass test2 = new InheritedSimpleClass();
        //Works:
        test2.getInstance().myMagicMethod();
        //Works of course, as reverse is defined in InheritedSimpleClass
        test2.getInstance().reverse("1234");

        //Now it gets tricky, a InheritedSimpleClass is a SimpleClass, so we
        // can assign it to a SimpleClass Variable
        SimpleClass test3 = new InheritedSimpleClass();
        //Works:
        test3.getInstance().myMagicMethod();
        //Works not of course, as reverse is only defined in InheritedSimpleClass
        // and the compiler only knows that test3 is of type SimpleClass
        //test3.getInstance().reverse("1234");

        //There is a trick to get around this called "cast". Sometimes you need
        // to do that but it is almost always a sign of flawed software design
        ((InheritedSimpleClass) test3).getInstance().reverse("1234");
    }
}
