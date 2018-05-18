import java.util.*;
class test1{
	String ac,cot,cable,wifi,l,date;
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
		
		}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		int i=0;
		do{
			System.out.println("Menu");
			System.out.print("1. Book\n2. Check Status\n3. Exit\nEnter your choice\n");
			ch=Integer.parseInt(sc.nextLine());
		
			switch(ch){
			case 1: 
				test1 ob=new test1();
			
				while(true){
				System.out.println("Booking:");
				System.out.println("Please choose the services required.");
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
				ob.book();
				System.out.println("Do you want to proceed?(yes/no)");
				String pro=sc.nextLine();
				System.out.println("Thank you for booking. Your room number is "+ ++i +".");
				if(pro.equals("yes")) break;
				}
				break;
			case 2:
				System.out.println("Check Status:");
				System.out.println("Enter room number");
				int r=Integer.parseInt(sc.nextLine());
				if(r<=i){
				System.out.println("Room number "+r+" is booked.");
				}
				else System.out.println("Room number "+r+" is not booked.");
				break;
			case 3:
				System.exit(1);
			
			}
		
		} while(true);
		
		
		
			}
		}
