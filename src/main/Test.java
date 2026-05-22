package main;

import java.util.Scanner;

import Service.StudentService;

public class Test {
	public static void main(String[] args) {
		// Scanner
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("***Welcome to the resultapplication***");
			System.out.println("Please select option of your choice");
			System.out.println("1: Get students details by name");
			System.out.println("2: Get all student details");
			System.out.println("3: Get Student details by id");

			System.out.println("Enter your option numbers only");
			int value = sc.nextInt();
			StudentService service = new StudentService();
          
			switch (value) {

			case 1: {
				System.out.println("Enter name of Student");
				String name = sc.next();
				// value 1 ->option 1:
				// option 1: get student Details by name
				service.getStudentDetails(name);
			
				break;
			}
			case 2: {
				// value 2 ->option 2:
				// option 2:get All student Details
				service.getAllStudentDetails();

				break;
			}
			case 3:{
				System.out.println("Enter id of student");
				int id =sc.nextInt();
				service.getStudentDetails(id);
				
				break;
			}
			default:
				System.err.println("Unexpected value: " + value);
			}

		}
	}
}
