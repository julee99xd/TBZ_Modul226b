package school;

import java.time.LocalDate;

public class Person {
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public String name;
	public String firstName;
	public LocalDate DateOfBirth;
	public String Email;

//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public Person(String name, String firstName, String DateOfBirth, String Email) {
		this.name = name;
		this.firstName = firstName;
		this.DateOfBirth = LocalDate.parse(DateOfBirth);
		this.Email = Email;
	}
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
//-----------------------------------------------
}
