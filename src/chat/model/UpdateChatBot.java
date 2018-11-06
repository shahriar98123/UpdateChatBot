package chat.model;

import java.util.ArrayList;

public class UpdateChatBot {

	public UpdateChatBot(String string) {
		// TODO Auto-generated constructor stub
	}

	public Object getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getSpookyList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getResponseList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object processText(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean spookyChecker(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean legitimacyChecker(String input) 
	{
		boolean isValid = true;
				
				if(input ==null)
				{
					isValid = false;
				}
		// TODO Auto-generated method stub
				return isValid;
	}

	public boolean contentChecker(Object content) {
		// TODO Auto-generated method stub
		return false;
		
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("That was an innapropriate comment, Goodbye");
		
		spookyList.add("Halloween");
		spookyList.add("Boo");
	}
		
		
	}

}
