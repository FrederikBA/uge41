package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(new Walls(), 1, 2, 2));
        rooms.add(new Room(new Walls(), 1, 3, 4));
        rooms.add(new Room(new Walls(), 2, 2, 1));
        Building building = new Building(rooms, 2, 4, false);

        //Print
        System.out.println(building.getLamps());

        if (building.getNumberOfFloors() > building.getRooms().size()) {
            System.out.println("This building is odd");
        }


    }
}


