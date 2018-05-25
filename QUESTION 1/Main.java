
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb = "Menu\n1. Parse Name\n2. Valid Email\n3. Play Contact Number\n4. User Lifetime\n5. Exit";
        while(true)
        {
            System.out.println(sb);
            
            int inp = Integer.parseInt(br.readLine());
            switch(inp) {
                case 1: 
                    //fill code here.
                 
                 
                 parseName(br);
                 
                 
                    break;
                
                case 2: 
                    //fill code here.
                 
                 isValidEmail(br);
                    break;
                
                case 3: 
                    //fill code here.
                 playContactNumber(br);
                    break;
                
                case 4: 
                    //fill code here.
                 userLifeTime(br);
                    break;
                    
                case 5:
                    //fill code here.
                 System.exit(0);
            }
        }
    }
    
    public static void parseName(BufferedReader br) throws Exception
    {
        System.out.println("Enter name:");
        String name = br.readLine();
//fill code here.
       char ch[]=name.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
        if(!Character.isAlphabetic(ch[i]))
        {
        System.out.println(" ");
        }
        else
        System.out.print(ch[i]);
       }
       System.out.println();
    }
    public static void isValidEmail(BufferedReader br) throws Exception
    {
        System.out.println("Enter E-mail id:");
        String email = br.readLine();
        if(email.contains("@")&&(email.endsWith(".com")||email.endsWith(".org")||email.endsWith(".net")))
            {
         String a[]=email.split("@");
         if(a[1].length()>4)
         
         
         System.out.println("Email id is valid");
            
        else
            System.out.println("Email is invalid");
    }
    else
      System.out.println("Email is invalid");
}
  
    
    
    public static void playContactNumber(BufferedReader br) throws Exception
    {
       
        System.out.println("Enter contact number:");
        String number = br.readLine();
        int k=0;
//fill code here.
        if((number.matches("[0-9]{3}[-]{1}[0-9]{4}[-]{1}[0-9]{10}"))&&(number.length()==19))
        { for(int i=9;i<number.length();i++)
        {
         k=k+Integer.parseInt(number.substring(i,i+1));
         while(k>9)
         {
         k=k%10+k/10;
         }
         }
        
        System.out.println("Sum of contact number: "+k);
        
    }
    else
  System.out.println("Contact number invalid");
    }

    public  static void userLifeTime(BufferedReader br) throws Exception
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date startDate = sdf.parse("28-07-2017 09:00");
        System.out.println("Enter Created on date(dd-MM-yyyy HH:mm):");
        //fill code here.
        String k=br.readLine();
        Date endDate=sdf.parse(k);
        long s=Math.abs(startDate.getTime()-endDate.getTime());
        System.out.println("Life time is: "+(s/60000)+" minutes");
        
    }
    
}

