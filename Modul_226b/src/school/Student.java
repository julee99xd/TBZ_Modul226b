package school;

public class Student extends Person {
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public String schoolClass;
	public int studentNumber;

//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public Student(String name, String firstName, String DateOfBirth, String Email, String schoolClass, int studentNumber) {
		super(name,firstName,DateOfBirth,Email);
		this.schoolClass = schoolClass;
		this.studentNumber = studentNumber;
		
	}
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
//-----------------------------------------------
}
