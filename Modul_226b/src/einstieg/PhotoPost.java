package einstieg;

public class PhotoPost extends Post
{
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	private String filename;
	private String caption;
	
//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public PhotoPost(String author, String filename, String caption) 
	{
		super(author);
		this.filename = filename;
		this.caption = caption;
	}

//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
		public void display() 
		{
			System.out.println("Filename: " + filename);
			System.out.println("Caption: " + caption);
			super.display();
		}
	
}

