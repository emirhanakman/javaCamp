package Odev;

public class StudentManager extends UserManager {

	public void registerCourse(Student student) {
		for(String course : student.getCourses()) {
			System.out.println(course);
		}
		System.out.println("adlı kurslara kayıt olundu.");
	}
	
}
