package ExceptionHandling.ThrowAndThrows;

/**
 * Created by kedar on 3/4/2021.
 */
public class ThrowKeyword {

    public void getAge(int age) {

        if (age < 18) {
            //throw
            throw new ArithmeticException("Not Eligible To vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
