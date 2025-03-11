package strategyTinhToanThueChoSanPham;

class LuxuryTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.2; // 20% thuế xa xỉ
    }
}
