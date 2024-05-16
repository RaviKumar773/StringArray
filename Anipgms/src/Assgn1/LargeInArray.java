package Assgn1;

public class LargeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,2,10,1,4};
		
		int largest = arr[0];
		int least = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if (arr[i]>largest)
			largest = arr[i];
			else if (arr[i]<least)
				least=arr[i];
			
			
		}
		System.out.println("Largest number is : "+largest);
		System.out.println("Least number is : "+least);
		

	}

}
