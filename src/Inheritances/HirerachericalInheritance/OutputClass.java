package Inheritances.HirerachericalInheritance;

/**
 * Created by kedar on 3/9/2021.
 */
public class OutputClass {
    public static void main(String[] args) {

        Son son = new Son();
        son.printSon();
        son.printAge();

        Daughter daughter = new Daughter();
        daughter.getDaughter();
    }
}
