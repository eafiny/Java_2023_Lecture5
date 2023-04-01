package ru.muctr.PECS;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgenia Skichko
 */
public class PECS_Demo {
    public static void main(String[] args) {
        List<DomesticAnimal> daList = Arrays.asList(
                new Cat("Vaska"),
                new Cat("Barsik"),
                new Dog("Reks"),
                new Dog("Druzhok")
        );
        List<Cat> catList = Arrays.asList(
                new Cat("Vaska"),
                new Cat("Barsik")
        );
        List<Animal> animalList = Arrays.asList(
                new Cat("Vaska"),
                new Cat("Barsik")
        );


        acceptAnimal_extends(catList);
        acceptAnimal_super(animalList);
        System.out.println(animalList);
    }

    public static void acceptAnimal_extends(List<? extends DomesticAnimal> daList){
        System.out.println(daList.get(0).getName());
//        daList.add(new DomesticAnimal("Barbos"));
    }

    public static void acceptAnimal_super(List<? super DomesticAnimal> daList){
//        System.out.println(daList.get(0).getName());
        daList.set(0, new Cat("Pushok"));
        System.out.println(daList.get(0));
        Cat cat = (Cat)daList.get(0);
//        daList.add(new Dog("Barbos"));
    }
}
