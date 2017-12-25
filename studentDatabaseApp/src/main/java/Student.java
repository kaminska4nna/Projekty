import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private String courses = null;
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
public void enroll(){
    do{System.out.println("Enter course to enroll(0 to quit)");
    Scanner in = new Scanner(System.in);
    String course = in.nextLine();
    if(!course.equals("Q")){
        courses=courses+"\n"+course;
        balance=balance+costOfCourse;

    }
    else {break;}

    }while (1!=0);
}


}
