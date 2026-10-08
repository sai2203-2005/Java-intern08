import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ATM data
        int correctPin = 1234;
        double balance = 10000.00;

        // -------------------------------
        // PIN VERIFICATION
        // -------------------------------

        int attempts = 0;
        boolean pinVerified = false;

        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                pinVerified = true;
                System.out.println("\nPIN verified successfully!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts < 3) {
                    System.out.println("Attempts remaining: " + (3 - attempts));
                }
            }
        }

        // If PIN is incorrect 3 times
        if (!pinVerified) {
            System.out.println("\nYour account has been blocked.");
            sc.close();
            return;
        }

        // -------------------------------
        // ATM MENU
        // -------------------------------

        int choice;

        do {

            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Check balance
                    System.out.println("\nCurrent Balance: ₹" + balance);
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("\nEnter withdrawal amount: ₹");
                    double amount = sc.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    }
                    else {
                        balance = balance - amount;

                        System.out.println("Please collect your cash.");
                        System.out.println("Withdrawn Amount: ₹" + amount);
                        System.out.println("Remaining Balance: ₹" + balance);
                    }

                    break;

                case 3:
                    System.out.println("\nThank you for using the ATM!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
