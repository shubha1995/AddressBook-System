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
        				+ "3. Edit The Exisiting array\n"
        				+ "4. Remove The Person\n"
        				+ "5. Quit\n");
        		int option = sc.nextInt();
                sc.nextLine();
                switch(option){
                //Add New Contact
                    case 1:
                    	AddressBook address = new AddressBook();
                    	
                    	System.out.print("Enter Your Firstst Name: ");
                    	address.setFirstName(sc.nextLine());
            			
            			System.out.print("Enter Your Last Name: ");
            			address.setLastName(sc.nextLine());
            			

            			System.out.print("Enter Your City: ");            		
            			address.setCity(sc.nextLine());
            			
            			System.out.print("Enter Your State Name: ");         		
            			address.setState(sc.nextLine());

            			
            			System.out.print("Enter Your Zip Code: ");           			
            			address.setZip(sc.nextInt());

            			
            			System.out.print("Enter Your Phone Number: ");
            			address.setPhoneNumber(sc.nextLong());

            			
            			System.out.print("Enter Your Email Id: ");
            			address.setEmail(sc.next());
            			
            			 person.add(address);
            			 break;
            			 //View all existing person
                    case 2:
                        
                        for (AddressBook addPerson : person) {
                            System.out.println(addPerson);
                        }
                        System.out.println("\n\n");
                        break;
                       // edit existing contact
                    case 3:
                    	System.out.println("Edit record");
                    	System.out.println("Enter name to edit:");
                    	for(int i=0;i<person.size();i++){
               			address=person.get(i);
                         	
                      if(sc.nextLine().equals(address.getFirstName())) {
                    		 System.out.println("Enter new city:");
            				 address.setCity(sc.nextLine());    				 
            				 System.out.println("List After is"+person.toString());
                      }
            				 else {
            					 System.out.println("User not found");
            				 }
                    	}
            				 break;
            		//Remove person
                    case 4:
                    	System.out.println("remove record");
                    	System.out.println("Enter name to remove:");
                    	for(int i=0;i<person.size();i++){
               			address=person.get(i);
               			if(sc.nextLine().equals(address.getFirstName())) {
               			person.remove(address);
               			System.out.println("List After removing"+person.toString());
               			}
               			else {
              				 System.out.println("User not found");
              			 }
                    	}
               				 break;
               			 
               		
                    case 5:
                        return;
            	}
            	}
    }
    }




