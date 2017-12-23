import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("DEP : " +this.department);
        this.password= randomPassword(8);
        System.out.println(this.password);
    }


    private String setDepartment() {
        System.out.print("Enter the department\n1 for Sales\n2for Development\n3for Accounting\n0 for none");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice==1){return "Sales";
        }else if (depChoice==2){return "Development";
        }else if (depChoice==3){return "Accounting";}
        else {return "";}

    }

    private String randomPassword(int lenght){
        String passwordSet="ABCDEFGHIJKLMNOPRSTUWYXZ1234567890@!#$%";
        char [] password = new char[lenght];
        for(int i=0; i<lenght;i++){
            int rand =(int)(Math.random()*passwordSet.length());
            password [i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
