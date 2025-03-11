package stateQuanLyDonHang;

class Cancelled implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
