package lab04.exercise02.serverCountText;

public class TextGenerator {
	
	/**
	 * This method generates current date
	 * 
	 * @return current date
	 */
	
	public int countWordsUsingSplit() 
	{
		String input = "This is Lab 4";
		
		String[] words = input.split("\\s+"); 
		
		return words.length; 
	}


}
