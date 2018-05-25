import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Customer {
private int id;
private String name;
private Character gender;
private String email;
private String contactNumber;
private Date createdOn;
private Address address;
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public Customer(int id, String name, Character gender, String email,
String contactNumber, Date createdOn, Address address) {
super();
this.id = id;
this.name = name;
this.gender = gender;
this.email = email;
this.contactNumber = contactNumber;
this.createdOn = createdOn;
this.address = address;
}
@Override
public String toString() {
return "Customer: "+name+"\nCustomer contact details:"+contactNumber+", "+email;
}
public Customer() {
super();
// TODO Auto-generated constructor stub
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Character getGender() {
return gender;
}
public void setGender(Character gender) {
this.gender = gender;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getContactNumber() {
return contactNumber;
}
public void setContactNumber(String contactNumber) {
this.contactNumber = contactNumber;
}
public Date getCreatedOn() {
return createdOn;
}
public void setCreatedOn(Date createdOn) {
this.createdOn = createdOn;
}
public static Customer findCustomerById(List<Customer> customerList, int id){
Customer c=null;
for(Customer c1:customerList){
if(c1.getId()==id)
c=c1;
}
return c;
}
public static List<Customer> findCustomerListByState(List<Customer> customerList, String state){
List<Customer> clist=new ArrayList<Customer>();
for(Customer c:customerList){
if(c.getAddress().getState().equalsIgnoreCase(state))
clist.add(c);
}
return clist;
}
}
