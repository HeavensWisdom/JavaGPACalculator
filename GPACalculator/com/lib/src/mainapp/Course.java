package mainapp;

public class Course {
    private final String courseNameAndCode;
    private final int courseUnit;
    private final int courseScore;
    private String grade;
    private int gradePoint;
    private int qualityPoint;

    public Course(String courseNameAndCode, int courseUnit, int courseScore) {
        this.courseNameAndCode = courseNameAndCode;
        this.courseUnit = courseUnit;
        this.courseScore = courseScore;
    }

    public String getCourseNameAndCode() {
        return courseNameAndCode;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public void calculateGrade() {
        if (courseScore >= 70) {
            grade = "A";
            gradePoint = 5;
        } else if (courseScore >= 60) {
            grade = "B";
            gradePoint = 4;
        } else if (courseScore >= 50) {
            grade = "C";
            gradePoint = 3;
        } else if (courseScore >= 45) {
            grade = "D";
            gradePoint = 2;
        } else if (courseScore >= 40) {
            grade = "E";
            gradePoint = 1;
        } else {
            grade = "F";
            gradePoint = 0;
        }

        qualityPoint = courseUnit * gradePoint;
    }

    public String getGrade() {
        return grade;
    }

    public int getGradePoint() {
        return gradePoint;
    }

    public int getQualityPoint() {
        return qualityPoint;
    }
}
