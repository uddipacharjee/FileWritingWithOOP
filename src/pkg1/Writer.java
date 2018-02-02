package pkg1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

public class Writer {
	private Formatter out;
	String path;
	
	public void WriteToFile(ArrayList<Student>studentList,String path,Converter c) {
		this.path=path;
		openFile();
		
		for (Student student : studentList) {
			String str=c.convert(student);
			out.format(str);
			
		}
		closeFile();
		
	}
	private void openFile() {
		try {
			out=new Formatter(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void closeFile() {
		if(out!=null) {
			out.close();
		}
	}
	
}
