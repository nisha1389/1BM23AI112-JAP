import java.util.Scanner;

class ExamScoreTracker {
    int marks;
    String Name;


    ExamScoreTracker(int M, String N) {
        this.marks = M;
        this.Name = N;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = 5;
        ExamScoreTracker obj[] = new ExamScoreTracker[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Name of student " + (i + 1) + ":");
            String name = scan.nextLine();

            System.out.println("Enter Marks of student " + (i + 1) + ":");
            int marks = scan.nextInt();


            scan.nextLine();


            obj[i] = new ExamScoreTracker(marks, name);


            System.out.println(obj[i].Name + " has scored a total of: " + obj[i].marks);
        }

        scan.close();
    }
}
