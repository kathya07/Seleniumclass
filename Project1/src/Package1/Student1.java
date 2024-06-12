package Package1;

public class Student1 // pillar 1 --class creation
{  // Boundary (body)
	int kathya; // variable creation
	public void abc() // -- method name abc , method to perform any operation
	{
		// boundary of method
		System.out.println("Welcome to the Group");
	}
	public static void main(String[] args) // pillar 2 -- Main method creation
	{   // we create objection creation -- pillar 3, using obj we call method and variables.
		// boundary of main method
		Student1 xyz = new Student1();
		xyz.kathya=123;
		xyz.abc();
		System.out.println(xyz.kathya);
	}

}
