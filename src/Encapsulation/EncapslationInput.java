package Encapsulation;

/**
 * Created by kedar on 3/5/2021.
 */
public class EncapslationInput {

    //Instance variable
    private String name = "Java";
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printMethod(){
        System.out.println("Name of Book is " + getName()+"\n" + "Price of the Book is " + getPrice() );
    }
}
