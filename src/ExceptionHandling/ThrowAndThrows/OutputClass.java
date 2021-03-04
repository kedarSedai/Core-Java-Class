package ExceptionHandling.ThrowAndThrows;

import Arithmetic.Output;

/**
 * Created by kedar on 3/4/2021.
 */
public class OutputClass {
    public static void main(String[] args) {
        try {
            ThrowKeyword throwKeyword = new ThrowKeyword();
            throwKeyword.getAge(17);
        }catch (ArithmeticException e){
            System.out.println("Not Eligible to vote");
        }
    }
}
