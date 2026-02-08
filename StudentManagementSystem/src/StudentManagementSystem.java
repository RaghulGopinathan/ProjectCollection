import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(int id, String studentName, double marks){
        studentList.add(new Student(id,studentName,marks));
    }

    public void viewAllStudents(){
       System.out.println("\nStudent List: ");
       for(Student i: studentList)
       {
           printStudent(i);
       }
    }

    public void searchStudentById(int id){
        System.out.println("\nSearch Results: ");
        for (Student i: studentList)
        {
            if(i.getId()==id) {
                printStudent(i);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public void printStudent(Student i)
    {
        System.out.println("Id: "+i.getId()+"\nStudent name: "+i.getName()+"\nMarks: "+i.getMarks());
    }
}
