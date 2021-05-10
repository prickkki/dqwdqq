package hahaa;

public class Main {
  public static void main (String [] args) {
	   Phone phone = new Phone();
	   phone.createContact("Lipa", "078856");
	   phone.seeContacts();
	   phone.sendText("078856", "Lipa mai intreaba ma-ta de mine ?");
	   phone.seeTexts("078856");
	   
	   
     }
  }
