package Assgn1;

public class Arr2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if the array index is even,the value should be odd and viceversa(0 in 0 index) 
		int arr = 6;
		int[] arr1= new int[6];
		
		for(int i=0;i<6;i++) {
			if(i%2==0) {
				arr1[i]=2*i+1;
			}
			else {
				arr1[i]=2*i;
				
			}
				
			}
		for(int value: arr1) {
			System.out.print(value+" ");
			
		}
		}

	}


