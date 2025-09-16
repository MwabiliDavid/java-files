import java.util.Scanner;

    public class Libraryfinecalculation {
        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);

            int bookID;
            System.out.println("please enter your bookID:  ");
            bookID = scanner.nextInt();

            int Duedate;
            System.out.println("please enter your date:  ");
            Duedate = scanner.nextInt();

            int Returnedate;
            System.out.println("please enter your returndate: ");
            Returnedate = scanner.nextInt();

            int overdue;
            overdue = Returnedate - Duedate;

            int fine;
            int finerate;

            if (overdue >= 7) {
            finerate = 20;
            fine = overdue * finerate;
            System.out.println("your finerate is" + finerate + "*" + overdue);
            System.out.println("your fine is" + fine + "kshs");
        }
            else if (overdue>=8) {
                finerate = 50;
                fine = overdue * finerate;
                System.out.println("your finerate is" + finerate + "*" + overdue);
                System.out.println("your fine is" + fine + "kshs");
            }
            else{
                System.out.println("*********Welcome library fine management System********");
                System.out.println(" ");
                System.out.println("you do not have a fine!");
            }
            System.out.println("Your bookID is"+bookID);
            System.out.println("Your Duedate was"+Duedate);
            System.out.println("Your Returnedate was"+Returnedate);
            System.out.println("Your days overdue is"+overdue);
            System.out.println(" ");
            System.out.println("********************************");






        }
}