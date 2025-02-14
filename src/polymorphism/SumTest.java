package polymorphism;

public class SumTest {

	public static void main(String[] args) {
		
		Sum obj = new Sum();
		obj.add(20, 40);
		//obj.addDouble(30.99, 40.99); //The method add(int, int) in the type Sum is not applicable for the arguments (double, double)
		//obj.addLong(2233344555L, 7788899555L);//The method add(int, int) in the type Sum is not applicable for the arguments (long, long)
		//obj.addThreeInt(30, 60, 70);
		
		obj.add(40.89, 9787.8098);
		obj.add(983, 870);
		obj.add(6789076756L, 45678900987L);
		obj.add(756, 866, 8767);
		
	}
	

}
