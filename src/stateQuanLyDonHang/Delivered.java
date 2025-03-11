package stateQuanLyDonHang;

class Delivered implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}