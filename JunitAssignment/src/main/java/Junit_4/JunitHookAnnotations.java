package Junit_4;

public class JunitHookAnnotations {
	public int add(int a,int b) {
		int sum=a+b;
		System.out.println("Adding two number :"+sum);
		return sum;
	}
	
	  public int multiply(int a,int b)
	  { 
		  int mult=a*b;
		  System.out.println("Multiply two number :"+mult); 
		  return mult; 
	  }
	 
}
