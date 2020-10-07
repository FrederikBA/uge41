package task3;

public abstract class Animal implements AnimalSound {
    //Properties
    private int numberOfLegs;

    //Constructor

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    //Behaviour

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void makeSound() {
        System.out.println("Undefined animal makes no sound");
    }

}
