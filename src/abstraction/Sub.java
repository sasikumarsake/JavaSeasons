package abstraction;

public class Sub extends Numbers{
	
	@Override
	void compute(int x, int y)
	{
		System.out.println("Difference is "+(x-y));
	}

}
