package einstieg;

import java.time.LocalDate;

public class Starter 
{


	public static void main(String[] args) 
	{
		
		
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("john", "Had a great day up in Zermatt!");
		post1.like();
		post1.like();
		post1.addComments("Wow!");
		
		PhotoPost post2 = new PhotoPost("john", "sunset.jpg", "Beautiful sunset!");
		post2.like();
		post2.like();
		post2.like();
		post2.addComments("*-*");
		
		EventPost post3 = new EventPost("john", "Geburi-Feier", LocalDate.of(2021, 8, 11));
		post3.like();
		post3.like();
		post3.like();
		post3.addComments("*-*");
		
		news.addPost(post1);
		news.addPost(post2);
		news.addPost(post3);
		news.show();
	
		

	}

}
