package einstieg;

import java.util.ArrayList;

public class NewsFeed {

	//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	private ArrayList<Post> posts;
	
	
//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	public NewsFeed() 
	{	
		posts = new ArrayList<Post>();
	}
	
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 	
	
	public void addPost(Post post) 
	{
		posts.add(post);
	}
//-----------------------------------------------	
	public void show() 
	{
		for(Post post : posts) 
		{
			post.display();
			System.out.println();
		}
	}
}

