package Super;

/**
 * Created by kedar on 3/9/2021.
 */
public class DerivedClass extends SuerInput {
    public void printName() {
        System.out.println("Name is : " + super.name);
    }

    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.printName();
    }
}
