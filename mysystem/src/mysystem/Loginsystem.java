package mysystem;
import java.util.Scanner;
public class Loginsystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String name,password;
		
	    String correctname="Kazibwe Anorld";
	    String correctpassword="kazd2002";
		System.out.println("Enter Your Name: ");
	    name= input.nextLine();
		
		System.out.println("Enter Your Password");
		password= input.nextLine();
		
		for(int attempts= 1; attempts<=3; attempts++) {
			System.out.println("Attempts" + attempts +":");
			System.out.println("Enter name: ");
			String predifinedname= input.nextLine();
			 
			System.out.println("Enter password: ");
			String predifinedpassword= input.nextLine();
			if(name.equals(correctname)&& (password.equals(correctpassword))) {
				System.out.println("Login successful.");
				break;
			} else {
				System.out.println("Login failed");
				if(attempts ==3) {
					System.out.println("Access denied");
				}
			}
		}
	}
}
