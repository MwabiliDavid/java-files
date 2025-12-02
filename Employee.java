import java.util.Scanner;

class employe {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Lecturer extends employe {
    String department;

    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        Lecturer lec = new Lecturer();
        lec.name = name;
        lec.salary = salary;
        lec.department = department;

        System.out.println("\nLecturer Information:");
        lec.displayInfo();

        sc.close();
    }
}