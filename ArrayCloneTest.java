package pk22;

public class ArrayCloneTest {

	public static void main(String[] args) {
		
		int[]arr1= {1,2,3,4,5};
		int[]arr2;
		
		
		arr2=arr1.clone();
		
		System.out.println("복사된arr2배열: ");
		for(int num : arr2) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		arr2[3]=0;
		System.out.println("변경 후 arr1배열: ");
		for(int num : arr1) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("변경 후 arr2배열: ");
		for(int num : arr2) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
