package LogicalOperator;

import java.util.Scanner;

/**
 * Created by kedar on 3/2/2021.
 */
public class LogicalOperators {
    public void getLogicalsAnd() {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        if (a > 5 && b >= 6) {
            System.out.println("They are Greater than 5 ");
        } else {
            System.out.println("Not Greater than 5");
        }

    }

    public void getLogicalsOr() {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        if (a > 5 || b >= 6) {
            System.out.println("They are Greater than 5 ");
        } else {
            System.out.println("Not Greater than 5");
        }
    }
}
