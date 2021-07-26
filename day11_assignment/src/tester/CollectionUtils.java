package tester;

import com.app.core.Student;
import com.app.core.Course;
import com.app.core.InvalidStudentException;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import static com.app.core.Student.sdf;

public class CollectionUtils {
	public static int validatePRN(ArrayList<Student> arr, int prn) throws InvalidStudentException {
		if(arr.contains(new Student(prn))) {
			throw new InvalidStudentException("PRN already taken");
		}
		return prn;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean exitLoop = false;
		ArrayList<Student> studentsList = new ArrayList<>();
		
		while(!exitLoop) {
			try {
				System.out.println("------Student information menu------");
				System.out.println("1. Add student\n"
									+ "2. View all students by course and D.O.B before a specific date\n"
									+ "3. Sort students by PRN(ascending order)\n"
									+ "4. Sort students by GPA(descending order)\n"
									+ "5. Sort student details as per course & GPA\n"
									+ "6. Remove details of failed students\n"
									+ "7. Display students detail in reverse order\n"
									+ "8. Exit program\n\n"
									+ "Enter your choice : ");
				
				int choice = sc.nextInt();
				
				switch (choice) {
					case 1: 
						System.out.println("Enter student details(prn, name, email, password, gpa, dob(dd-mm-yyyy), course)");
						Student st = new Student(CollectionUtils.validatePRN(studentsList, sc.nextInt()), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()), Course.valueOf(sc.next().toUpperCase()));
						studentsList.add(st);
						System.out.println("NEW STUDENT ADDED : ");
						System.out.println(st);
						break;
					
					case 2:
						if(studentsList.size() == 0) {
							System.out.println("Empty students list");
							break;
						}
						System.out.println("Enter course and a date : ");
						Course course = Course.valueOf(sc.next().toUpperCase());
						Date dt = sdf.parse(sc.next());
						System.out.println("All students of " + course + " : ");
						for(Student temp : studentsList) {
							if(temp.getCr().equals(course)) {
								if(dt.after(temp.getDob())) {
									System.out.println(temp);
								}
							}
						}
						break;
						
					case 3:
						if(studentsList.size() == 0) {
							System.out.println("Empty students list");
							break;
						}
						
						Collections.sort(studentsList);
						System.out.println("Students information in asceding order of PRN : ");
						for(Student temp : studentsList) {
							System.out.println(temp);
						}
						break;
						
					case 4:
						if(studentsList.size() == 0) {
							System.out.println("Empty students list");
							break;
						}
						
						Collections.sort(studentsList, new Comparator<Student>() {
							@Override
							public int compare(Student anotherStudent1, Student anotherStudent2) {
								int val = Double.valueOf(anotherStudent1.getGpa()).compareTo(Double.valueOf(anotherStudent2.getGpa()));
								System.out.println("val = " + val);
								return ((val == 0) ? 0 : 0-val);
							}
						});
						
						System.out.println("Students information in order of decreasing GPA : ");
						for(Student temp : studentsList) {
							System.out.println(temp);
						}
						break;
						
					case 5:
						if(studentsList.size() == 0) {
							System.out.println("Empty students list");
							break;
						}
						
						Collections.sort(studentsList, new Comparator<Student>() {
							@Override
							public int compare(Student anotherStudent1, Student anotherStudent2) {
								//System.out.println(anotherStudent1 + "\n" + anotherStudent2);
								int val1 = anotherStudent1.getCr().name().compareTo(anotherStudent2.getCr().name());
								System.out.println(val1);
								if(val1 == 0) {
									if(anotherStudent1.getGpa() < anotherStudent2.getGpa()) {
										return 1;
									} else if(anotherStudent1.getGpa() == anotherStudent2.getGpa()) {
										return 0;
									}
									return -1;
								}
								
								return val1;
							}
						});
						
						System.out.println("Student details as per course & GPA : ");
						for(Student temp : studentsList) {
							System.out.println(temp);
						}
						break;
						
					case 6:
						if(studentsList.size() == 0) {
							System.out.println("Empty students list");
							break;
						}
						
						System.out.println("Removing details of the failed students : ");
						studentsList.removeIf(s -> (s.getGpa() < 5.0));
						System.out.println("OUTPUT : ");
						for(Student temp : studentsList) {
							System.out.println(temp);
						}
						break;
						
					case 7:
						if(studentsList.size() == 0) {
							System.out.println("Empty students list");
							break;
						}
						System.out.println("Students list in reverse order : ");
						int size = studentsList.size();
						
						for(int i=size-1; i>=0; i--) {
							System.out.println(studentsList.get(i));
						}
						break;
						
					case 8:
						exitLoop = true;
						System.out.println("Exiting Program...");
						break;
					
					default:
						System.out.println("Invalid input");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			sc.nextLine();
		}
		sc.close();
	}
}
