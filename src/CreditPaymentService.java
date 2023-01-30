public class CreditPaymentService {
    public double calulate(int credit, double interestRate, int duration) {
        double monthPayment;
        double i = interestRate / 12 / 100; //monthly interest rate
        monthPayment = (i * Math.pow((1 + i), duration)) / (Math.pow((1 + i), duration) - 1) * credit;
        return monthPayment;
    }
}
