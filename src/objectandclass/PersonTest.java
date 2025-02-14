package objectandclass;

public class PersonTest {

	public static void main(String[] args) {

		Person p1=new Person();
	
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		
		//here i have assigning new values to the variables
		p1.name="Sivamani";
		p1.age=25;
		p1.ph=9876543210L;
		
		System.out.println(p1.name);   // Sivamani
		System.out.println(p1.age);		//25
		System.out.println(p1.ph);		//9876543210
		
		p1.greet();
		
		
		
		
		System.out.println(p1.empName);
		System.out.println(p1.empCode);
		System.out.println(p1.empMobileNumber);
		System.out.println(p1.empAddress);
		
		
		p1.empAddress="BTP-ATP_8023_akshdf";
		p1.empCode=90876;
		p1.empMobileNumber=2332987654321L;
		p1.empName="KumarSasi";
		
		
		System.out.println(p1.empAddress);   
		System.out.println(p1.empMobileNumber);		
		System.out.println(p1.empCode);
		System.out.println(p1.empName);
	}

}
