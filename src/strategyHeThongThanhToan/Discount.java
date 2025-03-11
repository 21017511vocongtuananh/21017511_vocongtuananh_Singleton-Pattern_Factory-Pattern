package strategyHeThongThanhToan;

class Discount extends PaymentDecorator {
    public Discount(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay(double amount) {
        double discount = amount * 0.1; // 10% giảm giá
        System.out.println("Áp dụng mã giảm giá: -" + discount);
        paymentStrategy.pay(amount - discount);
    }
}
