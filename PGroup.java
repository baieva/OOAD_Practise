import java.io.IOException;

public class PGroup {
	
	public boolean status;
	private String productID;
	private int Quantity;
	private Create work;

	public PGroup() {
		status = false;
		productID = "";
		Quantity = 0;
	}
	
	public void start(String ID, int Qua) throws IOException {
		productID = ID;
		Quantity = Qua;
		status = true;
		work = new Create(this,productID,Quantity);
		finished();
	}
	
	public void finished() throws IOException { //no idea how to show the process of making products
		while(true) {
			if(work.finished) break;
		}
		new Finish(productID, Quantity);
		status = false;
		productID = "";
		Quantity = 0;
	}
	
}
