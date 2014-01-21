package chatbot.view;

import javax.swing.JOptionPane;
import chatbot.model.Chatbot;

public class ChatbotView
{
	private Chatbot myChatbot;
	
	public ChatbotView()
	{
		myChatbot = new Chatbot();
	}

	public void showApp()
	{
		String input = "keep going";
		
		while(input == null || !input.equals("no"))
		{
			JOptionPane.showMessageDialog(null, myChatbot.getRandomTopic());
			input = getInput();
			useInput(input);
		}
		
		myChatbot.conversationPiece();
	}
	/**
	 * Captures the users input based on a question.
	 *
	 * @return the String object typed by the user.
	 */
	
	private String getInput()
	{
		String input = "";
		
		input = JOptionPane.showInputDialog("what do you want to talk about?");
		
		return input;
	}
	
	/**
	 * In this area code does is create a private area for input.
	 * @param userInput
	 */
	
	private void useInput(String userInput)
	{
		if(myChatbot.memeChecker(userInput))
		{
			JOptionPane.showMessageDialog(null,"I knew that " + userInput+"is a meme!!!!!!!");
		}
		JOptionPane.showMessageDialog(null, " wow that is interesting that you want to talk with me about " + userInput);
		
		if(myChatbot.videoGameChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, " I have played " + userInput);
		}
		JOptionPane.showMessageDialog(null, " wow that is interesting that you want to talk with me about " + userInput); 
	}
}


