package Package1;

public class Assignment1 
{
	int rollNo, age ;
	public void method1()
	{
		System.out.println("Welcome to all of you");
	}
	public void method2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) 
	{
		Assignment1 kathya = new Assignment1();
		kathya.rollNo = 1;
		System.out.println(kathya.rollNo);
		kathya.age = 38;
		System.out.println(kathya.age);
		kathya.method1();
		kathya.method2();
		
	}
}
