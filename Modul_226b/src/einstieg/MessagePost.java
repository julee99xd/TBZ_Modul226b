package einstieg;

public class MessagePost extends Post
{
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	private String message;
	
//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	public MessagePost(String author, String text) 
	{
		super(author);
		message = text;
	}
	
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	public void display() 
	{
		System.out.println("Message: " + message);
		super.display();
	}
//-----------------------------------------------	
}

