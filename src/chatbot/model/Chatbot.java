package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{
	private ArrayList<String> myMemes;
	private ArrayList<String> myVideoGames;
	private ArrayList<String> myRandomList;
	
	public Chatbot()
	{
		myMemes = new ArrayList<String>();
		myVideoGames = new ArrayList<String>();
		myRandomList = new ArrayList<String>();
		
		fillTheMemeList();
		fillTheRandomList();
	}
	
	/**
	 * Helper method to fill the myRandomList.
	 * 
	 *
	 */
	
	
	private void fillTheRandomList()
	{
		myRandomList.add("penguins");
		myRandomList.add("I have to say somethingrandom?");
		myRandomList.add("you dont want that?");
		myRandomList.add("cat");
	}
	
	private void fillTheMemeList()
	{
		myMemes.add("the jammies are rustled");
		myMemes.add("cats");
		myMemes.add("what does the fox say");
		myMemes.add("philosoraptor");
		myMemes.add("iamdisappoint");
	}
	
	public String getRandomTopic()
	{
		String randomTopic = "";
		
		double myRandomNumber = Math.random();
		int myRandomListPosition = (int) (myRandomNumber * myRandomList.size());
		randomTopic = myRandomList.get(myRandomListPosition);
		
		return randomTopic; 
	}
	
	public boolean memeChecker(String currentPhrase)
	{
		boolean isMeme = false;
		
		if(currentPhrase != null)
		{
			for(String currentMeme : myMemes)
			{
				if(currentPhrase.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}
		}
		
		return isMeme;
		
		public string putNameInAlphabeticOrder( String first, String middle, String last)
		{
			String sortedName = "";
			
			if(first.compareTo(middle)< 0)
		
			{
				if(first.compareTo(last) < 0)
				{
					if(middle.compareTo(last) < 0)
					{
						sortedName = first + ", " + middle + ", " + last;
					}
					else
					{
						sortedName = first + ", " + last + "," + middle;
					}
					
				}
				else
				{
					sortedName = last +"," + first +"," + middle;
				}
			}
			else
			{
				if(middle.compareTo(last) < 0)
				{
					if(last.compareTo(last) < 0)
					
						
						
							
					
				
						
				
			
				
			
			
			
		
		
	
	
	private void fillTheVideoGamesList()
	{
		myVideoGames.add("Pokemon");
		myVideoGames.add("Zelda");
		myVideoGames.add("Mario");
		myVideoGames.add("Call of Duty");
	}
	
	public boolean videoGameChecker(String currentPhrase)
	{
		boolean isGame = false;
		
		if(currentPhrase != null)
		{
			for(String currentGame : myVideoGames)
			{
				if (currentPhrase.equalsIgnoreCase(currentGame))
				{
					isGame = true;
				}
			}
		}
		return isGame;
	}
	
	public void conversationPiece()
	{
		
		JOptionPane.showMessageDialog(null,"cats are stupid");
	}
 
}
