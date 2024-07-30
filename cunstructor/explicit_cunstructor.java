package cunstructor;

import static_nonstatic.Static_intro;

public class explicit_cunstructor {
	int i ;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		explicit_cunstructor ep=new explicit_cunstructor(90);
		//System.out.println(ep.i);
		

	}
	//access modifer used for the custructor ->public,private,protected
	public explicit_cunstructor() {
		i=20;
		System.out.println(i);

	}
	public explicit_cunstructor(int i) {
		this.i=i;
		System.out.println(i);

	}

	

}
