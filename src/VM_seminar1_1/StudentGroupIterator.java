package VM_seminar1_1;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<student> {

    private StudentGroup studentGroup;
    private int index=0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }



    @Override
    public boolean hasNext() {

        return index<studentGroup.students.size();
    }

    @Override
    public student next() {
        return studentGroup.students.get(index++);

    }
}
