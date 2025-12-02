import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[]args){

        int[] prices={120,80,150,60,200,90};

        System.out.println("Item prices:");
        int total = 0;
        for(int i = 0; i < prices.length;i++){
            System.out.println(prices[i]);
            total +=prices[i];
        }
        System.out.println("Total amount is:"+ total);
    }
}

