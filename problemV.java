
//Employee file
---------------------------------------------------------------------------------------
public class Employee {
	String n,a,c,e,p,pi;// variables to store details of customer 
	String ac,cot,cable,wifi,l,date; //variables to store details of room type
	
	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getCot() {
		return cot;
	}

	public void setCot(String cot) {
		this.cot = cot;
	}

	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

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
	}
	public void book(){
		int sum=0;
		if(ac.equals("AC")){
			 sum=sum+1000;
		}
		else{
			sum=750;
		}
		if(cot.equals("Single")){
			sum=sum+0;
		}
		else{
			 sum=sum+350;
		}
		if(cable.equals("C")){
			 sum=sum+50;
		}
		else{
			sum=sum+0;
		}
		if(wifi.equals("W")){
			 sum=sum+200;
		}
		else{
			 sum=sum+0;
		}
		if(l.equals("L")){
			sum=sum+100;
		}
		else{
			sum=sum+0;
		}
	
		System.out.println("The total charge is Rs."+sum+".");
		System.out.println("The services chosen are");
		if(ac.equals("nAC") && cot.equals("Double")){
			System.out.println("Double cot non-AC room");
		}
		else if(ac.equals("nAC") && cot.equals("Single")){
			System.out.println("Single cot non-AC room");
		}
		else if(ac.equals("AC") && cot.equals("Single")){
			System.out.println("Single cot AC room");
		}
		else{
			System.out.println("Double cot AC room");
		}
		if(cable.equals("C")){
			System.out.println("Cable connection enabled");
		}
		else{
			System.out.println("Cable connection disabled");
		}
		if(wifi.equals("W")){
			 System.out.println("Wi-Fi enabled");
		}
		else{
			System.out.println("Wi-Fi disabled");
		}
		if(l.equals("L")){
			System.out.println("with laundry service");
		}
		else{
			System.out.println("without laundry service");
		}
		sum=0;
		System.out.println();
	
	}
}

//Main file
-------------------------------------------------------------------------
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		int i=0,c=0;
		
		int a[]=new int[100];
		int b[]=new int[100];
		Scanner sc=new Scanner(System.in);
		while(true){
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
		System.out.println("Thank you for registering. Your id is " + ++i +"..");
		System.out.println();
		b[i]=i;
		System.out.println("Do you want to book a room (y/n)?");
		String br=sc.nextLine();
		if(br.equals("y")){
			while(true){
				System.out.println();
				System.out.println("Booking:");
				System.out.println("AC/non-AC(AC/nAC)");
				ob.setAc(sc.nextLine());
				System.out.println("Cot(Single/Double)");
				ob.setCot(sc.nextLine());
				System.out.println("With cable connection/without cable connection(C/nC)");
				ob.setCable(sc.nextLine());
				System.out.println("Wi-Fi needed or not(W/nW)");
				ob.setWifi(sc.nextLine());
				System.out.println("Laundry service needed or not(L/nL)");
				ob.setL(sc.nextLine());	
				System.out.println();
				System.out.println("Enter the date of booking");
				ob.setDate(sc.nextLine());
				System.out.println();
				ob.book();
				System.out.println("Do you want to proceed?(yes/no)");
				String pro=sc.nextLine();
				System.out.println();
				System.out.println("Thank you for booking. Your room number is "+ ++c +".");
				a[i]=c;
				if(pro.equals("yes")) break;
			}
		}
		else{
			System.out.println();
			System.out.println("Thank You");
		}
		System.out.println();
		System.out.println("Do you want to continue registration?(yes/no)");
		String re=sc.nextLine();
		System.out.println();
		if(re.equals("no")) break;
		}
		System.out.println("View all bookings:");
		System.out.println();
		System.out.println("Enter the start date");
		String sdate=sc.nextLine();
		System.out.println("Enter the end date");
		String edate=sc.nextLine();
		System.out.println("The bookings made from "+sdate+" to "+edate+" are");
		System.out.println("Room number Customer ID");
		for(int j=1;j<=i;j++){
			if(a[j]>0){
			System.out.format("%d%12d\n",a[j],b[j]);
			}
		}
		
		
	}

}
