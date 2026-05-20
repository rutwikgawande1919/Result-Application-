package Service;

import entity.Student;
import helper.OutputHelper;
import repository.Studentrepository;

public class StudentService {

	public void getStudentDetails(String name) {
		Student[] allstudents = Studentrepository.getAllStudent();
		for (int i = 0; i < allstudents.length; i++) {
			Student student = allstudents[i];

			if (student.getFirstname().equalsIgnoreCase(name)) {
				OutputHelper.printStudentDetails(student);
			}
		}
	}

	public void getAllStudentDetails() {

		Student[] allstudents = Studentrepository.getAllStudent();

		for (int i = 0; i < allstudents.length; i++) {
			Student student = allstudents[i];
			OutputHelper.printStudentDetails(student);
		}
	}

	public void getStudentDetails(int id) {
		Student[] allstudents = Studentrepository.getAllStudent();

		for (int i = 0; i < allstudents.length; i++) {
			Student student = allstudents[i];
			if (id == student.getId()) {
				OutputHelper.printStudentDetails(allstudents[i]);
			}

		}
	}
}