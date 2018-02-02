package main;

import java.util.ArrayList;
import java.util.Scanner;

import pkg1.Converter;
import pkg1.Student;
import pkg1.Writer;
import pkg2.CSVConverter;
import pkg2.PSVConverter;
import pkg2.TSVConverter;

public class Main {

	public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<>();
		
		studentList.add(new Student(1, "Tahmid", "A+"));
		studentList.add(new Student(2, "Jamil", "A"));
		studentList.add(new Student(3, "Tahlil", "A-"));
		
		System.out.println("1.CSV\n2.TSV\n3.PSV\nEnter your choice (1-3) : ");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		
		Converter c=null;
		
		switch (choice) {
		case 1:
			c=new CSVConverter();
			break;
		case 2:
			c=new TSVConverter();
			break;
		case 3:
			c=new PSVConverter();
			break;
		default:
			break;
		}
		//Converter c=new CSVConverter();
		//Converter c=new TSVConverter();
		//Converter c=new PSVConverter();
		
		Writer w=new Writer();
		w.WriteToFile(studentList, "student.txt", c);

	}

}
