package arrays;

public class TwoDimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,5,8},{3,8,9}};
//		System.out.println(arr[0].length);
		int size=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				size+=1;
				
				
			}System.out.println();
			
			
			
		}
	System.out.println("size"+size);

		
		

	}

}
