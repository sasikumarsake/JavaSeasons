package inheritance;

public class Student {
	int rollNo;
	String sNa;
	public void setStudentDetails(int rollNo, String sNa)
	{
		this.rollNo=rollNo;
		this.sNa=sNa;
	}
	public void getStudentDetails()
	
	{
		System.out.println("Roll No is "+rollNo+" Student Name is "+sNa);
	}
}
