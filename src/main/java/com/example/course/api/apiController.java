package com.example.course.api;
import dataclass.Course;
import dataclass.OnlineCourse;
import dataclass.Student;
import java.util.List;

import com.example.course.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(path ="api/student")

public class apiController {

    private final CourseService courseService;

    @Autowired
    public apiController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/students")
	public List<Student> getStudents() {
		return courseService.getStudents();
	}

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("/onlinecourses")
    public List<OnlineCourse> getOnlineCourses(){
        return courseService.getOnlineCourses();
    }
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return courseService.getStudentById(studentId);
    }
    @GetMapping("/courses/{courseId}")
    public Course getCoursesById(@PathVariable Long courseId){
        return courseService.getCourseById(courseId);
    }
    

}
