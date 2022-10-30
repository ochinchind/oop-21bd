package fourth;

import java.util.Vector;
import java.util.Collections;

public class GradeBook {
	Student student;
	static int id;
	static String name;
	static Course course;
	static double grades;
	static Vector<Student> students = new Vector<Student>();
	static Vector<Course> courses = new Vector<Course>();
	static Vector<Integer> grades1 = new Vector<Integer>();
	
	public static void addvec(Student student) {
		students.add(student);
	}
	public static void addcou(Course course) {
		courses.add(course);
	}
	
	public GradeBook() {
		
	}
	public GradeBook(int grades) {
		grades1.add(grades);
	}
	
	public static double DetermineClassAverage() {
		for (int i=0; i < students.size(); i++) {
			grades += grades1.get(i);
		}
		grades = grades / students.size();
		return grades;
	}
	public static double DetermineClassMinimum() {
		grades = Collections.min(grades1);
		return grades;
	}
	public static double DetermineClassMaximum() {
		grades = Collections.max(grades1);
		return grades;
	}
	public static int DetermineIdMinimum(double d) {
		for(int i = 0; i<grades1.size(); i++) {
			if (grades1.get(i) == d) {
				return students.get(i).getId();
			}
		}
		return id;
	}
	public static String DetermineStudentMinimum(double d) {
		for(int i = 0; i<grades1.size(); i++) {
			if (grades1.get(i) == d) {
				return students.get(i).name;
			}
		}
		return name;
	}
	
	public static String GradeDistribution() {
		return "Grade Distribution: \n"+" 0-9:"+GradeBook.OutputBarChart(0,10)+"\n 10-19:"+GradeBook.OutputBarChart(10,20)+"\n 20-29:"+GradeBook.OutputBarChart(20,30)+"\n 30-39:"+GradeBook.OutputBarChart(30,40)+"\n 40-49:"+GradeBook.OutputBarChart(40,50)+"\n 50-59:"+GradeBook.OutputBarChart(50,60)+"\n 60-69:"+GradeBook.OutputBarChart(60,70)+"\n 70-79:"+GradeBook.OutputBarChart(70,80)+"\n 80-89:"+GradeBook.OutputBarChart(80,90)+"\n 90-99:"+GradeBook.OutputBarChart(90,100)+"\n 100:"+GradeBook.OutputBarChart(100,101);
	}
	public static String OutputBarChart(int a, int b) {
		for(int i = 0; i<grades1.size(); i++) {
			if (grades1.get(i) >= a & grades1.get(i) < b) {
				return "*";
			}
		}
		return "";
	}
	
	
	public static String DisplayGradeReport() {
		return "Class average is " + GradeBook.DetermineClassAverage()+ ". Lowest grade is "+ GradeBook.DetermineClassMinimum()+" ("+GradeBook.DetermineStudentMinimum(GradeBook.DetermineClassMinimum()) + ", id: " + GradeBook.DetermineIdMinimum(GradeBook.DetermineClassMinimum()) + "). Highest grade is " + GradeBook.DetermineClassMaximum()+" (" + GradeBook.DetermineStudentMinimum(GradeBook.DetermineClassMaximum())+", id: " + GradeBook.DetermineIdMinimum(GradeBook.DetermineClassMaximum()) + "). \n"+GradeBook.GradeDistribution();
	}
	
	public static String displayMessage() {
		return "Welcome to the grade book for " + courses.get(0).name +"!";
	}
}
