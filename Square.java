package mypack;

import java.util.Scanner;

public class Square {
	public  Double Squar() {
	
			System.out.println("enter radious");
			try (Scanner sc = new Scanner(System.in)) {
			int rad =  sc. nextInt();
			double Square=rad*rad;
			return Square;
			}
					
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Square sq=new Square();   
	}

}
