import java.util.Scanner;

public class InWindow {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the amount of students: ");

    int maxStudent = scan.nextInt();
    Student[] students = new Student[maxStudent];
    for(int x = 0;x < maxStudent;x++) {
        scan.nextLine();
        System.out.print("Enter the student's name: ");
        String name = scan.nextLine();
        System.out.print("Enter the student's grade: ");
        int grade = scan.nextInt();
        System.out.print("Enter the student's GPA: ");
        double gpa = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the name of the student's school: ");
        String school = scan.nextLine();
        System.out.print("Enter the graduating year of the student: ");
        int clazz = scan.nextInt();
        Student student = new Student(name,grade,gpa,school,clazz);
        students[x]=student;
    }






    }
}