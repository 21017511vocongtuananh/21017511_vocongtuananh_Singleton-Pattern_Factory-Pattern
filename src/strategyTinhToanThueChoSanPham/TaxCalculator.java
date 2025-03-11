package strategyTinhToanThueChoSanPham;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 1000;

        TaxStrategy vat = new VATTax();
        System.out.println("Thuế VAT: " + vat.calculateTax(price));

        TaxStrategy luxury = new LuxuryTax();
        System.out.println("Thuế xa xỉ: " + luxury.calculateTax(price));

        TaxStrategy combined = new CombinedTax(vat);
        System.out.println("Thuế kết hợp (VAT + 5%): " + combined.calculateTax(price));
    }
}
