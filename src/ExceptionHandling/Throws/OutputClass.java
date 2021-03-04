package ExceptionHandling.Throws;

/**
 * Created by kedar on 3/4/2021.
 */
public class OutputClass {
    public static void main(String[] args) {
        try {
            ThrowsKeyword tk = new ThrowsKeyword();
            tk.division(2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero");
        }
    }
}
