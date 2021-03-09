package Inheritances.HirerachericalInheritance;

/**
 * Created by kedar on 3/9/2021.
 */
public class Daughter extends Father {
    public void getDaughter() {
        System.out.println("I am daughter of: " + super.name + " I am from " + super.place);
    }

}
