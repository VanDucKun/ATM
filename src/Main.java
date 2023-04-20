import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMSimulator atmSimulator = new ATMSimulator();

        /*Calculator calculator = new Calculator();
        System.out.println("Kết quả phép cộng : " + calculator.add(1.2d,3.8d));
        System.out.println("Kết quả phép trừ : " + calculator.subtract(4.5d, 1.5d));
        System.out.println("Kết quả phép nhân : " + calculator.multiply(2,2.5));
        System.out.println("Kết quả phép chia : " + calculator.divide(5, 2.5));*/

        // bai 3
        Scanner input = new Scanner(System.in);
        int accountNumber = 123456;
        int pin = 1234;
        double balance = 1000.0;

        System.out.println("=================================================================================");
        System.out.println("Welcome to the ATM Simulator!");

        // Đăng nhập
        System.out.print("Please enter your account number: ");
        int enteredAccountNumber = input.nextInt();
        System.out.print("Please enter your PIN: ");
        int enteredPin = input.nextInt();

        if (enteredAccountNumber == atmSimulator.accountNumber && atmSimulator.pin== enteredPin) {
            System.out.println("Login successful!");

            // Hiển thị menu
            int choice = 0;
            while (choice != 3) {
                System.out.println("Please select an option:");
                System.out.println("1. Withdraw");
                System.out.println("2. Check balance");
                System.out.println("3. Exit");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        // Rút tiền
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawalAmount = input.nextDouble();
                        if (withdrawalAmount > balance) {
                            System.out.println("Insufficient funds! Please try again.");
                        } else {
                            balance -= withdrawalAmount;
                            System.out.printf("You have withdrawn $%.2f. Your new balance is $%.2f.\n", withdrawalAmount, balance);
                        }
                        break;
                    case 2:
                        // Xem số dư
                        System.out.printf("Your current balance is $%.2f.\n", balance);
                        break;
                    case 3:
                        // Thoát
                        System.out.println("Thank you for using the ATM Simulator. Goodbye!");
                        break;
                    default:
                        // Lựa chọn không hợp lệ
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Login failed! Please try again.");
        }
    }
}
