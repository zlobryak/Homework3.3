public class Main {
    public static void main(String[] args) {
        int credit = 1_000_000;
        double interestRate = 9.99;
        CreditPaymentService cervice = new CreditPaymentService();
        System.out.println("Для 12 месяцев платеж составит: " + Math.round (cervice.calulate(credit, interestRate, 12)));
        System.out.println("Для 24 месяцев платеж составит: " + Math.round (cervice.calulate(credit, interestRate, 24)));
        System.out.println("Для 36 месяцев платеж составит: " + Math.round (cervice.calulate(credit, interestRate, 36)));
    }

}
