package assignment;
//note this program we need set concepts we need see after learning that
public class TwoArray_comman_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]={{1,2,1},{9,7,2},{7,6,4}};
		int arr2[][]={{2,6,8,6},{0,1,3,9,7},{7,2,0},{8,3}};
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2[j].length;j++) {
//				if(arr1[i][j] == arr2[i][j]) {
//					System.out.println(arr1[i][j]);
//				}
//			}
		 for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr1[i].length; j++) {
	                // Compare with each element in arr2
	                for (int k = 0; k < arr2.length; k++) {
	                    for (int l = 0; l < arr2[k].length; l++) {
	                        if (arr1[i][j] == arr2[k][l]) {
	                        	System.out.println(arr1[i][j]);
	                            
	                        }
	                    }
	                }
	            }
	        }
			
		}
		

	}


