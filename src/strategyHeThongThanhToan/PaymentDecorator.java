package strategyHeThongThanhToan;

abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy paymentStrategy;

    public PaymentDecorator(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public abstract void pay(double amount);
}
