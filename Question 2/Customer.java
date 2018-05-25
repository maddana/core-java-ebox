import java.util.Date;


public class Customer {

@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result
+ ((contactNumber == null) ? 0 : contactNumber.hashCode());
result = prime * result + ((email == null) ? 0 : email.hashCode());
return result;
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Customer other = (Customer) obj;
if (contactNumber == null) {
if (other.contactNumber != null)
return false;
} else if (!contactNumber.equals(other.contactNumber))
return false;
if (email == null) {
if (other.email != null)
return false;
} else if (!email.equals(other.email))
return false;
return true;
}

@Override
public String toString() {
return "Customer: "+getName()+"\nCustomer contact details:"+getContactNumber()+", "+getEmail();
}
private Long id; 
private String name; 
private char gender; 
private String email; 
private String contactNumber; 
private Date createdOn;
public Customer()
{
}
public Customer(Long id, String name, char gender, String email,
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
public char getGender() {
return gender;
}
public void setGender(char gender) {
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
}

