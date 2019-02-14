
public class Money {
	
	private int amount;

	public Money(int i) {
		// TODO Auto-generated constructor stub
		amount = i;
	}

	public Money() {
		// TODO Auto-generated constructor stub
		amount = 0;
	}

	public Money minus(Money total) {
		// TODO Auto-generated method stub
		amount -= total.getValue();
		return this;
	}

	public void add(Money subtotal) {
		// TODO Auto-generated method stub
		amount += subtotal.getValue();
	}

	private int getValue() {
		// TODO Auto-generated method stub
		return amount;
	}

	public Money times(int quantity) {
		// TODO Auto-generated method stub
		return new Money(amount * quantity);
	}

}
