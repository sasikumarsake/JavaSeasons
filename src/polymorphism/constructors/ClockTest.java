package polymorphism.constructors;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		Clock c1=new Clock();
		c1.getClock();
		
		//user2
		
		Clock c2=new Clock(7);
		c2.getClock();
		
		//user3
		
		Clock c3=new Clock(3,50);
		c3.getClock();
		
		//user4
		
		Clock c4=new Clock(3,50,57);
		c4.getClock();
	}

}
