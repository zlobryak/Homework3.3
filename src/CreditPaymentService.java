public class CreditPaymentService {
    public double calulate(int credit, double interestRate, int duration) {
        double monthPayment;
        double K; //Коэффициент аннуитета
        double i = interestRate / 12 / 100;
    

        K = (i * Math.pow((1 + i), duration)) / (Math.pow((1 + i), duration) - 1);
        monthPayment = K * credit;


        return monthPayment;


    }
}
