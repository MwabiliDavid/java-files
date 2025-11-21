import java.util.Scanner;

public class Product {
    //private attributes
    private String name;
    private double price;

    //Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Discount method
    public void applydiscount(double percentage){
        price = price - (price * percentage / 100);
    }

    //New price
    public double getPrice(){
        return price;
    }

    //main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Product
        Product product_1 = new Product("Iphone", 277000);
        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        //apply discount
        product_1.applydiscount(discount);

        //Displaying new price
        System.out.println("Discounted price: "+ product_1.getPrice());

        input.close();
    }
}
