package strategyHeThongThanhToan;

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal.");
    }
}
