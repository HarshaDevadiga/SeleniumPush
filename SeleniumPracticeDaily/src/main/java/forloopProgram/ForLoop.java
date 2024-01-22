package forloopProgram; // Package Name

public class ForLoop { //Class Name
	
	public static void myName() //Method Name
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Harsha");
		}
	}

	//Program to print numbers 1 to 100
	
	public static void numbers()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
	}
	
	//WAP to print factorial Series
	
	public static void factorial()
	{
		int fact=1;
		int factnum=16;
		for(int i=1;i<=factnum;i++)
		{
			fact=fact*i; // 1*1=1, 
		}
			System.out.println(fact);
		
	}
	
	// Fibonacci Series
	
	public static void fibo()
	{
		int f=0;
		int f1=1;
		
		System.out.println(f);
		System.out.println(f1);
		
		for(int i=0;i<=5;i++)
		{
			int f2= f+f1;
			System.out.println(f2);
			f=f1;
			f1=f2;
		}
		
	}
	
	//Swap variables using 2 variable
	public static void swap()
	{
		int a=20;
		int b=30;
		
	int c=a;
		a=b;
		b=c;
		System.out.println("new value of a is"+" "+a);
		System.out.println("new value of b is "+" "+b);
	}
	
	//without using 3rd variables
	public static void swapWithoutVariable()
	
	{ 
		int a=-200;
		int b=100;
		
		a=a-b; //100-200=-100
		b=b+a; //200-100=100
		a=b-a; //100+100=200
		
		System.out.println(a);
		System.out.println(b);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myName();
		//numbers();
		//factorial();
		//fibo();
		//swap();
		swapWithoutVariable();

	}
}

