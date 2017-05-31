import java.util.*;
/**
 * 
 * The Attendance class creates the classList
 * ArrayList with all the students scanned in 
 * and uses the Search class to locate and 
 * return the student with their corresponding
 * information as called by the user
 * 
 * @author (RBagwell) 
 * @version (22 May 2017)
 */
public class Attendance
{
     String student;
     String status;
     int time;

     /**
     * 
     * The Attendance method creates an ArrayList of students that were scanned in
     * and determines whether they were Present, Tardy, or Absent based on the int time 
     * value they were scanned in at after time 0 (when class begins)
     * 
     */
      public static void Attendance(String args[])
        {
      
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
            int i = 0;
    
          //Goes through the ArrayList classList to determine whether a student is Present, Absent or Tardy
          System.out.println("************"); 
          System.out.println("Class Attendance:"); 
          
          while(i < classList.size()){
                Student s = (Student)itr.next(); 
                 if (s.time <= 0){
                    s.status = "Present"; 
                }
                else if(s.time > 0 && s.time < 15){
                    s.status = "Tardy"; 
                }
                else{
                    s.status = "Absent"; 
                }
                System.out.println(i+1 + ")" + s.student + ", "+ s.status +" "+ s.time); 
                i++;       
                
          }
          System.out.println("************");
          
          //Find student via name and return the student's name, status and time 
            Search find = new Search();
            
            System.out.println (find.getOpening());
            Scanner in = new Scanner (System.in);
            String statement = in.nextLine();
          
          //Allows user to search for names until they 
          while (!statement.toLowerCase().equals("done"))
          {
              System.out.println (find.getResponse(statement));
              statement = in.nextLine();
          }
        }
}

