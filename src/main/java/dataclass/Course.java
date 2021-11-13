package dataclass;

public class Course {
    public Long id;
    public String courseName;
    public String teacher;
    public String studentList;

    public Course(){

    }

    public Course(Long id,String courseName, String teacher, String studentList)
    {
        this.id = id;
        this.courseName = courseName;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public long getId(){
        return id;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getTeacher(){
        return teacher;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public String getStudentList(){
        return studentList;
    }
    public void setStudentList(String studentList){
        this.studentList = studentList;
    }
    @Override
    public String toString(){
        return "Course,OnlineCourse{" +
        ", id='" + id + '\'' +
        ", courseName=' " + courseName + '\'' +
        ", teacher=' " + teacher + '\'' +
        ", studentlist=' " + studentList + '\'' +
        '}';
    }

}


