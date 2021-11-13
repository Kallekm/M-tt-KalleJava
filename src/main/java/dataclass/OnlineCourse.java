package dataclass;

public class OnlineCourse extends Course {
    private String webAddress;
    
    

    public OnlineCourse()
    {

    }

    public OnlineCourse(Long id, String courseName)
    {
        this.id = id;
        this.courseName = courseName;
    }


    public String getWebAddress(){
        return webAddress;
    }

    public void setWebAddress(String webAddress){
        this.webAddress = webAddress;
    }

    @Override
    public String toString(){
        return "OnlineCourse{" +
        ", id='" + id + '\'' +
        ", courseName=' " + courseName +
        '}';
    }
    
}
