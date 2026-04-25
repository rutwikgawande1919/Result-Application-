package helper;

import entity.Student;

public class OutputHelper {

	public void printStudentDetails(Student s) {
		
		System.out.println("id :" + s.id);
		System.out.println("name :" + s.firstname);
		System.out.println("Lastname :" + s.lastname);
		System.out.println("English marks :" + s.englishobtained);
		System.out.println("math marks :" + s.mathobtained);
		System.out.println("science marks :" + s.scienceobtained);
	}
}
