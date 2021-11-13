package interfaces;
import java.util.List;
import dataclass.Course;
import dataclass.OnlineCourse;
import dataclass.Student;

public interface ICourseService {
    
    List<Student>getStudents();

    List<Course>getCourses();

    List<OnlineCourse> getOnlineCourses();

    Student getStudentById(long studentId);

    Course getCourseById(long courseId);

    List<Course> getCoursefOfStudents(long studentId);

    boolean addStudentToCourse(long studentId, long courseId);

}
