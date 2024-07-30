package assignment;
// note:if there conflicity we have 2 minmum words means we need to use arraylist
public class min_word_array {
	static String arr[]= {"k","l","chaihanya","reddy","ad","chai"};
	static String minlen=arr[0];
	static int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j].length()<minlen.length()) {
				minlen=arr[j];
				 index=j;
			}
			
		}
		System.out.println("min lenght word="+minlen+"  inexdex="+index);
	}
}
