package asignment_10_12;

import java.util.Scanner;

class box{
		float length,breath,height;
		Scanner sc=new Scanner(System.in);
		public box() {
			
			
		}
		public void set() {
			System.out.println("enter length of box = ");
			length=sc.nextFloat();
			System.out.println("enter breath of box = ");
			breath=sc.nextFloat();
			System.out.println("enter height of box = ");
			height=sc.nextFloat();
		}
		public double volume() {
			double v=0;
			v=length*breath*height;
			return v;
		}
		public double area() {
			double a=0;
			a=2*((length*height)+(height*breath)+(length*breath));
			return a;
		}
		
		
	}
 class box3d extends box{
	 public void disp()
	 {
		 this.area();
		 System.out.println("area is = "+area());
		 this.volume();
		 System.out.println("volume is = "+volume());
	 }
	
}
public class Main{
	public static void main(String args[]) {
		box3d bx=new box3d();
		bx.set();
		bx.area();bx.volume();
		bx.disp();
	}
	
}
