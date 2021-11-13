package dataclass;

public class LocalCourse extends Course {
    private String classLocation;
    private int studentCount;

    public LocalCourse(){

    }

    public LocalCourse(String classLocation, int studentCount){
        this.classLocation = classLocation;
        this.studentCount = studentCount;
    }

    public String getLocation(){
        return classLocation;
    }
    public void setLocation(String classLocation){
        this.classLocation = classLocation;
    }

    public int getStudentCount(){
        return studentCount;
    }
    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }

}
