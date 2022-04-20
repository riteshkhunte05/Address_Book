package address_book_22;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressBook {
	
    static Scanner sc=new Scanner(System.in);
    private static ArrayList<ContactInfo> contactList = new ArrayList<ContactInfo>();

    public AdressBook(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
        super();
    }

    public AdressBook() {
        super();
    }
    
    public void insertContact(ContactInfo contactDetailObject) {

        contactList.add(contactDetailObject);
    }
    
	
	
	
	public static void contactEdit(String nameToEdit)
    {
        
		 for(ContactInfo editContact: contactList) {
	            if(editContact.getFirstName().equals(nameToEdit)) {

	                System.out.println("Edit Firstname : ");
	                String firstname = sc.nextLine();
	                editContact.setFirstName(firstname);

	                System.out.println("Edit Lastname : ");
	                String lastname = sc.nextLine();
	                editContact.setLastName(lastname);

	                System.out.println("Edit Address : ");
	                String address = sc.nextLine();
	                editContact.setAddress(address);

	                System.out.println("Edit City : ");
	                String city = sc.nextLine();
	                editContact.setCity(city);

	                System.out.println("Edit State : ");
	                String state = sc.nextLine();
	                editContact.setState(state);

	                System.out.println("Edit Zip : ");
	                int zip = sc.nextInt();
	                editContact.setZip(zip);

	                System.out.println("Edit PhoneNumber : ");
	                long phonenumber = sc.nextLong();
	                sc.nextLine();
	                editContact.setPhoneNo(phonenumber);

	                System.out.println("Edit Email : ");
	                String email = sc.nextLine();
	                editContact.setEmail(email);
	            }
	        }
    }

	
	public void delete(String nameToDelete) {
        int i=0;
        for(i=0;i<contactList.size();i++) {
            if(contactList.get(i).firstname.equals(nameToDelete)) {
                contactList.remove(i);
                System.out.println("Contact is Deleted");
            }
            else {
                System.out.println("Contact not found!");
            }
        }
    }
	public void printContactDetails() {
        for(ContactInfo getInfo: contactList) {
            System.out.println("Firstname : " + getInfo.getFirstName());
            System.out.println("Lastname : " + getInfo.getLastName());
            System.out.println("Address : " + getInfo.getAddress());
            System.out.println("City : " + getInfo.getCity());
            System.out.println("State : " + getInfo.getState());
            System.out.println("Zip : " + getInfo.getZip());
            System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
            System.out.println("Email : " + getInfo.getEmail());
        }
    }
}