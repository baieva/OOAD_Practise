import java.io.IOException;
import java.util.Scanner;

public class loginSys {

	private Account[] AccountList;
	private int ListSize = 0;
	private boolean Logged = false;
	private static Scanner inputlogin;
	private static Scanner inputcommand;
	public quesChecker manager;
	
	public loginSys() throws IOException {
		AccountList = new Account[5];
		AccountList[0] = new Account("David","0143");
		AccountList[1] = new Account("George","5143");
		AccountList[2] = new Account("Charlie","8143");
		ListSize = 3;
		manager = new quesChecker(); //dont know how to connect queschecker which is manager system with the other class since it's like socket networking problem
		Login();
	}
	
	public void Login() throws IOException {
		String name;
		String password;
		inputlogin = new Scanner(System.in);
		while(!Logged) {
			System.out.println("Print in User Name");
			name = inputlogin.nextLine();
			System.out.println("Print in Password");
			password = inputlogin.nextLine();
			for(int i = 0; i< ListSize;i++) {
				if(AccountList[i].getName().equals(name)) {
					if(AccountList[i].getPassword().equals(password)) {
						Logged = true;
						break;
					}
				}
			}
			if(Logged) {
				System.out.println("Logged in! Hi, " + name + "!");
			}
			else {
				System.out.println("Wrong User name or Password. Please try again!");
			}
		}
		Command();
	}
	
	public void Command() throws IOException {

		inputcommand = new Scanner(System.in);
		while(Logged) {
			System.out.println("1. Make Order Please type in Product ID and Quantity as format:IDxQua");
			System.out.println("2. Sign out Please type in: q");
			String command = inputcommand.nextLine();
			if(command.equals("q")) {
				System.out.println("Signed out succesfully!");
				Logged = false;
			}
			else {
				String[] detail = command.split("x");
				Order a = new Order(detail[0],detail[1],this);
			}
			
		}
		Login();
	}
	
	public static void main(String[] args) throws IOException {
		new loginSys();
		
	}
}
