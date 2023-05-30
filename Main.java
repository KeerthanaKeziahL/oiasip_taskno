import java.util.Scanner;

class ATM {
    private double balance;

    public ATM() {
        balance = 0.0;
    }

    public void showMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. View Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
    }

    public void viewTransactionsHistory() {
        System.out.println("Transaction History:");
        // Implement logic to fetch and display transaction history
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
            // Implement logic to record transaction history
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
        // Implement logic to record transaction history
    }

    public void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter recipient's account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Transfer failed.");
        } else {
            balance -= amount;
            System.out.println("Transfer successful. Remaining balance: " + balance);
            // Implement logic to record transaction history and update recipient's account
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        // Perform transactions
        while (true) {
            atm.showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.viewTransactionsHistory();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.deposit();
                    break;
                case 4:
                    atm.transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
