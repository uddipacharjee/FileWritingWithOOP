package pkg2;

import pkg1.Converter;
import pkg1.Student;

public class TSVConverter implements Converter {

	@Override
	public String convert(Student s) {
		String str;
		str=""+s.roll+"\t"+s.name+"\t"+s.grade+"\n";
		return str;
	}

}
