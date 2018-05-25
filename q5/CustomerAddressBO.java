import java.text.SimpleDateFormat;
import java.util.*;
public class CustomerAddressBO {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public List<Customer> populateCustomers(List<String> csvList) throws Exception
    {
        //fill code here.
     List<Customer> a = new ArrayList<Customer>();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
for(int i=0;i<csvList.size();i++){
String b[] = csvList.get(i).split(",");
Customer c = new Customer(Long.parseLong(b[0]), b[1], b[2].charAt(0), b[3], b[4], sdf.parse(b[5]));
a.add(c);
}
return a;
    }
    public List<Customer> findCustomerNameFromList(List<Customer>customers,String subString) throws Exception
    {
        //fill code here.
     List<Customer> a = new ArrayList<Customer>();
for(int i=0;i<customers.size();i++){
if(customers.get(i).getName().contains(subString)){
a.add(customers.get(i));
}
}
return a;
    }
    
    
}