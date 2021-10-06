package TestOct3;

public class MergeTwoArrays {
	public static void main(String [] args) {
		int array1[] = {4,5,6,7,8};
		int array2[] = {1,2,3,4};
		
		int a1_length = array1.length;
		int a2_length = array2.length;
		int a3_length = a1_length + a2_length;
		int[] array3 = new int[a3_length];
		
		for(int i=0; i<a2_length; i++) {
			array3[i] = array2[i];
		}
		
		for(int i=0; i<a1_length; i++) {
			array3[a2_length+i] = array1[i];
		}
		
		
		for(int i=0; i<a3_length; i++) {
			System.out.print(array3[i]+" ");
		}
	}

}
