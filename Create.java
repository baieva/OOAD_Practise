
public class Create {
	
	public boolean finished;

	public Create(PGroup pGroup, String productID, int quantity) {
		// TODO Auto-generated constructor stub
		finished = false;
		System.out.println("Start making");
		int i = 0;
		while(i < 200) { //simulate producing
			System.out.println("Making..." + i/2 + "%");
			i++;
		}
		System.out.println("Done!");
		finished = true;
	}

}
