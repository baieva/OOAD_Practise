import java.io.IOException;

public class quesChecker {

	private PGroup[] groups;
	private int groupsize;
	
	public quesChecker() {
		groups = new PGroup[3];
		groups[0] = new PGroup();
		groups[1] = new PGroup();
		groups[2] = new PGroup();
		groupsize = 3;
	}

	public void set(String iD, int quantity) throws IOException {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i < groupsize; i++) {
			if(!groups[i].status) {
				groups[i].start(iD, quantity);
				break;
			}
		}
		if(i == groupsize) { //how to make a waiting queue
			System.out.println("No empty group!");
		}
	}
}
