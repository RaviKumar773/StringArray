package Cls01;

import java.util.Scanner;

public class RuntimeInital {
	public static void main(String[] args) {
		
		//String [] names = new String[1];
		//names[0] = "Griselda"
		//int[] a = {2,3,7};
	
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the size of an array");
		int size = s.nextInt();
		 int[] arr = new int[size];
		 for(int i=0;i<size;i++) {
			 System.out.println("Enter the element at index" + i + ": ");
			 arr[i] = s.nextInt();
			
		 }
		 
		 System.out.println("Arrays ELemnts: ");
		 for(int ele : arr) 
			 System.out.println(ele +" ");
		
	}

}
