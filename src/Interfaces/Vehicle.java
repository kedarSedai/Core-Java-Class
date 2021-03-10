package Interfaces;

/**
 * Created by kedar on 3/10/2021.
 */
public class Vehicle implements Car {
    public void getCarPrice() {
        System.out.println("Car price is ... ");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.getCarPrice();
    }
}
