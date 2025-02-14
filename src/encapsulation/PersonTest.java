package encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		//create object for Person Class
		Person p1=new Person("John",25);
		
        // Displaying modified values
        System.out.println("Existing  Name: " + p1.getName());
        System.out.println("Existing Age: " + p1.getAge());
        
        

        p1.setName("Sasikumar");
        p1.setAge(30);
        
        System.out.println("Updated Name: " + p1.getName());
        System.out.println("Updated Age: " + p1.getAge());
        
        //it will get a error because Age cannot be negative or zero.
        p1.setAge(-5);
        
       
	}

}
