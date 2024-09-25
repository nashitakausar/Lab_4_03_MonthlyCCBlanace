public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;

        double yearlyInterestRate = 0.17;

        double monthlyInterestRate = yearlyInterestRate / 12;
        double interestOneMonth = balance * monthlyInterestRate;
        double newBalance1 = balance + interestOneMonth;

        double interestTwoMonths = newBalance1 * monthlyInterestRate;
        double newBalance2 = newBalance1 + interestTwoMonths;

        // Output the interest due after each month
        System.out.println("Initial balance: $" + balance);
        System.out.println("Interest due after 1 month: $" + interestOneMonth);
        System.out.println("Balance after 1 month: $" + newBalance1);
        System.out.println("Interest due after 2 months: $" + interestTwoMonths);
        System.out.println("Balance after 2 months: $" + newBalance2);
    }
}
