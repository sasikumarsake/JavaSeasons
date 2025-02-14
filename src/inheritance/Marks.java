package inheritance;

public class Marks extends Student {
	
	int m1,m2,m3;
	
	public  void setStudentMarks(int m1, int m2, int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void getStudentMarks()
	{
		System.out.println("Student Marks is "+(m1+m2+m3)); //sum chesanu ikkada
		System.out.println("Student avarage marks is "+(m1+m2+m3)/3);//avg chesanu ikkada
	}

}
