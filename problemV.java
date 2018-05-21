

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
