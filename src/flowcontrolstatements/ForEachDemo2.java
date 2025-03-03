package flowcontrolstatements;

public class ForEachDemo2 {
	public static void main(String[] args) {
		
		
		String[] studentNames = new String[10];
		
		studentNames[0]="Name";
		studentNames[1]="Name1";
		studentNames[2]="Name2";
		studentNames[3]="Name3";
		studentNames[4]="Name4";
		studentNames[5]="Name5";
		studentNames[6]="Name6";
		studentNames[7]="Name7";
		studentNames[8]="Name8";
		studentNames[9]="Name9";
		
		
		//For Each Loop
		
		for(String student:studentNames)
		{
			System.out.println(student);
		}
	}

}
