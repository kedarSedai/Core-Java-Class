package Interfaces.MultipleInheritance;

/**
 * Created by kedar on 3/10/2021.
 */
public class Vehicle implements Bike, Car {
    int distanceTravelled = 0;

    public void getBikeName() {
        System.out.println("This is Bike Name");
    }

    public void getCarName() {
        System.out.println("This is Car Name");
    }

    public int getDistance() {
        distanceTravelled = speed * distance;
        System.out.println("Disance Travelled is :" + distanceTravelled);
        return distanceTravelled;
    }

    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.getBikeName();
        obj.getCarName();
        obj.getDistance();
    }
}
