package mainapp;

import validation.ValidationUtils;
import tables.TableUtils;
import utils.GPAUtils;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();

        System.out.println("Hello there! GPA Calculator Here");
        System.out.println("Enter your courses and grades.");
        System.out.println("To finish, enter 'done' when prompted for the course code.");
        System.out.println("  ");
        System.out.print("Enter course code: ");

        String courseNameAndCode;
        while ((courseNameAndCode = ValidationUtils.validateInput(scanner, "[a-zA-Z\\s#\\.]+[\\w\\s!@#$%^&*()-_+=<>?.,:;\"'/]{0,3}", "Invalid input. Enter valid course name and code.")) != null) {
            System.out.print("Enter course unit: ");
            int courseUnit = Integer.parseInt(ValidationUtils.validateInput(scanner, "[1-5]", "Such input Invalid. Enter a valid course unit (between 1 to 5)."));

            System.out.print("Enter course score: ");
            int courseScore = Integer.parseInt(ValidationUtils.validateInput(scanner, "\\d{1,2}|100", "Such input Invalid. Enter a valid course score (between 1 to 100)."));

            System.out.println("  ");
            System.out.println("Enter Another course, if none enter 'done' to see the result");
            System.out.print("Enter course code: ");

            Course course = new Course(courseNameAndCode, courseUnit, courseScore);
            courses.add(course);
        }

        TableUtils.printTableHeader();
        double totalQualityPoint = 0;
        int totalCourseUnit = 0;

        for (Course course : courses) {
            course.calculateGrade();
            TableUtils.printTableRow(course);
            totalQualityPoint += course.getQualityPoint();
            totalCourseUnit += course.getCourseUnit();
        }

        double gpa = GPAUtils.calculateGPA(totalQualityPoint, totalCourseUnit);
        TableUtils.printTableFooter(gpa);

        scanner.close();
    }
}