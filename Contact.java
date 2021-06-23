package com.addressbook;
import java.util.*;
public class Contact {

public static void main(String[] args) {
        	System.out.println("Welcome To Address Book Problem");
        	
	        // Creating the AddressBook object.
			AddressBook address = new AddressBook();
			
			
			//Take input from user
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How many person u want to add");
			int n = sc.nextInt();
			ArrayList<AddressBook> list=new ArrayList<AddressBook>();
			for(int i=0;i<n;i++){
			
		
//			ArrayList<AddressBook> list1=new ArrayList<AddressBook>();
			
			// Setting the AddressBook details via the setter methods.
			System.out.print("Enter Your First Name: ");
			String firstName = sc.next();
			address.setFirst_name(firstName);
			
			
			System.out.print("Enter Your Last Name: ");
			String lastName = sc.next();
			address.setLast_name(lastName);

			
			System.out.print("Enter Your City: ");
			String city = sc.next();
			address.setCity(city);

			
			System.out.print("Enter Your State Name: ");
			String state = sc.next();
			address.setState(state);

			
			System.out.print("Enter Your Zip Code: ");
			int zip = sc.nextInt();
			address.setZip(zip);

			
			System.out.print("Enter Your Phone Number: ");
			long phone_number = sc.nextLong();
			address.setPhone_number(phone_number);

			
			System.out.print("Enter Your Email Id: ");
			String email = sc.next();
			address.setEmail(email);
			
			list.add(address);
			
//			list.addAll(list1);
		
	        // Printing the employee details via the 'toString()' method that uses the getter methods.
			//System.out.println(contact.toString());
	    }
		
			System.out.println("Address Book lists are: "+list);
		
}


}
