MAin file
--------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Room1> roomList =new ArrayList<Room1>();
		String ch;
		Hotel1 obj=new Hotel1();
		
		obj.insert();
		do{
			Room1 obj1=new Room1();
		obj1.insertRoom();
		roomList.add(obj1);
		System.out.println("Do you want to add Another Room (yes/no):");
		ch=Hotel1.sc.nextLine();
		}while(ch.equals("yes"));
		
		System.out.println("Thank you for booking !!");
		obj.display();
		for(Room1 x:roomList){
			System.out.println(x);
		}
	}

}
------------------------------------------------------------------
Hotel File
-------------------------------------------------------------------
import java.util.*;
public class Hotel1 {
	String name,hotelId,address;

	public static Scanner sc=new Scanner(System.in);

public void display() {
	System.out.println("The rooms Details in "+name+" :");
	System.out.println("Hotel Name:"+name+".");
	System.out.println("Hotel ID:"+hotelId);
	System.out.println("Hotel Address:"+address);
	
}
public void insert() {
	System.out.println("Enter the hotel details:");
	System.out.println("Enter the Hotel Name:");
	name=sc.nextLine();
	System.out.println("Enter the Hotel ID:");
	hotelId=sc.nextLine();
	System.out.println("Enter the Hotel Address");
	address=sc.nextLine();
}
}


-------------------------------------------------------------------
Room File
--------------------------------------------------------------------

public class Room1 {
	int roomId;
	String roomType; 
	String roomNumber; 
	String roomCapacity;
	String roomAc; 
	String roomWifi; 
	String roomCabel;
	String roomLaundry;
	public Room1(int roomId, String roomType, String roomNumber, String roomCapacity, String roomAc, String roomWifi,
			String roomCabel, String roomLaundry) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.roomCapacity = roomCapacity;
		this.roomAc = roomAc;
		this.roomWifi = roomWifi;
		this.roomCabel = roomCabel;
		this.roomLaundry = roomLaundry;
	}
	public Room1(){
		
	}
	public void insertRoom() {
		System.out.println("Enter the Room Details:");
		System.out.println("Enter the Room Id:");
		roomId=Integer.parseInt(Hotel1.sc.nextLine());
		System.out.println("Enter the Room Number:");
		roomNumber=Hotel1.sc.nextLine();
		System.out.println("Enter the Room Type:");
		System.out.println("1)Normal");
		System.out.println("2)Delux");
		System.out.println("3)Super Delux");
		roomType=Hotel1.sc.nextLine();
		System.out.println("Enter the capacity:(1/2/3/4)");
		roomCapacity=Hotel1.sc.nextLine();
		System.out.println("AC Service (true/false):");
		roomAc=Hotel1.sc.nextLine();
		System.out.println("Wi-Fi Service (true/false):");
		roomWifi=Hotel1.sc.nextLine();
		System.out.println("Cable Service (true/false):");
		roomCabel=Hotel1.sc.nextLine();	
		System.out.println("Laundry Service (true/false):");
		roomLaundry=Hotel1.sc.nextLine();
		
	}
	@Override
	public String toString() {
		String temp= "Room Number :"+roomNumber+"\n"+"Room Type :" +roomType+"\n"+
	"Services Available:"+"\n";
		if(roomType.compareTo("1")==0) {
			temp=temp+"Normal\n";
		}
		else if(roomType.compareTo("2")==0) {
			temp=temp+"Delux\n";
		}
		else {
			temp=temp+"Super Delux\n";
		}
		if(roomAc.compareTo("true")==0)
		{
			temp=temp+"AC\n";
		}
		if(roomWifi.compareTo("true")==0)
		{
			temp=temp+"Wi-Fi\n";
		}
		if(roomCabel.compareTo("true")==0)
		{
			temp=temp+"Cable Connection\n";
		}
		if(roomLaundry.compareTo("true")==0)
		{
			temp=temp+"Laundry\n";
		}
	return temp;
	
}
}


