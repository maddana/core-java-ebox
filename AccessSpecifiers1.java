import java.util.*;

public class Main {
	static String fName,lName,contactNumber,eMail,proofType,proofId;
	static Scanner sc=new Scanner(System.in);
	public static void registerCustomer() {
		int i=1;
		
		System.out.println("Registration:");
		System.out.println();
		System.out.println("Enter the customer details:");
		System.out.println("Enter the first name:");
		fName=sc.nextLine();
		System.out.println("Enter the last name:");
		lName=sc.nextLine();
		System.out.println("Enter the contact number:");
		contactNumber=sc.nextLine();
		System.out.println("Enter the e-mail id:");
		eMail=sc.nextLine();
		System.out.println("Enter the proof type:");
		proofType=sc.nextLine();
		System.out.println("Enter the proof id:");
		proofId=sc.nextLine();
		System.out.println("Thank you for registering. Your id is " +i++ +"..");
		
	}
	public static void display() {
		System.out.println("The customer details are as follows");
		System.out.println("The customer details are:");
		System.out.println("First Name : "+fName);
		System.out.println("Last Name : "+lName);
		System.out.println("COntact Number : "+contactNumber);
		System.out.println("E-Mail : "+eMail);
		System.out.println("Proof Type : "+proofType);
		System.out.println("Proof ID : "+proofId);
		
	}
	public static void updateEmail() {
		
		System.out.println("Enter the new email:");
		eMail=sc.nextLine();
		System.out.println("Email updated.");
		}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		registerCustomer();
		display();
		System.out.println("Do you want to update email?(y/n)");
		String c=sc.nextLine();
		if(c.equals("y")){
			updateEmail();
			display();
		}
		System.out.println("Thank You");
	}

}
