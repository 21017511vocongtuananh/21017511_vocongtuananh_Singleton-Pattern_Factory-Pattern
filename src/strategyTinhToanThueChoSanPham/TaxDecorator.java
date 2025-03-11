package strategyTinhToanThueChoSanPham;

abstract class TaxDecorator implements TaxStrategy {
    protected TaxStrategy taxStrategy;

    public TaxDecorator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public abstract double calculateTax(double price);
}
