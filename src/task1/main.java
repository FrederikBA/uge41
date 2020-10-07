package task1;

public class main {
    public static void main(String[] args) {
        driver driver1 = new driver("Frederik", 22);
        car car1 = new car("Volkswagen", "UP", 2016, "Hatchback");
        car car2 = new car("Volkswagen", "T-ROC", 2018, "SUV");

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
