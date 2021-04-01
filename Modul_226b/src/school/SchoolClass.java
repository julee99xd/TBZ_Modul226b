package school;

public class SchoolClass {
//Attribute - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public int[] studentlist;
	public int classrep;
	public Teacher mainteacher;
	public Subject[] subjectlist;

//Konstruktor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public SchoolClass(int[] studentlist, int classrep, Person tea1, Subject[] subjectlist) {
        this.studentlist = studentlist;
        this.classrep = classrep;
        this.mainteacher = (Teacher) tea1;
        this.subjectlist = subjectlist;
    }
//Methoden - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
//-----------------------------------------------
}
