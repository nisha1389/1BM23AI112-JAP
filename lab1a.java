  import java.util.Scanner;

public class GymAdmin {
    String name;
    int age;
    String status;
    int duration;
    int fee;

    int calculate(int duration) {
        int pdfee = 100;
        return duration * pdfee;
    }

    void display(GymAdmin member){
        System.out.println("Member Details:\n");
        System.out.println("Name: " + member.name);
        System.out.println("Age: " + member.age);
        System.out.println("Membership Status: " + member.status);
        System.out.println("Duration: "+ member.duration + " Months");
        System.out.println("Fees: $" + member.fee + "\n");
    }

    public static void main(String[] args) {
        GymAdmin[] members  = new GymAdmin[10];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<2; i++){
            members[i] = new GymAdmin();

            System.out.println("Enter your Name: ");
            members[i].name = scanner.next();

            System.out.println("Enter your Age: ");
            members[i].age = scanner.nextInt();

            System.out.println("Enter your Membership Status(Active/Inactive):");
            members[i].status = scanner.next();

            System.out.println("Enter your Desired duration for Membership(In Months): ");
            members[i].duration = scanner.nextInt();

            members[i].fee = members[i].calculate(members[i].duration);

            members[i].display(members[i]);

        }


    }
}
