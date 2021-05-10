package hahaa;

import java.util.List;

public interface Samsung {
	public void createContact (String contactName, String phoneNumber);
	public void seeContacts();
	public void seeTexts(String phoneNumber);
	public void makeCall();
	public void CallsHistory();
	void sendText(String phoneNumber, String text);
}

