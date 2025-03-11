package stateQuanLyDonHang;

public class Processing implements OrderState{
	@Override
    public void handle(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển...");
        context.setState(new Delivered());
    }
}
