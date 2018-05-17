
import java.text.*;
import java.util.*;
class test1{
	String ac,cot,cable,wifi,l,date,pro;

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

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
	
}
public class Main {
	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		test1 ob=new test1();
		int sum=0,i=1;
		System.out.println("Booking:");
		System.out.println();
		while(true){
		
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
		System.out.println("Enter the Date of Booking");
		ob.setDate(sc.nextLine());
		
		if(ob.getAc().equals("AC")){
			 sum=sum+1000;
		}
		else{
			sum=750;
		}
		if(ob.getCot().equals("Single")){
			sum=sum+0;
		}
		else{
			 sum=sum+350;
		}
		if(ob.getCable().equals("C")){
			 sum=sum+50;
		}
		else{
			sum=sum+0;
		}
		if(ob.getWifi().equals("W")){
			 sum=sum+200;
		}
		else{
			 sum=sum+0;
		}
		if(ob.getL().equals("L")){
			sum=sum+100;
		}
		else{
			sum=sum+0;
		}
		System.out.println();
		System.out.println("The total charge is Rs."+sum+".");
		System.out.println("The services chosen are");
		if(ob.getAc().equals("nAC") && ob.getCot().equals("Double")){
			System.out.println("Double cot non-AC room");
		}
		else if(ob.getAc().equals("nAC") && ob.getCot().equals("Single")){
			System.out.println("Single cot non-AC room");
		}
		else if(ob.getAc().equals("AC") && ob.getCot().equals("Single")){
			System.out.println("Single cot AC room");
		}
		else{
			System.out.println("Double cot AC room");
		}
		if(ob.getCable().equals("C")){
			System.out.println("Cable connection enabled");
		}
		else{
			System.out.println("Cable connection disabled");
		}
		if(ob.getWifi().equals("W")){
			 System.out.println("Wi-Fi enabled");
		}
		else{
			System.out.println("Wi-Fi disabled");
		}
		if(ob.getL().equals("L")){
			System.out.println("with laundry service");
		}
		else{
			System.out.println("without laundry service");
		}
		System.out.println("and the Date of Booking is "+ob.getDate());
		System.out.println();
		System.out.println("Do you want to proceed?(yes/no)");
		ob.setPro(sc.nextLine());
		System.out.println();
		sum=0;
		if(ob.getPro().equals("yes")) break;
		}
		System.out.println("Thank you for booking. Your room number is "+ i++ +".");
		sc.close();
	}

}

