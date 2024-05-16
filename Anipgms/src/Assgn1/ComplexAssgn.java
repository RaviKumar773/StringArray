package Assgn1;

public class ComplexAssgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {3,5,2,10,1,4};
		
		int temp=0;
		
		System.out.println("Elements of an Array");
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+ " ");		
		System.out.println();
		//Ascending order
		for(int i=0;i<ar.length;i++)  {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Elements are sorted in ascxending order");		
		for(int i=0;i<ar.length;i++) 
			System.out.print(ar[i] +" ");
		System.out.println();      // 1		2	3	4	5	10
		//highest even index should have lowest even value and highest odd index should have highest odd number
		//0-10  	1-1  	2-4 	3-3,	4-2	 5-5
		int ab=ar.length-2;
		System.out.println("Array highest index: " +ab);
		//if(ab%2==0) 
//		for(int i=ar.length-1;i<=0;i-=2) {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]%2==0) {
					int mp=ar[i];
					ar[i]=ar[ab];
					ar[ab]=mp;
					break;
				}
				
			
		}
		System.out.println("Swapped");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] +" ");
		}
		System.out.println();

	}

}
