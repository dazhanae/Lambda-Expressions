package org.paumard;

import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.function.Function;

public class MainComparator {
    public static void main(String[] args) {

        Comparator<Person> cmpAge =(p1, p2) -> p2.getAge() - p1.getAge() ;
        Comparator<Person> cmpFirstName =(p1, p2) -> p1.getName().compareTo(p2.getName()) ;

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, Integer> f3 = p -> Integer.valueOf(p.getName());

        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);

        Comparator<Person> cmp = Comparator.comparing(Person::getName)
                                                .thenComparing(Person::getName)
                                                .thenComparing(Person::getAge);
    }
}


