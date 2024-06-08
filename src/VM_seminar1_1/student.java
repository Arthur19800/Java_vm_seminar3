package VM_seminar1_1;

public class student implements Comparable<student>{

    public String name;
    public final int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "{ nameStudent: " +name+
                ", IdStudent: " +id+ " }";
    }

    @Override
    public int compareTo(student student) {

        return student.id - this.id;
    }
}
