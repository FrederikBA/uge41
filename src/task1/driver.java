package task1;

public class driver {
    //Properties
    private String name;
    private int age;

    //Constructor
    public driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Behaviour

    @Override
    public String toString() {
        return "is driven by " + name;
    }
}
