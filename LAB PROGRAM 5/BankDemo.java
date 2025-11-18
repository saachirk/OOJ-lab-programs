import java.util.Scanner;

abstract class Bank {
    abstract void deposit();
    abstract void withdrawal();
    abstract void displayDetails();
}

class Accounts extends Bank {
    String cust_name, type_of_account;
    int acc_no;
    double balance = 0;

    public Accounts(String name, int acc_no, String type) {
        this.cust_name = name;
        this.acc_no = acc_no;
        this.type_of_account = type;
    }

    void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        double deposit = s.nextDouble();
        balance += deposit;
        System.out.println("Deposited: " + deposit + ". Updated balance: " + balance);
    }

    void withdrawal() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        double amount = s.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Updated balance: " + balance);
        }
    }

    void displayDetails() {
        System.out.println("Customer name: " + cust_name);
        System.out.println("Account number: " + acc_no);
        System.out.println("Type of Account: " + type_of_account);
        System.out.println("Account Balance: " + balance);
    }
}

class Sav_acc extends Accounts {
    public Sav_acc(String name, int acc_no) {
        super(name, acc_no, "Saving");
    }

    void Interest() {
        if (balance <= 0) {
            System.out.println("No interest applicable. Balance is 0.");
            return;
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the time period (in years): ");
        int year = s.nextInt();
        double interest = (balance * year * 2.0) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + ". Updated balance: " + balance);
    }
}

class Cur_acc extends Accounts {
    public Cur_acc(String name, int acc_no) {
        super(name, acc_no, "Current");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name for Savings Account: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer name for Current Account: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc2 = sc.nextInt();
        sc.nextLine();

        Sav_acc s = new Sav_acc(name1, acc1);
        Cur_acc c = new Cur_acc(name2, acc2);

        int choice;
        do {
            System.out.println("\n======MENU======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute Interest for Savings Account");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            while (!sc.hasNextInt()) sc.next(); // handle invalid input
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the type of account (saving/current): ");
            String type = sc.nextLine().trim();

            switch (choice) {
                case 1:
                    if (type.equalsIgnoreCase("saving")) {
                        s.deposit();
                    } else if (type.equalsIgnoreCase("current")) {
                        c.deposit();
                    } else {
                        System.out.println("Invalid account type!");
                    }
                    break;

                case 2:
                    if (type.equalsIgnoreCase("saving")) {
                        s.withdrawal();
                    } else if (type.equalsIgnoreCase("current")) {
                        c.withdrawal();
                    } else {
                        System.out.println("Invalid account type!");
                    }
                    break;

                case 3:
                    if (type.equalsIgnoreCase("saving")) {
                        s.Interest();
                    } else {
                        System.out.println("Interest cannot be computed for Current Account!");
                    }
                    break;

                case 4:
                    if (type.equalsIgnoreCase("saving")) {
                        s.displayDetails();
                    } else if (type.equalsIgnoreCase("current")) {
                        c.displayDetails();
                    } else {
                        System.out.println("Invalid account type!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
