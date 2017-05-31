import java.util.*;
/**
 * 
 * The Search class contains methods
 * for locating and returning the student 
 * name called by the user
 * 
 * @author (RBagwell) 
 * @version (a version number or a date)
 */
public class Search extends Attendance
{
  public String getOpening()
    {
        return "Search student:";
    }
    public String getResponse(String statement)
     {
      String response = " "; 
       
      // Example of Students scanned in 
        Student s1 = new Student("John Doe", "Absent", 2);  
        Student s2 = new Student("Jane Doe", "Absent", 0);  
        Student s3 = new Student("John Smith", "Absent", 55);
        Student s4 = new Student("Jane Smith", "Absent", -1);
        Student s5 = new Student("James Johnson", "Absent", 1);
        Student s6 = new Student("Mary Johnson", "Absent", 40);
       
       
       
      //Creates the ArrayList classList
        ArrayList <Student> classList = new ArrayList <Student>();
        
      //Adds each student to the list
        classList.add(s1);
        classList.add(s2);
        classList.add(s3);
        classList.add(s4);
        classList.add(s5); 
        classList.add(s6); 
        
      
        Iterator itr = classList.iterator();  
       
      
     //Searches through ArrayList classList for name matching statment 
     for(Student j : classList){  
          Student x = (Student)itr.next();
             if (statement.equals(x.student)){
                response =  x.student + ", " + x.status + "  " + x.time; 
          }
         }
     return response;
  }
}
