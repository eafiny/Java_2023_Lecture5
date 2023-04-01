package ru.muctr.Collections;

import java.util.*;

/**
 * @author Evgenia Skichko
 */
public class Set_Demo {
    public static void main(String[] args) {
        SortedSet<Cat> cats = new TreeSet<>(Comparator.comparingInt(Cat::getAge));
        cats.add(new Cat("Barsik", 5));
        cats.add(new Cat("Bars", 2));
        System.out.println(cats);
    }
}
