import java.util.Scanner;

public class Holly_P2 {
    private static double annualInterestRate = 0;

    public static class SavingsAccount {
        private double savingsBalance;

        SavingsAccount() {
            savingsBalance = 0;
        }

        SavingsAccount(double balance) {
            savingsBalance = balance;
        }

        public void calculateMonthlyInterest(int numMonths) {
            double monthlyInterest;

            monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
            System.out.printf("The monthly interest is: %.2f\n", monthlyInterest);

            savingsBalance = savingsBalance + monthlyInterest;
            System.out.printf("The balance after %d months is: %.2f\n", numMonths, savingsBalance);
        }

        public static void modifyInterestRate(double newRate) {
            annualInterestRate = newRate;
        }
    }

    public static class Application {

        public static void test(){

            SavingsAccount saver1 = new SavingsAccount(2000.00);
            SavingsAccount saver2 = new SavingsAccount(3000.00);

            SavingsAccount.modifyInterestRate(.04);

            System.out.println("--saver1--");
            for (int i = 1; i <= 12; i++){
                saver1.calculateMonthlyInterest(i);
            }

            System.out.println("--saver2--");
            for (int i = 1; i <= 12; i++){
                saver2.calculateMonthlyInterest(i);
            }

            System.out.println("");
            System.out.println("Interest Rate is now 5%");
            SavingsAccount.modifyInterestRate(.05);

            System.out.println("--saver1--");
            saver1.calculateMonthlyInterest(1);

            System.out.println("--saver2--");
            saver2.calculateMonthlyInterest(1);
        }

    }
    public static void main(String[] args) {
        Application.test();
    }
}
