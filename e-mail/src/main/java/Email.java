import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix= "company.com";
    private int mailboxCapacity=500;
    private String alternateEmail;
    private int defaultPasswordLenght=10;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password= randomPassword(defaultPasswordLenght);
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
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

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "Name: " +firstName+" "+lastName+" email "+ email+" capacity "+mailboxCapacity;
    }
}
