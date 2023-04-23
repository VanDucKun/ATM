import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo danh sách người dùng
        User[] users = new User[10];
        users[0] = new User("user1", "11111", 5000000);
        users[1]= new User("user2", "22222", 1000000);
        users[2] = new User("user3", "33333", 2000000);

        ATMSimulator atmSimulator = new ATMSimulator(users,-1);
        // Hiển thị màn hình đăng nhập
        Scanner sc = new Scanner(System.in);
        boolean isLoggedIn = false;
        do {
            System.out.println("============================Nhập thông tin tài khoản============================");
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            isLoggedIn = atmSimulator.validateLogin(username,password);
            if (!isLoggedIn) {
                System.out.println("Đăng nhập không thành công. Vui lòng thử lại.");
            }
        } while (!isLoggedIn);

        // Hiển thị màn hình chức năng
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("------------------------");
            System.out.println("1. Rút tiền");
            System.out.println("2. Xem số dư");
            System.out.println("3. Thoát");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số tiền muốn rút :");
                    int money = sc.nextInt();
                    atmSimulator.withdrawMoney(money);
                    break;

                case 2:
                    atmSimulator.checkBalance();
                    break;

                case 3:
                    isRunning = false;
                    System.out.println("BYE BYE");
                    break;

                default:
                    System.out.println("Vui lòng chọn đúng lựa chọn.");
                    break;
            }
        }
    }
}
