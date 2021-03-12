package Collection.HashMaps.HashMaps;

import java.util.HashMap;

/**
 * Created by kedar on 3/12/2021.
 */
public class HashMapsInput {
    public void program() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, " Apple");
        hashMap.put(2, " Mango");
        hashMap.put(3, " Grapes");
        hashMap.put(4, " Gauva");
        hashMap.put(5, " Banana");

        System.out.println("HashMap is : " + hashMap);

        //remove Apple as it's corresponding key is 1
        hashMap.remove(1);

    }
}
