import java.util.Scanner;
public class ThreeDArraysWarehouseStock {
    public static void main(String[] args) {
        // 3D array initialization
        int[][][] inventory = {
                {{50, 30, 20}, {40, 25, 15}},
                {{60, 35, 25}, {55, 28, 18}}
        };
        System.out.println("=== WAREHOUSE INVENTORY ===");

        for (int warehouse = 0; warehouse < inventory.length; warehouse++) {
            System.out.println("\nWarehouse " + (warehouse + 1) + ":");
            for (int section = 0; section < inventory[warehouse].length; section++) {
                System.out.print("  Section " + (section + 1) + ": ");
                for (int product = 0; product < inventory[warehouse][section].length; product++) {
                    System.out.print(inventory[warehouse][section][product] + " ");
                }
                System.out.println();
            }
        }

        // 2. Calculate total for Warehouse 2
        System.out.println("\n=== WAREHOUSE 2 TOTAL STOCK ===");
        int total = 0;

        for (int section = 0; section < inventory[1].length; section++) {
            for (int product = 0; product < inventory[1][section].length; product++) {
                total += inventory[1][section][product];
            }
        }

        System.out.println("Total stock in Warehouse 2: " + total + " units");
    }
}