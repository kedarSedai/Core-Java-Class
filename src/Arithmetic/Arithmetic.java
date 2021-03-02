package Arithmetic;

import java.util.Scanner;

/**
 * Created by kedar on 3/2/2021.
 */
public class Arithmetic {
    public void getAdd() {

        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int z = a + b;

        System.out.println("Arithmetic of the two number is " + z);
    }

    public void getSubtract() {

        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int z = a - b;

        System.out.println("Subtraction of the two number is " + z);
    }

    public void getMultiply() {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int z = a / b;

        System.out.println("Division of the two number is " + z);
    }
}
