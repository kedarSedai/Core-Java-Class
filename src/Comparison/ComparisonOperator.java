package Comparison;

import java.util.Scanner;

/**
 * Created by kedar on 3/2/2021.
 */
public class ComparisonOperator {
    public void compareOperator() {
        System.out.println("Enter first Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        //checks whether two values(user input) are equal or not
        if (a == b) {
            System.out.println("Both Number are Equal");
        } else {
            System.out.println("They are not Equal");
        }
    }

    //compares two string value Make sure I have added equals() method
    public void checkString() {
        System.out.println("Enter First String");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();

        System.out.println("Enter Second String");
        String second = scanner.nextLine();

        if(first.equals(second)){
            System.out.println("Both String are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }
}

