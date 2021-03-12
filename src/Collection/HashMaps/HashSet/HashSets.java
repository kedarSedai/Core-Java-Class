package Collection.HashMaps.HashSet;

import java.util.HashSet;

/**
 * Created by kedar on 3/12/2021.
 */
public class HashSets {

    public void printUnion() {
        HashSet<String> union = new HashSet<String>();
        union.add("Apple");
        union.add("Mango");
        union.add("Gauva");

        HashSet<String> union1 = new HashSet<String>();
        union1.add("Apple");
        union1.add("Mango");
        union1.add("Banana");
        union1.add("Grapes");

        union.addAll(union1);
        System.out.println("Union is : " + union);

    }

    public void printIntersection() {
        HashSet<String> intersection = new HashSet<String>();
        intersection.add("Apple");
        intersection.add("Mango");
        intersection.add("Gauva");

        HashSet<String> intersection1 = new HashSet<String>();
        intersection1.add("Apple");
        intersection1.add("Mango");
        intersection1.add("Banana");
        intersection1.add("Grapes");

        intersection.retainAll(intersection1);
        System.out.println("Intersection is : " + intersection);
    }
}
