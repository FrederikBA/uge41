package task1;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Frederik", 22);
        Car car1 = new Car("Volkswagen", "UP", 2016, "Hatchback");
        Car car2 = new Car("Volkswagen", "T-ROC", 2018, "SUV");

        //Assign drivers to cars.
        car1.setDriver(driver1.toString());
        car2.setDriver(driver1.toString());

        //Print the car
        System.out.println(car1);
        System.out.println(car2);

        //Print the driver
        System.out.println(driver1);

    }
}
