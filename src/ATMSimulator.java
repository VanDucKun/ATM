public class ATMSimulator {
    private User[] users = new User[10];
    private int currentUserIndex;

    public ATMSimulator() {
    }

    public ATMSimulator(User[] users) {
        this.users = users;
    }

    public ATMSimulator(User[] users, int currentUserIndex) {
        this.users = users;
        this.currentUserIndex = currentUserIndex;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public int getCurrentUserIndex() {
        return currentUserIndex;
    }

    public void setCurrentUserIndex(int currentUserIndex) {
        this.currentUserIndex = currentUserIndex;
    }

    public boolean validateLogin(String username, String password) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                this.currentUserIndex = i;
                return true;
            }
        }
        return false;
    }

    public void withdrawMoney(int money) {
        if (users[currentUserIndex].getAmount() < money) {
            System.out.println("Số dư không đủ!");
        } else {
            users[this.currentUserIndex].setAmount(users[this.currentUserIndex].getAmount() - money);
            System.out.println("Bạn đã rút thành công : "+ money + "VNĐ");
            System.out.println("Số dư khả dụng trong tài khoản là : " +users[this.currentUserIndex].getAmount()+"VNĐ");
        }
    }

    public void checkBalance() {
        System.out.printf("Số dư khả dụng trong tài khoản là : " + users[this.currentUserIndex].getAmount() + "VNĐ");
    }
}
