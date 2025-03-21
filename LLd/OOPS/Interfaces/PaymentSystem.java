package Interfaces;

public class PaymentSystem implements Payment{

    @Override
    public void payment(double paymentAmount) {
        System.out.println("Payment Done: " + paymentAmount);
    }
    @Override
    public void paymentViaCard(double paymentAmount) {
        System.out.println("Payment Done via my Card: " + paymentAmount);
    }

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.payment(1000);
        paymentSystem.paymentViaCard(1000);
    }
}
