package school;

public class Starter {

	public static void main(String[] args) {
		Person stu1 = new Student("Anderegg", "Julia", "1999-08-11", "j.a@gmail.com", "wup20", 1);
		Person stu2 = new Student("Baumli", "Aless", "1999-12-02", "a.b@gmail.com", "wup20", 2);
		Person stu3 = new Student("Murer", "Silja", "1998-11-27", "s.m@gmail.com", "wup20", 3);
		Person tea1 = new Teacher("Donato", "Sperduto", "1972-10-18", "d.s@gmail.com", 230);
		Person tea2 = new Teacher("Stefan", "Deeg", "1967-12-04", "s.d@gmail.com", 150);
		
		int[] studentlist = {1,2};
        Subject math = new Subject("math", 5, 3);
        Subject[] subjectlist = {math};
        SchoolClass c1 = new SchoolClass(studentlist, 0, tea1, subjectlist);
	}

}
