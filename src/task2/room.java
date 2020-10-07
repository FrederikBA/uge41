package task2;

public class room {
    //Properties
    private String walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //Constructor
    public room(String walls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //Behaviour

    public String getWalls() {
        return walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
