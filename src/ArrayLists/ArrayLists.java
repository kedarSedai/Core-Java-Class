package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kedar on 3/10/2021.
 */
public class ArrayLists {
    public void printArrayLists(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add("Gauva");
        arrayList.remove("Gauva");
        Collections.sort(arrayList);

        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Apple"));

    }
}
