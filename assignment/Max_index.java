package assignment;

public class Max_index {
	static int max=0;
	static int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= {1,33,4,9};
		
		for(int n=0;n<i.length;n++) {
			if(i[n]>max) {
				max=i[n];
				index=n;
			}
			
			
		}
		System.out.println(max);
		System.out.println(index);
	}

}
