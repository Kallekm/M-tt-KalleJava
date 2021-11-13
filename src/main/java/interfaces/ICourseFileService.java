package interfaces;
import java.io.FileNotFoundException;
import java.util.List;
import dataclass.Course;
import dataclass.Student;


public interface ICourseFileService {
    
   List<Student> readStudentsFormFile(String studentFile) throws FileNotFoundException;

   List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException;
}
