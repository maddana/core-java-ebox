import java.util.*;
class test1{
	String n,a,c,e,p,pi;
	int i=1;

	

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

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getPi() {
		return pi;
	}

	public void setPi(String pi) {
		this.pi = pi;
	}
public void register(){
	System.out.println("Welcome "+n+".");
	System.out.println("Here are your details");
	System.out.println("Address: "+a);
	System.out.println("Contact Number: "+c);
	System.out.println("E-Mail ID: "+e);
	System.out.println("Proof type: "+p);
	System.out.println("Proof id: "+pi);
	System.out.println();
	System.out.println("Thank you for registering. Your id is " +i++ +"..");
	
}
}
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 ob=new test1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Registration");
		System.out.println();
		System.out.println("Enter your name");
		ob.setN(sc.nextLine());
		System.out.println("Enter your address");
		ob.setA(sc.nextLine());
		System.out.println("Contact Number");
		ob.setC(sc.nextLine());
		System.out.println("E-Mail ID");
		ob.setE(sc.nextLine());
		System.out.println("Enter proof type");
		ob.setP(sc.nextLine());
		System.out.println("Enter proof id");
		ob.setPi(sc.nextLine());
		System.out.println();
		ob.register();
		sc.close();
	}

}
