package Inheritances.HirerachericalInheritance;

/**
 * Created by kedar on 3/9/2021.
 */
public class Son extends Father {

    public int age = 12;

    public void printSon() {
        System.out.println("I am son of: " + super.name);
    }

    public void printAge() {
        System.out.println("My age is " + age);
    }
}
