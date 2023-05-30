import java.util.Scanner;

public class OnlineExamination {
    private static String username;
    private static String password;
    private static boolean loggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Select Answers for MCQs");
            System.out.println("4. Timer and Auto Submit");
            System.out.println("5. Close Session and Logout");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    updateProfileAndPassword(scanner);
                    break;
                case 3:
                    selectMCQAnswers(scanner);
                    break;
                case 4:
                    timerAndAutoSubmit();
                    break;
                case 5:
                    closeSessionAndLogout();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void login(Scanner scanner) {
        if (loggedIn) {
            System.out.println("You are already logged in.");
            return;
        }

        System.out.println("Enter username:");
        String enteredUsername = scanner.nextLine();

        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();

        // Validate the username and password against a database or other storage
        if (enteredUsername.equals("admin") && enteredPassword.equals("password")) {
            username = enteredUsername;
            password = enteredPassword;
            loggedIn = true;
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void updateProfileAndPassword(Scanner scanner) {
        if (!loggedIn) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Updating profile and password...");
        // Code to update the profile and password
    }

    private static void selectMCQAnswers(Scanner scanner) {
        if (!loggedIn) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Selecting answers for MCQs...");
        // Code to allow the user to select answers for multiple-choice questions
    }

    private static void timerAndAutoSubmit() {
        if (!loggedIn) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Starting timer and auto submit...");
        // Code to implement the timer and automatically submit the answers
    }

    private static void closeSessionAndLogout() {
        if (!loggedIn) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Closing session and logging out...");
        loggedIn = false;
        // Code to perform any necessary cleanup and log out the user
    }
}
