package ru.muctr.PECS;

/**
 * @author Evgenia Skichko
 */
public class Cat extends DomesticAnimal implements Comparable<Cat>{
    int catAge;
    public Cat(String name) {
        super(name);
    }

    public void getVoice(){
        System.out.println("Meou");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
