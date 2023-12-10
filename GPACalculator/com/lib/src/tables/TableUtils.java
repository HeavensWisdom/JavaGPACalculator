// TableUtils.java
package tables;

import mainapp.Course;

public class TableUtils {
    public static void printTableHeader() {
        System.out.println(" ");
        System.out.println("THE TABLE BELOW SHOWS THE RESULT");
        System.out.println(" ");

        System.out.println("+-------------------------+-----------------------+-------+-----------------+");
        System.out.println("| COURSE & CODE           | COURSE UNIT           | GRADE | QUALITY-POINT   |");
        System.out.println("+-------------------------+-----------------------+-------+-----------------+");
    }

    public static void printTableRow(Course course) {
        System.out.printf("| %-23s | %-21d | %-5s | %-14d |\n",
                course.getCourseNameAndCode(), course.getCourseUnit(),
                course.getGrade(), course.getQualityPoint());
    }

    public static void printTableFooter(double gpa) {
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.printf("\nYour GPA is = %.2f / 5.00    (to 2 decimal places).\n", gpa);
        System.out.println(" ");
    }
}
