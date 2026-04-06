import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();
        int choice;

        System.out.println("====== Student Grade Tracker ======");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. View Report");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    if (tracker.studentExists(name)) {
                        System.out.println("Student already exists.");
                    } else {
                        tracker.addStudent(new Student(name));
                        System.out.println("Student added!");
                    }
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    String sName = scanner.nextLine();
                    Student s = tracker.getStudent(sName);
                    if (s == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.print("Enter grade (0-100): ");
                        double grade = scanner.nextDouble();
                        if (grade < 0 || grade > 100) {
                            System.out.println("Invalid grade. Must be 0-100.");
                        } else {
                            s.addGrade(grade);
                            System.out.println("Grade added!");
                        }
                    }
                    break;

                case 3:
                    tracker.displayReport();
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}