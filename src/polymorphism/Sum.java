package polymorphism;

public class Sum {
	
	public void add(int x, int y)
	{
		System.out.println("sum is " +(x+y));
	}
//	public void addDouble(double x, double y)
//	{
//		System.out.println("sum is " +(x+y));
//	}
//	public void addThreeInt(int x, int y, int z)
//	{
//		System.out.println("sum is " +(x+y+z));
//	}
//	public void addLong(long x,long y)
//	{
//		System.out.println("sum is " +(x+y));
//	}
	
	
	public void add(double x, double y)
	{
		System.out.println("sum is " +(x+y));
	}
	public void add(long x, long y)
	{
		System.out.println("Sum is(x+y) is " +(x+y));
	}
	public void add(int x, int y, int z)
	{
		System.out.println("Sum is(x+y) is " +(x+y+z));
	}
}
