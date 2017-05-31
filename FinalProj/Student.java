/**
 * 
 * The Student class creates 
 * new students with their name,
 * attendace status, and time they
 * came into class relative to the
 * start time (when time = 0); 
 * 
 * @author (RBagwell) 
 * @version (22 May 2017)
 */
public class Student
{
    
    String student;
    String status;
    int time; 
    
    public String sName;
    public String sStatus;
    public int sTime; 
    
    //To create a new student 
    public Student(String student, String status, int time){
        this.student = student;
        this.status = status; 
        this.time = time; 
    }
    
    public void setName(String studentName)
    {
        sName = studentName;
    } 
    public void setStatus(String studentStatus)
    {
        sStatus = studentStatus;
    } 
    public void setTime(int studentTime)
    {
        sTime = studentTime;
    }
    public String getName()
    {
        return sName;
    }
    public String getStatus()
    {
        return sStatus; 
    }
    public int getTime()
    {
        return sTime;
    }
}
