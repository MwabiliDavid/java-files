import java.util.Scanner;
    class Student {
        String name;
        double marks;

        //Constructor
        public Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }
    }
    class Grade_calculator {
        String calculateGrade(double marks) {
            if (marks >= 90) {
                return "A";
            } else if (marks >= 75) {
                return "B";
            } else if (marks >= 50) {
                return "C";
            } else {
                return "D";
            }
        }
    }
public class gradecalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student marks: ");
            double marks = scanner.nextDouble();

            Student student = new Student(name, marks);
            Grade_calculator gradecalculate= new Grade_calculator();
            String grade = gradecalculate.calculateGrade(marks);

            System.out.println("== == == == = STUDENT DETAILS == == == == =");
            student.displayDetails();
            System.out.println("GRADE: " + grade);

            scanner.close();
        }
    }
