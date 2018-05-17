package problem2;
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
	public void book(){
	
		
	}
	
}
public class Main {
	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		test1 ob=new test1();
		int sum=0,i=1;
		while(true){
		System.out.println("Booking");
		System.out.println();
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		ob.setAc(sc.nextLine());
		System.out.println("Cot(Single/Double");
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
		if(ob.getL().equals("AC")){
			sum=sum+100;
		}
		else{
			sum=sum+0;
		}
		System.out.println("The total charge is Rs."+sum);
		System.out.println("The services chosen are");
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
		if(ob.getL().equals("AC")){
			sum=sum+100;
		}
		else{
			sum=sum+0;
		}
		System.out.println("Do you want to proceed?(yes/no)");
		ob.setPro(sc.nextLine());
		sum=0;
		if(ob.getPro().equals("yes")) break;
		}
		System.out.println("Thank you for booking. Your room number is "+ i++ +".");
	}

}
