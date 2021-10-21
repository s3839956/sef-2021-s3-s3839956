package model;


import model.Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *  Implement and test {@link Project#canAddTeamMember(Employee)} (Employee)} } that respects the following:
 *
 *  <ul>
 *
 *      <li>{@link Employee#getNumberOfProjects()} must return the correct number after the operation </li>
 *      <li>{@link Project#getTeam()} should return a number that is usable.</li>
 *      <li>Throws an {@link IllegalTeamMemberException} if an Employee is already part of team.</li>
 *      <li>A team can only have up to 6 team members, without duplicates.</li>
 *      <li>An {@Employee} should not be part of more than 3 teams.</li>
 *  </ul>
 *
 * NOTE: The {@link Project#canAddTeamMember(Employee)} verifies that the constraints to add a new member.
 *
 * Each test criteria must be in an independent test method and named as specified in the README.
 *
 * Initialize the test object with setUp method.
 */
public class ProjectTeamCanAddMemberTest {
	 @Test
     void TestNumOfProjects()
     {
             System.out.println("\n\nTest case 1 started ");
             try
             {
                     
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                     String dateStr = "2017-05-14";
                     Date dateObj = sdf.parse(dateStr);
                     
                     // Create Employee objects with sample data 
                     Employee employee=new Employee("John",dateObj);
                     
                     // Create Project objects and populate sample data
                     Project prj=new Project();
                     Project prj2=new Project();

                     prj.setName("Cloud Migration");
                     prj2.setName("OS Upgrade");

                     
                     // Call the employee.setNumberOfProjects() function which is to be tested
                     employee.setNumberOfProjects(2);

                     
                     // Verify the the result of above function call using assertEquals
                     Assertions.assertEquals( 2 , employee.getNumberOfProjects());
                    
                     
                     
                     
             }
             catch(Exception e)
             {
                     e.printStackTrace();
             }
             
             System.out.println("\n\nTest case 1 completed ");
     }
	 
	 @Test
	 void TestTeam()
	 {
		 System.out.println("\n\nTest case 2 started ");
         try
         {
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                 String dateStr = "2017-05-14";
                 Date dateObj = sdf.parse(dateStr);
                 
                 // Create Employee objects with sample data 
                 Employee employee=new Employee("John",dateObj);
                 Employee employee2=new Employee("Kate",dateObj);

                 
                 // Create Project objects and populate sample data
                 Project project=new Project();
                 Project project2=new Project();
                 
                 project.setName("Cloud Migration");
                 project2.setName("OS Upgrade");
                 
                 // Add Employee objects to Project teams
                 project.addTeamMember(employee);
                 project.addTeamMember(employee2);
                 
                 project2.addTeamMember(employee);
                 
                 // Get the List of Team of object project
                 List<Employee> team1=project.getTeam();
                 
                 // Verify object team1 contains employee 
                 Assertions.assertEquals( 1 , project.getTeam());
                
                 
                 
                 
         }
         catch(Exception e)
         {
                 e.printStackTrace();
         }
         
         System.out.println("\n\nTest case 2 completed ");
                 
                 
         
	 }
	 
	 @Test
     void TestException()
     {
             System.out.println("\n\nTest case 3 started ");
             try
             {
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                     String dateStr = "2017-05-14";
                     Date dateObj = sdf.parse(dateStr);
                     
                     // Create Employee objects with sample data 
                     Employee employee=new Employee("John",dateObj);
                     Employee employee2=new Employee("Kate",dateObj);

                     
                     // Create Project objects and populate sample data
                     Project project=new Project();
                     Project project2=new Project();
                     
                     project.setName("Cloud Migration");
                     project2.setName("OS Upgrade");
                     
                     // Add Employee objects to Project teams
                     project.addTeamMember(employee);
                     project.addTeamMember(employee2);
                     
                     project2.addTeamMember(employee);
                     
                     // Get the List of Team of object project
                     List<Employee> team1=project.getTeam();
                     
                     // Verify object team1 contains employee 
                     Assertions.assertEquals( true , team1.contains(employee));

                     
                     // If object team1 does not contain emp3 then throw IllegalTeamMemberException() as per requirement 
                     if(team1.contains(employee)==true)
                     {
                             System.out.println("\n\nProject Name : " + project.getName()+" contains Employee : "+employee.getName()+"So throwing below Exception :\n\n");
                             throw new IllegalTeamMemberException();
                                     
                     }
                     
                     
             }
             catch(Exception e)
             {
                     System.out.println("\n\nBelow is stack trace of Exception\n\n");
                     e.printStackTrace();
                     System.out.println("\n\nEnd of Exception");
             }
             
             System.out.println("\n\nTest case 3 completed ");
             
     }
	 
	 @Test
	 void TestNumOfEmployees()
	 {
		 System.out.println("\n\nTest case 4 started ");
         try
         {
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                 String dateStr = "2017-05-14";
                 Date dateObj = sdf.parse(dateStr);
                 
                 // Create Employee objects with sample data 
                 Employee employee=new Employee("John",dateObj);
                 Employee employee2=new Employee("Kate",dateObj);
                 Employee employee3=new Employee("Jake",dateObj);
                 Employee employee4=new Employee("Jack",dateObj);
                 Employee employee5=new Employee("Dan",dateObj);
                 Employee employee6=new Employee("Ben",dateObj);
                 Employee employee7=new Employee("Bart",dateObj);
                 
                 // Create Project objects and populate sample data
                 Project project=new Project();
 
                 
                 project.setName("Cloud Migration");

                 // Add Employee objects to Project teams
                 project.addTeamMember(employee);
                 project.addTeamMember(employee2);
                 project.addTeamMember(employee3);
                 project.addTeamMember(employee4);
                 project.addTeamMember(employee5);
                 project.addTeamMember(employee6);
                 project.addTeamMember(employee7);

                 
                 // Get the List of Team of object project
                 List<Employee> team1=project.getTeam();
                 
                 
                 Assertions.assertEquals( true , team1.contains(employee7));                                   
  
         }
         catch(Exception e)
         {
                 System.out.println("\n\nBelow is stack trace of Exception\n\n");
                 e.printStackTrace();
                 System.out.println("\n\nEnd of Exception");
         }
         
         System.out.println("\n\nTest case 4 completed ");
		 
	 }
	 
	 
	 //assuming that a team has only one project
	 @Test
     void TestNumOfTeams()
     {
             System.out.println("\n\nTest case 5 started ");
             try
             {
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                     String dateStr = "2017-05-14";
                     Date dateObj = sdf.parse(dateStr);
                     
                     // Create Employee objects with sample data 
                     Employee employee=new Employee("John",dateObj);

                     
                     // Create Project objects and populate sample data
                     Project project=new Project();
                     Project project2=new Project();
                     Project project3=new Project();
                     Project project4=new Project();
                     
                     project.setName("Cloud Migration");
                     project2.setName("OS Upgrade");
                     project3.setName("Database Management");
                     project4.setName("UI Upgrade");
                     
                     
                     
                  // Call the employee.setNumberOfProjects() function which is to be tested
                     employee.setNumberOfProjects(4);

                     
                     // Verify the the result of above function call using assertEquals
                     Assertions.assertEquals( 3 , employee.getNumberOfProjects());
                    
                     
                     
                     
             }
             catch(Exception e)
             {
                     e.printStackTrace();
             }
             
             System.out.println("\n\nTest case 5 completed ");
                     
                     
             
     }
	 
	 
     
     public static void main(String args[])
     {
             System.out.println("Testing the program");
     }
     
     
	
}