package hahaa;

import java.util.ArrayList;
import java.util.List;
import java.util.List;



public class Phone implements Samsung {
	
	 public List<Call> callsHistory = new ArrayList<Call>() ;
	 public List<Contact> contactList = new ArrayList<Contact>();
	
	private int batteryLife = 100;
	
	public Phone(int batteryLife) {
		 this.batteryLife = batteryLife;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
       public Phone() {
		
	}

	public void createContact(String contactName, String phoneNumber) {
		Contact contact = new Contact(contactName, phoneNumber);
		contactList.add(contact);
		
	}

	
	public void seeContacts() {
		for (Contact cont : contactList ) {
		System.out.println("Contactul :" + cont.getContactName() + " " +cont.getPhoneNumer()) ;
		}
		
	}

	
	public void sendText(String phoneNumber, String text ) {
		  Text txt = new Text(phoneNumber, text);
		  
		  for (Contact contact : contactList) {
		  if( contact.getPhoneNumer() == phoneNumber );
		   contact.textContactList.add(txt);
		  }
	}


	public void makeCall() {
		
		
	}

	
	public void CallsHistory() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	public void seeTexts(String phoneNumber) {
		Text txt = new Text();
		  
		  for (Contact contact : contactList) {
		  if( contact.getPhoneNumer() == phoneNumber ); {
			  for (int i=0;i<10;i++) {
			  System.out.println("Textele : "+ contact.textContactList.get(i) );
		  		}}
		  }
	
}

}
