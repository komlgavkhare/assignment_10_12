package asignment_10_12;

public class Point {
	 private int x=12,y=14;
	 

	 public  Point() {
		 System.out.println("default constructor");
		 System.out.println("x = "+x+"\n"+"y = "+y);
	 }
	 public Point(int x,int y) {
		 System.out.println("parameterised constructor");
		 System.out.println("x = "+x+"\n"+"y = "+y);
	 }
     
	 public void setX(int x)
	 {
		 System.out.println("set X method");
		 System.out.println("x = "+x+"\n"+"y = "+y);
	 }
	 public void setY(int y) {
		 System.out.println("set Y method");
		 System.out.println("x = "+x+"\n"+"y = "+y);
	 } 
	 public void setXY(int x, int y) {
		 System.out.println("set X and Y method");
		 System.out.println("x = "+x+"\n"+"y = "+y);

	 }
		 public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
			 Point p = new Point();
			Point p1=new Point(34,65);
			p.setX(45);
			p1.setY(32);
			p.setXY(10, 10);
			 
     
	}

}
