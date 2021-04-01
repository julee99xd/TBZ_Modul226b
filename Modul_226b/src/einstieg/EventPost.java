package einstieg;

import java.time.LocalDate;

public class EventPost extends Post 
{
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	private String description;
	private LocalDate eventDate;

//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public EventPost(String author, String description, LocalDate eventDate) 
	{
		super(author);
		this.description = description;
		this.eventDate = eventDate;
	}
	
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
			public void display() 
			{
				System.out.println("Description: " + description);
				System.out.println("Event Date: " + eventDate);
				super.display();
			}
}
