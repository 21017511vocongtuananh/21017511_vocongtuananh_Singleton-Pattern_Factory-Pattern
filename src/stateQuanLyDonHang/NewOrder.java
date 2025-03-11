package stateQuanLyDonHang;

public class NewOrder implements OrderState{
	@Override
    public void handle(OrderContext context) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        context.setState(new Processing());
    }
}
