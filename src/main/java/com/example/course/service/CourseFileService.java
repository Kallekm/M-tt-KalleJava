package com.example.course.service;
import java.io.File;
import interfaces.ICourseFileService;
import java.io.FileNotFoundException;
import java.util.List;
import org.springframework.stereotype.Service;

import dataclass.Course;
import dataclass.Student;
import java.util.Scanner;

@Service
public class CourseFileService implements ICourseFileService {

    @Override
    public List<Student> readStudentsFormFile(String studentFile) throws FileNotFoundException {
        File file = new File ("/courseService/students");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            studentFile = scan.nextLine();
            System.out.println(studentFile);
        }
        scan.close();
        return readStudentsFormFile(studentFile);
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        File file = new File ("/courseService/students");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            filePath = scan.nextLine();
            System.out.println(filePath);
        }
        scan.close();
        return readCoursesFromFile(filePath);
    }
    
}
