public class CoffeeOrder {
    String size;
    double price;

    //The constructor
    public CoffeeOrder(String size,  double price) {
        this.size = size;
        this.price = price;
    }
    //Method for displaying the order details
    public void displayOrder(){
        System.out.println("Size: "+size+", Price: "+price+"ksh");
    }

    //Main method
    public static void main(String[] args){
        CoffeeOrder order_1 = new CoffeeOrder("Milk", 50);
        CoffeeOrder order_2 = new CoffeeOrder("Chocolate", 70);

        System.out.println("Order 1: ");
        order_1.displayOrder();
        System.out.println("Order 2: ");
        order_2.displayOrder();
    }
}
