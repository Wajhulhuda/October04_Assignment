package TestOct3;

import java.util.Scanner;

public class TwoRepeativeElementsXor {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of the array");
		int[] arr =new int[7];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int count =0;
		
		for(int i=0 ; i<arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if((arr[i]^arr[j])==0 && count<2) {
					System.out.print(arr[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		if(count ==0) {
			System.out.println("There is no repeative number ");
		}else if(count == 1) {
			System.out.println("There is only one repeative number ");
		}else {
			System.out.println("These are repetive numbers ");
		}
	
	}

}
