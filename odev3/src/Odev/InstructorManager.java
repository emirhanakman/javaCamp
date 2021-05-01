package Odev;

public class InstructorManager extends UserManager {

	public void addCourse(Instructor instructor) {
		for(String course : instructor.getCourses()) {
			System.out.println(course);
		}
		System.out.println("adlý kurslar eklendi.");
	}
	
}
