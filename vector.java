package asignment_10_12;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		Vector<Integer> v=new Vector<Integer>(n);
		for(int i=1;i<=n;i++) {
			v.add(i);		}
		System.out.println(v);
        v.remove(3);
        System.out.println(v);
        
        for(int i=0;i<v.size();i++) {
        	System.out.println(v.get(i)+" ");
        }
	}

}
