package pkg2;

import pkg1.Converter;
import pkg1.Student;

public class PSVConverter implements Converter {

	@Override
	public String convert(Student s) {
		String str;
		str=""+s.roll+"|"+s.name+"|"+s.grade+"\n";
		return str;
	}

}
