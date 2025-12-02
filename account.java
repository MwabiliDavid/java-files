import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccount {

    void addInterest() {
        balance = balance + balance * 0.05;  // increase by 5%
    }
}

public class account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        sa.deposit(amount);
        sa.addInterest();

        System.out.println("Final Balance after interest: " + sa.balance);

        sc.close();
    }
}
