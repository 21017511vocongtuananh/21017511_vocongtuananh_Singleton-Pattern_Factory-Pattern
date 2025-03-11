package strategyHeThongThanhToan;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Thẻ tín dụng.");
    }
}