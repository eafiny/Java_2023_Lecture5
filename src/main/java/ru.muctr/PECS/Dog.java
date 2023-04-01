package ru.muctr.PECS;

/**
 * @author Evgenia Skichko
 */
public class Dog extends DomesticAnimal{
    int dogAge;
    public Dog(String name) {
        super(name);
    }

    public void getVoice(){
        System.out.println("Gav");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
