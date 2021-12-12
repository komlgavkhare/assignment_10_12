package asignment_10_12;

import java.util.Scanner;

public class Number {
	private Double a;
	Scanner sc= new Scanner(System.in);


	public Boolean IsZero() {
		System.out.println("enter value");
		a= sc.nextDouble();
		 Boolean x=(a==0);
		 return x;   
	}
	public Boolean Isnegative() {
		System.out.println("enter value");
		a= sc.nextDouble();
		 Boolean x=(a<0);
		 return x;
		}
	public Boolean Ispositive() {
		System.out.println("enter value");
		a= sc.nextDouble();
		 Boolean x=(a>0);
		 return x;
		}
	public Boolean Isodd() {
			System.out.println("enter value");
			a= sc.nextDouble();
			 Boolean x=(a%2!=0);
			 return x;
			}
	public Boolean Iseven() {
		System.out.println("enter value");
		a= sc.nextDouble();
		 Boolean x=(a%2==0);
		 return x;
		}
	public boolean Isprime() {
		System.out.println("enter value");
		a= sc.nextDouble();
		for(int i=2;i<a;i++) {
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
	public Boolean Isarmstrong() {
		int count=0;
		int result=0;
		System.out.println("enter value");
		int a= sc.nextInt();
		int num = a;
		int c=a;
		while(c>0) {
			c=c/10;
		   count++;
		}
		while(a!=0) {
			double rem=a%10;
			
			result = (int) (result+Math.pow(rem, count));
			a=a/10;
			
		    
		}
		System.out.println(+result);
		if(result==num)
		{
			return true;
		}
		else {
		 return false;
		}
	
		}
	
	
	public double getFactorial() {
		double fact = 1;
		System.out.println("enter value");
		a= sc.nextDouble();
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println(+fact);
		
		return fact;
		
	}
	public double getsqrt() {
		double sqrt = 0;
		System.out.println("enter value");
		a= sc.nextDouble();
		System.out.println("sqr is"+Math.sqrt(a));
		return sqrt;
		
			
		}
	
public double getsqr() {
	double sqr = 0;
	System.out.println("enter value");
	a= sc.nextDouble();
	sqr=a*a;
	System.out.println("sqr is"+sqr);
	return sqr;
	
		
	}
public void sumdigit() {
	int digit = 0;
	System.out.println("enter value");
	int a= sc.nextInt();
	while(a>0) {
		digit+=a%10;
		a=a/10;
	}
	System.out.println(+digit);

	
	
}
public double getreverse() {
	int rev = 0;
	System.out.println("enter value");
	int a= sc.nextInt();
	while(a>0) {
		int n=a%10;
		rev=rev*10+n;
		a=a/10;
		
	}
	System.out.println("rev is ="+rev);
	return rev;
	
}
	public void out(boolean y) {
	if(y==true)
	{
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean y;
		Number n=new Number();
		System.out.println("check value is zero");
		 y=n.IsZero();
		n.out(y);
		System.out.println("check value is even");
		y=n.Iseven();
		n.out(y);
		System.out.println("check value is negative");
		y=n.Isnegative();
		n.out(y);
		System.out.println("check value is positive");
		y=n.Ispositive();
		n.out(y);
		System.out.println("check value is odd");
		y=n.Isodd();
		n.out(y);
		System.out.println("check value is armstrong");
		y=n.Isarmstrong();
		n.out(y);
		System.out.println("factorial is = ");
		n.getFactorial();
		System.out.println("reverse digit ");
		n.getreverse();
		System.out.println("sum of digit ");
		n.sumdigit();
		System.out.println("squre is= ");
		n.getsqr();
		System.out.println("squareroot is =");
		n.getsqrt();
	

	}

}
