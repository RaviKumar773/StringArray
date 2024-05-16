package Cls01;

import java.util.Arrays;

public class ArrayEqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[] {1, 2 ,3};
		int[] ar2 = new int[] {1, 2, 3};
		
		if(ar1.equals(ar2))
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		
		
		if(Arrays.equals(ar1, ar2))
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		
		
		

	}

}
