import java.util.Scanner;

    class Vehicle_1 {
        String brand;
        int year;
    }

    class Car extends Vehicle_1 {
        int seats;
    }

    public class vehicle{
        public static void main(String[] args) {
            Car myCar = new Car();

            // Assign values
            myCar.brand = "Toyota";
            myCar.year = 2020;
            myCar.seats = 5;

            // Print details
            System.out.println("Car Details:");
            System.out.println("Brand: " + myCar.brand);
            System.out.println("Year: " + myCar.year);
            System.out.println("Seats: " + myCar.seats);
        }
    }

