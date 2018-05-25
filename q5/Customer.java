import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private Character gender;
    private String email;
    private String contactNumber;
    private Date createdOn;
public Customer(Long id, String name, Character gender, String email,
String contactNumber, Date createdOn) {
super();
this.id = id;
this.name = name;
this.gender = gender;
this.email = email;
this.contactNumber = contactNumber;
this.createdOn = createdOn;
}
public Long getId() {
return id;
}
public void setId(Long id) {
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
public static List<Customer> populateCustomers(List<String> csvList) throws NumberFormatException, ParseException{
List<Customer> a = new ArrayList<Customer>();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
for(int i=0;i<csvList.size();i++){
String b[] = csvList.get(i).split(",");
Customer c = new Customer(Long.parseLong(b[0]), b[1], b[2].charAt(0), b[3], b[4], sdf.parse(b[5]));
a.add(c);
}
return a;
}
      
public static List<Customer> findCustomerNameFromList(List<Customer> customers, String subString){
List<Customer> a = new ArrayList<Customer>();
for(int i=0;i<customers.size();i++){
if(customers.get(i).name.contains(subString)){
a.add(customers.get(i));
}
}
return a;
}
}
