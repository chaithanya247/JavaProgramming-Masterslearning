package loops;

public class Foreach_2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{2,3,4},{3,4,5}};	
		for(int arr2[]:arr) {
			for(int value:arr2) {
				System.out.print(value+" ");
		}
			System.out.println();

		}

	}
}
