package repository;

import entity.Student;

public class Studentrepository {
	
	public static Student[] getAllStudent() {
		
		Student s = new Student();
		s.setId(101);
		s.setFirstname("Ram");
		s.setLastname("Patil");
		s.setMathobtained(95);
		s.setScienceobtained(78);
		s.setEnglishobtained(78);
		
		Student s1 = new Student();
		s1.setId(102);
		s1.setFirstname("Sham");
		s1.setLastname("Patil");
		s1.setMathobtained(79);
		s1.setScienceobtained(95);
		s1.setEnglishobtained(89);
		
		Student s2 = new Student();
		s2.setId(103);
		s2.setFirstname("Vithoba");
		s2.setLastname("Maharaj");
		s2.setMathobtained(97);
		s2.setScienceobtained(89); 
		s2.setEnglishobtained(68);
		
		Student s3 = new Student();
		s3.setId(104);
		s3.setFirstname("Om");
		s3.setLastname("Patil");
		s3.setMathobtained(96);
		s3.setScienceobtained(89);
		s3.setEnglishobtained(87);
		
		Student s4 = new Student();
		s4.setId(105);
		s4.setFirstname("Atharv");
		s4.setLastname("Patil");
		s4.setMathobtained(75);
		s4.setScienceobtained(59);
		s4.setEnglishobtained(70);
		
		Student s5 = new Student();
		s5.setId(106);
		s5.setFirstname("Vinod");
		s5.setLastname("Nikole");
		s5.setMathobtained(87);
		s5.setScienceobtained(90);
		s5.setEnglishobtained(78);
		
		
		Student s6 = new Student();
		s6.setId(107);
		s6.setFirstname("Shiva");
		s6.setLastname("Bunde");
		s6.setMathobtained(59);
		s6.setScienceobtained(89);
		s6.setEnglishobtained(69);
		
		Student s7 = new Student();
		s7.setId(108);
		s7.setFirstname("Rutu");
		s7.setLastname("Gawande");
		s7.setMathobtained(79);
		s7.setScienceobtained(87);
		s7.setEnglishobtained(89);
		
		Student s8 = new Student();
		s8.setId(109);
		s8.setFirstname("Pranav");
		s8.setLastname("Gawande");
		s8.setMathobtained(89);
		s8.setScienceobtained(79);
		s8.setEnglishobtained(90);
		
		Student s9 = new Student();
		s9.setId(110);
		s9.setFirstname("Ravi");
		s9.setLastname("Gawande");
		s9.setMathobtained(79);
		s9.setScienceobtained(93);
		s9.setEnglishobtained(84);
		
	
		Student[] studentArray = {s,s1,s2,s3,s4,s5,s6,s7,s8,s9,};
		return studentArray;
		
		
		
	}
	


}