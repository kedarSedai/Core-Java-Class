package Inheritances.SingleInheritance;

/**
 * Created by kedar on 3/9/2021.
 */
public class Cow extends Animal {
    public void print() {
        System.out.println("Name is: " + super.name);
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.print();
        cow.getName();
    }
}
