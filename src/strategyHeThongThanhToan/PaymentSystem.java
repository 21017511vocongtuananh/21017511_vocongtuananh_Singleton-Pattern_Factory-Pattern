package strategyHeThongThanhToan;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        creditCard.pay(1000);

        System.out.println("\nThẻ tín dụng + phí xử lý:");
        PaymentStrategy creditCardWithFee = new ProcessingFee(new CreditCardPayment());
        creditCardWithFee.pay(1000);

        System.out.println("\nPayPal + giảm giá:");
        PaymentStrategy paypalWithDiscount = new Discount(new PayPalPayment());
        paypalWithDiscount.pay(1000);
    }
}