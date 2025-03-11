package strategyHeThongThanhToan;

class ProcessingFee extends PaymentDecorator {
    public ProcessingFee(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay(double amount) {
        double fee = amount * 0.02; // 2% phí xử lý
        System.out.println("Thêm phí xử lý: " + fee);
        paymentStrategy.pay(amount + fee);
    }
}