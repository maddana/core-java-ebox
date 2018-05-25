
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        CustomerAddressBO customerAddressBO = new CustomerAddressBO();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of customer:");
        int n = new Integer(br.readLine());
        List<String> csvList = new ArrayList<>();
        
        for(int i = 0; i<n ;i++)
        {
            System.out.println("Enter the customer "+(i+1)+" detail:");
            String a = br.readLine();
            csvList.add(a);
        }
        List<Customer> customers = Customer.populateCustomers(csvList);
        displayCustomerDetails(customers);
        System.out.println("Enter the substring to search from customer list:");
        String a = br.readLine();
        List<Customer> customers1 = Customer.findCustomerNameFromList(customers, a);
        displayCustomerDetails(customers1);
    }
    public static void displayCustomerDetails(List<Customer> customers)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.format("%-5s %-15s %-5s %-25s %-20s %s\n", "Id","Name","Gender","Email","Contact no","Created on");
        //fill code here.
        for(Customer c:customers){
         System.out.format("%-5s %-15s %-5s %-25s %-20s %s\n", c.getId(),c.getName(),c.getGender(),c.getEmail(),c.getContactNumber(),sdf.format(c.getCreatedOn()));
        }
    }
}

