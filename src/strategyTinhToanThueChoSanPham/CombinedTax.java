package strategyTinhToanThueChoSanPham;

class CombinedTax extends TaxDecorator {
    public CombinedTax(TaxStrategy taxStrategy) {
        super(taxStrategy);
    }

    @Override
    public double calculateTax(double price) {
        return taxStrategy.calculateTax(price) + price * 0.05; // Thêm 5% thuế
    }
}