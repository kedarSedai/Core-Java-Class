package BreakAndContinue;

/**
 * Created by kedar on 3/3/2021.
 */
public class Break {
    public void getBreak() {
//        int number = 4;
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                System.out.println(i);
                break;
                //continue;
            }
//            System.out.println(i);
        }
    }
}
