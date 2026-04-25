package main;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;


import entity.Student;
import helper.OutputHelper;
import repository.Studentrepository;

public class Test {
   public static void main(String[] args) {
	   //scanner class
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Student name");
	   String name = sc.next();
	   
	   //required object
	   Studentrepository repository = new Studentrepository();
	   OutputHelper helper = new OutputHelper();
	    
	   //switch case
	   switch (name) {
	case "Ram": {
		//get student object
		Student Ram = repository.getRamObject();
		// print student object
		helper.printStudentDetails(Ram);
		break;
	}
	case "Sham":{
		Student Sham = repository.getShamObject();
		helper.printStudentDetails(Sham);
		break;
	}
	case"Vithoba":{
		Student Vithoba = repository.getVithobaObject();
		helper.printStudentDetails(Vithoba);
		break;
	}
	case "Om":{
		Student Om = repository.getOmObject();
		helper.printStudentDetails(Om);
		break;
	}
	case "Atharv":{
		Student Atharv = repository.getAtharvObject();
		helper.printStudentDetails(Atharv);
		break;
	}
	case"Vinod":{
		Student Vinod = repository.getVinodObject();
		helper.printStudentDetails(Vinod);
		break;
	}
	case"Shiv":{
		Student Shiv = repository.getShivObject();
		helper.printStudentDetails(Shiv);
		break;
	}
	case "Rutu":{
		Student Rutu =repository.getRutuObject();
		helper.printStudentDetails(Rutu);
		break;
	}
	case"Pranav":{
		Student Pranav = repository.getPranavObject();
		helper.printStudentDetails(Pranav);
		break;
	}
	case "Ravi":{
		Student Ravi = repository.getRaviObject();
		helper.printStudentDetails(Ravi);
		break;
	}
	case "Rahul":{
		Student Rahul = repository.getRahulObject();
		helper.printStudentDetails(Rahul);
		break;
	}
	default:
		System.err.println("Please enter a proper name");
	}
	   
	 
}
}
