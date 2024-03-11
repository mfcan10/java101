import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int select, choose, right = 3;
        double balance = 50000, amountMoney;
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.println("=================Kodluyoruz Bank====================");

        while (right > 0) {
            System.out.print("Please enter your username: ");
            username = input.nextLine();
            System.out.print("Please enter your password: ");
            password = input.nextLine();

            if (username.equals("Patika") && password.equals("dev123")) {
                System.out.println("Hello Patika, Welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Enter deposit amount");
                            amountMoney = input.nextDouble();
                            balance += amountMoney;
                            System.out.println("Your cash has been accepted.");
                            break;
                        case 2:
                            System.out.println("Enter withdraw amount");
                            amountMoney = input.nextDouble();
                            if (amountMoney > balance) {
                                System.out.println("Not enough amount!");
                            } else {
                                balance -= amountMoney;
                                System.out.println("Please withdraw your money from tray.");
                            }
                            break;
                        case 3:
                            System.out.println("Balance = " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for choosing us.");
                            break;
                        default:
                            System.out.println("Invalid selection!");
                    }
                    if (select != 4) {
                        do {
                            System.out.println("Do you want to perform another transaction?\n1-Yes\n2-No");
                            choose = input.nextInt();
                            if (choose == 1 || choose == 2) {
                                break;
                            } else {
                                System.out.println("Please choose 1 or 2!");
                            }
                        } while (true);

                        if (choose == 2) {
                            System.out.println("Thank you for choosing us.");
                            break;
                        }
                    }

                } while (select != 4);
                break;
            } else { 
                right--;
                System.out.println("Invalid username or password. Try again...");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact your bank.");
                } else {
                    System.out.println("Your remaining attempts: " + right);
                }
            }
        }
    }
}