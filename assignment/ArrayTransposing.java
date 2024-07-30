package assignment;

import java.util.Arrays;

public class ArrayTransposing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,8,4},{9,7,2},{7,6,4}};
		int result[][]=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				result[i][j]=arr[j][i];
			}
		}System.out.println(Arrays.deepToString(result));
		

	}

}
