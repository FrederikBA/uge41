package task3;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Tiger tiger = new Tiger(4);
        Elephant elephant = new Elephant(4);
        Giraffe giraffe = new Giraffe(4);

        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);

        zoo.makeAllSounds();

        zoo.printNumberOfLegs();

    }
}
