package Inheritances;

/**
 * Created by kedar on 3/8/2021.
 */
public class OutputSingleInheritance extends SingleInheritance {
    public static void main(String[] args) {
        OutputSingleInheritance obj = new OutputSingleInheritance();
        obj.getName();
    }

    public void print(){
        System.out.println("Print from Class OutputSingleInheritance  ");
    }

}
