package VM_seminar1_1;
import java.util.Comparator;

public class StudentComparator implements Comparator<student> {
    @Override
    public int compare(student student, student student2) {
        return student.id - student2.id;
    }
}
