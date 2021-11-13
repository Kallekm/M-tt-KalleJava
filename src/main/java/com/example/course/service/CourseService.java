package com.example.course.service;
import dataclass.Course;
import dataclass.OnlineCourse;
import dataclass.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import interfaces.ICourseService;



@Service
public class CourseService implements ICourseService {

    private static Map<Long, Student> students = new HashMap<>();
    static{
        Student student1 = new Student(1L, "Kalle", "Määttä");
        Student student2 = new Student(2L, "Simo", "Seppola");
        Student student3 = new Student(3L, "Jere", "Setälä");
        Student student4 = new Student(4L, "Anni", "Kaukojärvi");
        Student student5 = new Student(5L, "Patrik", "Koskinen");
        students.put(1L, student1);
        students.put(2L,student2);
        students.put(3L,student3);
        students.put(4L,student4);
        students.put(5L,student5);
    }
    private static Map<Long, OnlineCourse> onlinecourses = new HashMap<>();
    static{
        OnlineCourse onlinecourse1 = new OnlineCourse(1L,"Java programming");
        OnlineCourse onlinecourse2 = new OnlineCourse(2L,"Math");
        OnlineCourse onlinecourse3 = new OnlineCourse(3L,"English");
        onlinecourses.put(1L,onlinecourse1);
        onlinecourses.put(2L,onlinecourse2);
        onlinecourses.put(3L,onlinecourse3);

    }
    private static Map<Long, Course> courses = new HashMap<>();
    static{
        Course course1 = new Course(1L,"Java programming", "Jaakko Vesimaa", "Kalle Vesimaa, Petteri Puhakka");
        Course course2 = new Course(2L,"Html/CSS", "Jussi Päätalo", "Pete Parkkonen, Juha Vierumaa");
        courses.put(1L,course1);
        courses.put(2L,course2);

    }

    @Override
    public List<Student> getStudents() {

        return new ArrayList<>(students.values());
    }

    @Override
    public List<Course> getCourses() {
      
        return new ArrayList<>(courses.values());
    }
    @Override
    public List<OnlineCourse> getOnlineCourses(){
        return new ArrayList<>(onlinecourses.values());
    }

    @Override
    public Student getStudentById(long studentId) {
      
        return students.get(studentId);
    }

    @Override
    public Course getCourseById(long courseId) {
        
        return courses.get(courseId);
    }

    @Override
    public List<Course> getCoursefOfStudents(long studentId) {
       
        return null;
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
       
        return false;
    }

    
}
