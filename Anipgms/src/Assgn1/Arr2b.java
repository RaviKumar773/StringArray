package Assgn1;

public class Arr2b {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2 arrays with even and odd numbers and print them
		int[] arr = {3,5,2,10,1,4};
		System.out.println("Even numbers are : ");
		for(int i =0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
				
		}
		System.out.println();
		System.out.println("Odd numbers are : ");
			for(int i =0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
			
				
		}
		
		

	}

}
