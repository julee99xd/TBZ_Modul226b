package school;

public class Teacher extends Person {
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
public int roomNumber;

//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Teacher(String name, String firstName, String DateOfBirth, String Email, int roomNumber) {
		super(name,firstName,DateOfBirth,Email);
		this.roomNumber = roomNumber;
		
	}
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
//-----------------------------------------------
}
