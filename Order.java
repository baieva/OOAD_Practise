import java.io.IOException;

public class Order {
	
	private String ID;
	private int Quantity;
	private loginSys platform;

	public Order(String string, String string2, loginSys plat) throws IOException {
		ID = string;
		Quantity = Integer.parseInt(string2);
		platform = plat;
		Arrange();
	}

	private void Arrange() throws IOException {
		platform.manager.set(ID,Quantity);
		
	}

}
