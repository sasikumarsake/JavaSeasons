package abstraction;

public class Sum extends Numbers{
	
	@Override
	void compute(int x, int y)
	{
		System.out.println("Sum is "+(x+y));
	}

}
