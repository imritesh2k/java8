package lamdaExpression;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		
		/*FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};*/
		
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("C:/Study/Java8/tempDir");
		//File[] files = dir.listFiles(fileFilter);
		File[] files = dir.listFiles(filterLambda);
		for(File f : files)
			System.out.println(f);

	}

}
