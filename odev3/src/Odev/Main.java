package Odev;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		Instructor instructor = new Instructor();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		String[] courses = {"Php", "C#", "Java"};
		
		student.setId(1);
		student.setFirstName("First Name");
		student.setLastName("Last Name");
		student.setGrade("Üniversite");
		student.setSchool("Üniversite");
		student.setEmail("mail@mail.com");
		student.setPassword("password");
		student.setCourses(courses);
		
		instructor.setId(1);
		instructor.setFirstName("FirstName");
		instructor.setLastName("LastName");
		instructor.setEmail("mail@mail.com");
		instructor.setPassword("password");
		instructor.setCourses(courses);
		
		
		studentManager.add(student);
		
		instructorManager.addCourse(instructor);
	}

}
