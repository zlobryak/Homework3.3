public class Main {
    public static void main(String[] args) {
        int credit = 1_000_000;
        double interestRate = 9.99;
        int duration = 12;

        double monthPayment;

        CreditPaymentService cervice = new CreditPaymentService();
        monthPayment = cervice.calulate(credit, interestRate, duration);
        System.out.println(monthPayment);
    }

}
