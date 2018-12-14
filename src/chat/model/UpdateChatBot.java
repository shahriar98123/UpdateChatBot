package chat.model;

import java.util.ArrayList;

public class UpdateChatBot 
{
	private ArrayList<String> responseList = new ArrayList<String>();
	private ArrayList<String> spookyList = new ArrayList<String>();
	private String content;
	private String currentUser;
	private String joke;
	
	public UpdateChatBot()
	{
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		this.content = new String("Default spoop :(");
		this.currentUser = new String("Default empty spooky");
		this.joke = "What instrumnet does a skeleton play?";
		
		buildTheLists();
		
	}
	public UpdateChatBot(String string) 
	{
		this.content = "default content";
		this.currentUser = new String("default user");
		this.joke = new String ("");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
	}
	private void buildTheLists()
	{
		responseList.add("Hello there! How are you in this lovely evening?");
		responseList.add("That is mean goodbye :( Leave me alone");
		responseList.add("What is your name");
		responseList.add("I can't do the understanding of what statement");
		responseList.add("What are you doing?");
		responseList.add("What do you like to do?");
		
		spookyList.add("What is your favorite holiday(It should be obvious).");
		spookyList.add("Jack Skellington is the bestest!");
		spookyList.add("B O O");
		spookyList.add("If you were to be a halloween monster, what would it be?");
		spookyList.add("Cause this is thriller!");
		spookyList.add("Would you like to do the trick or treat?");
		spookyList.add("Do you carve pumpkins for spooky day?");
		spookyList.add("What is your favorite piece of candy?");
		spookyList.add("Do you have a hallowen costume prepared?");
		
	}
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		
		return answer;
	}
		public boolean spookyChecker(String input)
		{
			Boolean isSpooky = false;
			input = getContent();
			
			for (String spookyPhrase : getSpookyList())
			{
				isSpooky = input.contains(spookyPhrase);
				if(isSpooky = true)
				{
					return isSpooky;
				}
			}
			return isSpooky;
		}
		public Boolean legitimacyChecker(String content)
		{
			content = getContent();
			Boolean isLegitimate = false;
			if(content == null || content.equals(""))
			{
				isLegitimate = false;
			}
			else if (content.equalsIgnoreCase("true"))
			{
				isLegitimate = false;
			}
			else
			{
				isLegitimate = false;
			}
			return isLegitimate;
		}
		public Boolean contentChecker(String input)
		{
			Boolean isValid = true;
			if(input == null)
			{
				isValid = false;
			}
			else if(input.length() < 2)
			{
				isValid = false;
			}
				return isValid;
		}
		public ArrayList<String> getResponseList()
		{
			return responseList;
		}
		public ArrayList<String> getSpookyList()
		{
			return spookyList;
		}
		public String getContent()
		{
			return currentUser;
		}
		public String getCurrentUser()
		{
			return currentUser;
		}
		public String getJoke()
		{
			return joke;
		}
		public void setResponseList(ArrayList<String> responseList)
		{
			this.responseList = responseList;
		}
		public void setSpookyList(ArrayList<String> spookyList)
		{

		public void setContent(String content)
		public void setCurrentUser(String currentuser)
		public void setJoke(String joke)

		// TODO Auto-generated method stub
		return null;
		
		
	}
}


