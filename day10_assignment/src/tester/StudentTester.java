package tester;

import java.util.Scanner;
import com.app.core.Student;
import com.app.core.Course;
import java.util.ArrayList;
import static com.app.core.Student.sdf;
import com.app.core.InvalidStudentException;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentsList = new ArrayList<>();
		
		boolean exitLoop = false;
		
			while(!exitLoop) {
				
				try {
				System.out.println("\n\n"
						+ "******Student information menu*******");
				System.out.println("\n1. Add student\n2. Fetch student information\n"
									+ "3. Display all students information\n"
									+ "4. Cancel student information\n"
									+ "5. Update GPA of any student\n"
									+ "6. Exit program\n\nEnter your choice : ");
				
				int choice = sc.nextInt();
				
				switch (choice) {
					case 1 :
						System.out.println("Enter sudent information (prn, name, email, password, gpa, dob(dd-mm-yyyy), course) :");
						Student newStudent = new Student(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()), Course.valueOf(sc.next().toUpperCase()));
						if(studentsList.contains(newStudent)) {
							throw new InvalidStudentException("Student already exists");
						}
						studentsList.add(newStudent);
						System.out.println("---->>> New student has been added....");
						 
						break;
						
					case 2:
						if(studentsList.isEmpty()) {
							System.out.println("Student list is empty");
							break;
						}
						
						System.out.println("Enter PRN of student to view his/her information : ");
						String prn1 = sc.next();
						Student tempStudent1 = new Student(prn1);
						if(studentsList.contains(tempStudent1)) {
							for(Student st : studentsList) {
								if(st.equals(tempStudent1)) {
									System.out.println("Student information : ");
									System.out.println(st);
								}
							}
						} else {
							throw new InvalidStudentException("Student not found");
						}
						 
						break;
					
					case 3: 
						if(studentsList.isEmpty()) {
							System.out.println("Student list is empty");
							break;
						}
						System.out.println("Information of all the students -->> ");
						for(Student st : studentsList) {
							System.out.println(st);
						}
						break;
						
					case 4:
						if(studentsList.isEmpty()) {
							System.out.println("Student list is empty");
							break;
						}
						
						System.out.println("Enter PRN of student to cancel his/her admission : ");
						String prn2 = sc.next();
						
						Student tempStudent2 = new Student(prn2);
						
						if(studentsList.contains(tempStudent2)) {
							int index = studentsList.indexOf(tempStudent2);
							studentsList.remove(index);
						} else {
							throw new InvalidStudentException("Student not found");
						}
						 
						break;
						
					case 5:
						if(studentsList.isEmpty()) {
							System.out.println("Student list is empty");
							break;
						}
						
						System.out.println("Enter PRN of student to update his/her GPA : ");
						String prn3 = sc.next();
						
						Student tempStudent3 = new Student(prn3);
						if(studentsList.contains(tempStudent3)) {
							System.out.println("Enter new GPA : ");
							for(Student st : studentsList) {
								if(st.equals(tempStudent3)) {
									st.setGPA(sc.nextDouble());
									System.out.println("Updated information : " + st);
								}
							}
						} else {
							throw new InvalidStudentException("Student not found");
						}
						 
						break;
						
					case 6:
						exitLoop = true;
						System.out.println("Exiting program...");
						break;
						
					default:
						System.out.println("Invalid input");
				}
					
				} catch(Exception e) {
					e.getStackTrace();
				}
				sc.nextLine();
			}
			sc.close();
	}

}
