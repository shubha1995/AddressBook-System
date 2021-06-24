package com.addressbook;
import java.util.*;


public class Contact {
	
	

public static void main(String[] args) {
        	
        	List<AddressBook> person = new ArrayList<AddressBook>();
        	Scanner sc = new Scanner(System.in);
        	while(true) {
        		System.out.println("Welcome To Address Book Problem\n\n"
        				+ "Choose your option:\n"
        				+ "1. Create new person\n"
        				+ "2. View all the existing person\n"
        				+ "3. Quit\n");
        		int option = sc.nextInt();
                sc.nextLine();
                switch(option){
                    case 1:
                    	AddressBook address = new AddressBook();
                    	
                    	System.out.print("Enter Your Firstst Name: ");
                    	address.setFirst_name(sc.nextLine());
            			
            			System.out.print("Enter Your Last Name: ");
            			address.setLast_name(sc.nextLine());
            			

            			System.out.print("Enter Your City: ");            		
            			address.setCity(sc.nextLine());
            			
            			System.out.print("Enter Your State Name: ");         		
            			address.setState(sc.nextLine());

            			
            			System.out.print("Enter Your Zip Code: ");           			
            			address.setZip(sc.nextInt());

            			
            			System.out.print("Enter Your Phone Number: ");
            			address.setPhone_number(sc.nextLong());

            			
            			System.out.print("Enter Your Email Id: ");
            			address.setEmail(sc.next());
            			
            			 person.add(address);
            			 break;
                    case 2:
                        System.out.println("First_name\tLast_name\tCity\tState\tZip\tPhone_number\tEmail_id");
                        for (AddressBook addPerson : person) {
                            System.out.println(addPerson);
                        }
                        System.out.println("\n\n");
                        break;
                    case 3:
                        return;
        				
        				
        		
        	}
        	}
}
}




