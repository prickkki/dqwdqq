package hahaa;

import java.util.ArrayList;
import java.util.List;


public class Contact {

        private String contactName; 
        private String phoneNumer;
        
        public List<Text> textContactList = new ArrayList<Text>();
        public Contact (String contactName, String phoneNumber) {
        	this.contactName = contactName;
        	this.phoneNumer = phoneNumber;
        	
        }
        public Contact() {
        	
        }

		public String getContactName() {
			return contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getPhoneNumer() {
			return phoneNumer;
		}

		public void setPhoneNumer(String phoneNumer) {
			this.phoneNumer = phoneNumer;
		}
	
}


