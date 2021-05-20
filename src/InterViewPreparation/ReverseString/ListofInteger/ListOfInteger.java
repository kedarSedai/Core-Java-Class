package InterViewPreparation.ReverseString.ListofInteger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kedar on 5/20/2021.
 */
public class ListOfInteger {
    public static boolean check(List<Integer> number) {
        for (int i : number) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(1);
        System.out.println(check(arrayList));
    }
}
