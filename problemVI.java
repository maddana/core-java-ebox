//Customer file

----------------------------------------------------

public class Customer {
	String n,a,c,e,pt,pi;

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public String getPi() {
		return pi;
	}

	public void setPi(String pi) {
		this.pi = pi;
	}

	
}

//Main File

---------------------------------------------------------

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob=new Customer();
		int i=0;
		int a[]=new int[10];
		String b[]=new String[10];
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Registration");
		
		System.out.println("Enter your name");
		ob.setN(sc.nextLine());
		
		System.out.println("Enter your address");
		ob.setA(sc.nextLine());
		System.out.println("Contact Number");
		ob.setC(sc.nextLine());
		System.out.println("E-Mail ID");
		ob.setE(sc.nextLine());
		System.out.println("Enter proof type");
		ob.setPt(sc.nextLine());
		System.out.println("Enter proof id");
		ob.setPi(sc.nextLine());
		
		System.out.println("Thank you for registering. Your id is "+ ++i +".");
		a[i]=i;
		b[i]=ob.getN();
		
		System.out.println("Do you want to continue registration (y/n)?");
		String r=sc.nextLine();
		if(r.equals("n")) break;
		}
		System.out.println("Customers list");
		System.out.println("The registered customers are");
		System.out.println("Customer ID    Customer name  ");
		for(int j=1;j<=i;j++){
			System.out.format("%-15d%-15s\n",a[j],b[j]);
		}
		System.out.println("Thank You");
	}

}
