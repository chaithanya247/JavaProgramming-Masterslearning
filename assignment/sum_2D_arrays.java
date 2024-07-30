package assignment;

public class sum_2D_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int arr[][]={{1,8,4},{9,7,2},{7,6,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				
			}
		}
		System.out.println(sum);
	}

}
