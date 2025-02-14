package inheritance;

public class Leave extends Marks {

	int sl,cl;
	
	public void setLeaves(int sl, int cl)
	{
		this.sl=sl;
		this.cl=cl;
	}
	public void getLeaves()
	{
		System.out.println("Leaves used "+(sl+cl));
	}
	
	@Override
	public void getStudentDetails()
	
	{
		System.out.println("Roll No is "+rollNo);
		System.out.println("---------------------");
		System.out.println("Student Name is "+sNa);
		
	}
}
