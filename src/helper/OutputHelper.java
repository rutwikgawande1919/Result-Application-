package helper;

import entity.Student;

public class OutputHelper {

	public static void printStudentDetails(Student s) {
		
		System.out.println("id :" + s.getId());
		System.out.println("name :" + s.getFirstname());
		System.out.println("Lastname :" + s.getLastname());
		System.out.println("math marks :" + s.getMathobtained());
		System.out.println("science marks :" + s.getScienceobtained());
		System.out.println("English marks :" + s.getEnglishobtained());
	    System.out.println("Standard :" +Student.standard);
	    System.out.println("=================================");
	}
}
