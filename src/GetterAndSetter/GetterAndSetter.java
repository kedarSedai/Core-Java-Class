package GetterAndSetter;

/**
 * Created by kedar on 3/10/2021.
 */
public class GetterAndSetter {
    private int price ;
    private String name;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name of the " + getName() + "\n" + "Price of Boook is " + getPrice());
    }
}
