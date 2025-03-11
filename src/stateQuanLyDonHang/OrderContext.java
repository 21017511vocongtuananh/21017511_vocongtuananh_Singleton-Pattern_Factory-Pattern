package stateQuanLyDonHang;

public class OrderContext {
	 private OrderState state;

	    public OrderContext() {
	        this.state = new NewOrder();
	    }

	    public void setState(OrderState state) {
	        this.state = state;
	    }

	    public void processOrder() {
	        state.handle(this);
	    }
}
