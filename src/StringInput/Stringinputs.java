package StringInput;

import java.util.Scanner;

/**
 * Created by kedar on 3/4/2021.
 */
public class Stringinputs {
    public void getString() {

        System.out.println("Enter Name");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();

        if (myName.equals("Java")) {
            System.out.println("It is jaava");
        } else {
            System.out.println("NOt java");
        }

    }
}
