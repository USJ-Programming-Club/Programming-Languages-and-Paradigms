import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import NonGenericClasses.*;
import GenericClasses.*;

class MyClass {
    @Override
    public String toString() {
        return "My Class";
    }
}


public class Main {

    //Map<K, V> (Key, Value)
    //List<E> (Element)
    //Person<T> (Type)
    //N for Number

    public static void main(String[] args) {

        Integer myInteger = 2;

        Boolean myBoolean = true;

        //Motivation for Generics: Either a different class for every list type, or allowing any type like below

        List intList = new ArrayList(); // a list of integers, assuming lists have no generics
        intList.add("test"); // adding a String, compiler allows it
//        Integer i = (Integer)intList.get(0); // Run time exception (String cannot be cast to Integer)

        //Type erasure:

        //Class Checking:
        // <> is the diamond operator ; before Java 1.7, writing new ArrayList<Integer> was mandatory
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Float> lf = new ArrayList<>();
        // at runtime, both class' is java.util.ArrayList (getClass is determined at runtime)
        System.out.println(li.getClass() == lf.getClass()); // true

        //Extending Exception makes a class an exception (possible to throw)
//        class GenericException<T> extends Exception {}

        //Exceptions cannot be generic: Which one will the executor choose? Both are <Object>!
//        try {
//           throw new GenericException<Integer>();
//        }
//        catch(GenericException<Integer> e) {
//                    System.err.println("Integer");
//                }
//        catch(GenericException<String> e) {
//            System.err.println("String");
//        }

        //Some examples:

        //Non-generic class
        IntegerPair intPair = new IntegerPair(1, 2);
        System.out.println(intPair);
        //Non-generic class
        StringPair strPair = new StringPair("Tomato", "Carrot");
        System.out.println(strPair);

        //Generic class, bad instantiation (raw use): always specify type!
        Pair badPair = new Pair(1, "Lettuce"); // just a warning, no compilation error!
        System.out.println(badPair); // equivalent to no generics at all
        //Generic class, good instantiation:
        // model: ObjectType<GenericType> obj = new ObjectType<>();
        Pair<String> goodPair = new Pair<>("Tomato", "Carrot");
        System.out.println(goodPair);

        MyClass mc = new MyClass(); // custom class

        Pair<MyClass> myPair = new Pair<>(mc, mc); // custom generic class
        System.out.println(myPair);

        // the Object class allows all other objects, the point behind generics is lost! To avoid
        Pair<Object> objPair = new Pair<>(mc, "String");
        System.out.println(objPair);

        ArrayList<Object> personList = new ArrayList<>();
        personList.add(new Person());
        for (Object person : personList) {
//            person.eat(); // Object doesn't have method eat()... compiler complains!
            ((Person)person).eat(); // down-casting necessary to shut the compiler, if we are sure that at runtime there is no problem
            // NB: down-casting is a good solution, but be aware of ClassCastException at run-time!
        }

        Main.objectMethod(mc); // MyClass is a subclass of Object (as all classes are)

        List<MyClass> list = new ArrayList<>();
        list.add(mc);
        //MyClass is a subclass of Object, but List<MyClass> is not a subclass of List<Object>!
//        Main.objectListMethod(list); // compile time error

        objectListMethod(new ArrayList<Object>());

        lowestBoundListMethod(list); // <?> always extends Object, so any class is allowed

        // The following would be possible if x subtypeOf y implied List<x> subtypeOf List<y>
//        List<Integer> ints = new ArrayList<>();
//        ints.add(2);
//        List<Number> nums = ints; // because List<Integer> would be a subtype of List<Number>
         // In Java, classes are given by reference, which means *nums* and *ints* have the same list
//         nums.add(3.14);
//         Integer x = ints.get(1); // now 3.14 is assigned to an Integer variable! Nonsense


        List<Student> studList = new ArrayList<>();
        lowerBoundListMethod(studList);

//        lowerBoundListMethod(new ArrayList<Integer>()); // not allowed!

        List<Person> person = new ArrayList<>();
        upperBoundListMethod(person);

//        upperBoundListMethod(new ArrayList<Integer>()); // not allowed!

        // Others: (Check out covariance and contravariance)

        List<? extends Number> numList = new ArrayList<>();

        List<? super Student> studList1 = new ArrayList<>();
    }

    static void objectMethod(Object obj) {}

    static void objectListMethod(List<Object> objList) {}

    static void lowestBoundListMethod(List<?> anyList) {}

    static void lowerBoundListMethod(List<? extends Person> anyList) {}

    static void upperBoundListMethod(List<? super Student> anyList) {}
}