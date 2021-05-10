package hahaa;



public class Text {
	  
	  private String text ;
	  
	  Contact contact = new Contact();
      private String phoneNumber = contact.getPhoneNumer();
      
      public Text (String phoneNumber,String text ) {
      	this.text = text ;
      	this.phoneNumber = phoneNumber;
      }
      public Text () {
    	  
      }

		public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
	public String toString() {
		return text;
	}
	
}
