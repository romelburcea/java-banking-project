import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name and ID in order to access your account: ");
        String name = sc.nextLine();
        String customerID = sc.nextLine();

        account cb = new account(name, customerID);
        cb.meniu();
    }



    static class account{
        double balance;
        String customerName;
        String customerID;


        account(String customerName, String customerID){
            this.customerName = customerName;
            this.customerID = customerID;
        }

        void deposit(double sum1){
            if(sum1 != 0 ){
                balance+=sum1;

            }
        }

        void withdraw(double sum){
            if(sum != 0 && balance > sum){
                balance -= sum;

            }
            else if(balance < sum){
                System.out.println("Insufficient money");
            }
        }

        void meniu(){
            char options;
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello " + customerName);
            System.out.println("Your ID is: " + customerID);
            System.out.println("\n");
            System.out.println("a) Check balance");
            System.out.println("b) Deposit funds");
            System.out.println("c) Withdraw funds");
            System.out.println("d) Exit interface");

            do{
                System.out.println("**********************");
                System.out.println("Choose an options");
                options = sc.next().charAt(0);
                System.out.println("\n");

                switch (options){
                    case 'a':
                        System.out.println("............");
                        System.out.println("balance = " + balance);
                        System.out.println("............");
                        System.out.println("\n");
                        break;

                    case 'b':
                        System.out.println("............");
                        System.out.println("Type sum to deposit into your account: ");
                        System.out.println("............");
                        double sum = sc.nextDouble();
                        deposit(sum);
                        System.out.println("\n");
                        break;

                    case 'c':
                        System.out.println("............");
                        System.out.println("Type sum to withdraw from your account: ");
                        System.out.println("............");
                        double sumW = sc.nextDouble();
                        withdraw(sumW);
                        System.out.println("\n");
                        break;

                    case 'd':
                        System.out.println("............");
                        break;

                    default:
                        System.out.println("Choose a correct option please!");
                        break;
                }
            } while (options != 'd');
            System.out.println("Thanks!");
        }

    }



}