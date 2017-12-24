import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private String courses;
    private int balance;
    private static int costOfCourse=600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName=in.nextLine();

        System.out.println("Enter student last name");
        this.lastName=in.nextLine();

        System.out.println("Enter student year 1-4");
        this.year=in.nextInt();

        setStudentID();

        System.out.println(firstName+" "+lastName+ " "+year+ " "+studentId);

    }
    private void setStudentID(){

        id++;
        this.studentId= year+""+id;
    }


}
