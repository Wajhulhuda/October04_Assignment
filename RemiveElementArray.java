package TestOct3;

public class RemiveElementArray {
	public static void main(String [] args) {
		
		int array[] = {1,2,4,5,7};
		int k=5;
		for(int i=0; i<array.length; i++) {
			if(array[i]==k) {
				for(int j=i; j<array.length-1; j++) {
					array[j]=array[j+1];
				}
				break;
			}
		}
		for(int i=0; i<array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
