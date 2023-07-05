package BAB6.childs;
import BAB6.parents.Product;

public class Item extends Product {
    private int price;

    public Item() {

    }

    public Item(String name, int price) {
        super(name);
        this.price = price;
    }


    // implementasi method abstrak pada child class supaya menjadi bentuk konkrit Dan jelas
    @Override
    public void printInformation() {
        System.out.println("Product Name : " + getName());
        System.out.println("Product Price : " + getPrice());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
