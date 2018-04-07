package lesson8z.hierarchy;

import java.util.Date;

public class Demo {
    Student createHighestParent() {
        Course[] coursesTaken = new Course[3];
        Student student = new Student("Max", "Kucherov", 1, coursesTaken);
        return student;
    }

    SpecialStudent createLowestChild() {
        Course[] coursesTaken = new Course[3];
        SpecialStudent specialStudent = new SpecialStudent("Max", "Kucherov", 1, coursesTaken, 1111, "maxkucherov1@gmail.com");
        return specialStudent;
    }
}
