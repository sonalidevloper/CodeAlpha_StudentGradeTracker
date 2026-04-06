import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayReport() {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }
        System.out.println("\n========== STUDENT GRADE REPORT ==========");
        System.out.printf("%-15s %-10s %-10s %-10s %-5s%n",
                "Name", "Average", "Highest", "Lowest", "Grade");
        System.out.println("------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-5s%n",
                    s.getName(), s.getAverage(),
                    s.getHighest(), s.getLowest(), s.getLetterGrade());
        }
        System.out.println("==========================================");
    }

    public boolean studentExists(String name) {
        for (Student s : students)
            if (s.getName().equalsIgnoreCase(name)) return true;
        return false;
    }

    public Student getStudent(String name) {
        for (Student s : students)
            if (s.getName().equalsIgnoreCase(name)) return s;
        return null;
    }
}