package strategyPattern;

public class CreditCardStrategy implements PaymentStrategy{

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with credit/debit card");
	}
	public CreditCardStrategy(String nm, String ccNum, String cvv,
			String expiryDate){
			this.name=nm;
			this.cardNumber=ccNum;
			this.cvv=cvv;
			this.dateOfExpiry=expiryDate;
			}
}
