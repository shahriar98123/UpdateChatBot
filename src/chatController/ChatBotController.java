package chatController;
import java.util.Scanner;

import javax.swing.JOptionPane;

import chat.model.UpdateChatBot;
import chat.tests.ChatbotTest;

public class ChatController
{
	private Scanner inputScanner;
	private UpdateChatBot simpleBot;
	
	
	public ChatController()
	{
		simpleBot = new ChatbotTest();
		inputScanner = new Scanner(System.in);
	}
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hey bud, what's up?");
		output = simpleBot.processText(userResponse);
		return output;
	}
	public void start()
	{
		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
		askUser();
	}
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	public String useChatbotCheckers(String content)
	{
		content = simpleBot.getContent();
		simpleBot.spookyChecker(content);
		
		return content;
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,  "You need to type in a number my spooky one :O");
		}
		return isValid;
	}
	private void askUser()
}

public class ChatBotController {

	public Object getChatbot() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object interactWithChatbot(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object useChatbotCheckers(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOPtionPane
	}

}
