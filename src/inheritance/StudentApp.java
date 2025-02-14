package inheritance;

public class StudentApp {

	public static void main(String[] args) {
		
		//Student s1=new Student ();
		//Marks s1=new Marks();
		Leave s1=new Leave();
		s1.setStudentDetails(3, "Sasikumar");
		s1.getStudentDetails();
		s1.setStudentMarks(90, 70, 37);
		s1.getStudentMarks();
		s1.setLeaves(30, 10);
		s1.getLeaves();
	}

}
