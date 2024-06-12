package Package1;

public class Assignment2 
{
	public int sum(int a, int b)
	{
		int r;
		r = a+b;
		System.out.println("Sum of the result "+ r);
		return r;
	}
	public int Sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub of result "+ z);
		return z;
	}
	public void Mul(int s1, int s2)
	{
		int s3;
		s3 = s1*s2;
		System.out.println("FInal result is "+ s3);
	}
	public static void main(String[] args) 
	{
		Assignment2 obj = new Assignment2();
		int a1 = obj.sum(10, 10);
		int a2 = obj.Sub(5, 2);
		obj.Mul(a1, a2);
		
	}

}
