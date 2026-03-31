package inheritance;

class Course {
    String courseNameVar;
    int courseDurationWeeksVar;

    Course(String givenCourseName, int givenDurationWeeks) {
        courseNameVar = givenCourseName;
        courseDurationWeeksVar = givenDurationWeeks;
    }
}

class OnlineCourse extends Course {
    String coursePlatformVar;
    boolean courseIsRecordedVar;

    OnlineCourse(String givenCourseName, int givenDurationWeeks,
                 String givenPlatform, boolean givenIsRecorded) {

        super(givenCourseName, givenDurationWeeks);
        coursePlatformVar = givenPlatform;
        courseIsRecordedVar = givenIsRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double courseFeeVar;
    double courseDiscountVar;

    PaidOnlineCourse(String givenCourseName, int givenDurationWeeks,
                     String givenPlatform, boolean givenIsRecorded,
                     double givenFee, double givenDiscount) {

        super(givenCourseName, givenDurationWeeks, givenPlatform, givenIsRecorded);
        courseFeeVar = givenFee;
        courseDiscountVar = givenDiscount;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseNameVar);
        System.out.println("Duration (weeks): " + courseDurationWeeksVar);
        System.out.println("Platform: " + coursePlatformVar);
        System.out.println("Recorded: " + courseIsRecordedVar);
        System.out.println("Course Fee: " + courseFeeVar);
        System.out.println("Discount: " + courseDiscountVar);
    }
}

public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse objPaidCourse =
                new PaidOnlineCourse("Java Masterclass", 8, "Udemy", true, 4999.0, 25.0);

        objPaidCourse.displayCourseDetails();
    }
}
