import java.util.Scanner;
public class ThreeDArraysShopsales{
    public static void main(String[] args) {
        int[][][] sales = {
                {{10, 20, 30}, {15, 25, 35}},
                {{5, 10, 15}, {8, 16, 24}}
        };
        for (int branch = 0; branch < sales.length; branch++) {
            System.out.println("Branch " + (branch + 1) + ":");
            for (int month = 0; month < sales[branch].length; month++) {
                System.out.print("  Month " + (month + 1) + ": ");
                for (int product = 0; product < sales[branch][month].length; product++) {
                    System.out.print(sales[branch][month][product] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("\nTotal Sales for Branch 1:");
        int total = 0;
        for (int month = 0; month < sales[0].length; month++) {
            for (int product = 0; product < sales[0][month].length; product++) {
                total += sales[0][month][product];
            }
        }
        System.out.println("Total: " + total);
    }
}
