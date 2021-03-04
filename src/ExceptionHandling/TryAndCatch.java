package ExceptionHandling;

/**
 * Created by kedar on 3/4/2021.
 */
public class TryAndCatch {

    public void getTry() {

        try {
            int a = 5; //array
            int b = 0; //array
//
//            System.out.println(a[10]);
//            int b = 0;
            int z = a / b;

        } catch (ArrayIndexOutOfBoundsException varName) {
            // varName.printStackTrace();
            System.out.println("Need to print Array");
        } finally {
            System.out.println("It is always Executed");
        }
    }
}
