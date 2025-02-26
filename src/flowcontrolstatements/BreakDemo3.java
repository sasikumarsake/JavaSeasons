package flowcontrolstatements;

public class BreakDemo3 {
	public static void main(String[] args) {

label:		
			for (int i = 1; i <= 10; i++)
				for (int j = 1; j <= 10; j++) {
					if (j == 5) {
						break label;
					} else {
						System.out.println(i + "\t" + j);
					}

				}
		System.out.println("Ennd Program..!");
	}

}
