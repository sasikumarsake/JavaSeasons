package exceptions;

public class ThrowsDemo1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hi...!!");
		
		//Thread.sleep(3000);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
