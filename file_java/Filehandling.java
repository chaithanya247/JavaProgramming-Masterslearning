package file_java;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;


public class Filehandling {

	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		//paths are 2 types->abslute path and releative path
//		//seperators \\ or/
//		//File f=new File("C:\\Users\\saiha\\OneDrive\\Desktop\\JAVA CORE\\javaFilehanding\\resume.txt");
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getName());
//		System.out.println(f.getParent()+"resume.2");
//		File f=new File("./demo_mkdir/hero.txt");
//		//mkdir->used to create single folders
//		//mkdirs->used to create multiple folders at single time
//		f.mkdirs();
//
//		System.out.println(f.createNewFile());
//		//System.out.println(f.delete());
//		System.out.println(f.exists());
//		System.out.println(f.isHidden());
//		System.out.println(f.canWrite());
//		f.setWritable(true);
//		System.out.println(f.canWrite());
		
		File f=new File("./src");
		System.out.println(Arrays.toString(f.list()));
		//or
		for(String l:f.list()) {
			System.out.println(l);
		}
	
		System.out.println(new Date(f.lastModified()));
		




		
		

	}

}
