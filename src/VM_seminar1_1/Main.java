package VM_seminar1_1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int id_Stream = 1;
        StreamServes streamServes = new StreamServes("StreamServes");
        for (int k=0; k<rand.nextInt(3,6);k++) {
            StringBuilder nameStream = new StringBuilder("Stream_" + id_Stream);
            Stream stream = new Stream(nameStream.toString(),rand.nextInt(100));
            int id_Group=1;
            for (int j = 0; j < rand.nextInt(3, 9); j++) {
                StringBuilder nameGroup = new StringBuilder("Group_" + id_Group);
                StudentGroup studentGroup = new StudentGroup(nameGroup.toString(), rand.nextInt(100));
                int id_Student=1;
                for (int i = 0; i < rand.nextInt(3, 6); i++) {
                    StringBuilder nameStudent = new StringBuilder("Student_" + id_Student);
                    student student = new student(nameStudent.toString(), rand.nextInt(100));
                    studentGroup.addStudent(student);
                    id_Student++;
                }
                id_Group++;
                stream.addStudentGroup(studentGroup);
            }
            id_Stream++;
            streamServes.addStream(stream);
        }

        System.out.println(streamServes);

        System.out.println("Потоки до сортировки");

        for (var s: streamServes.getStreams()) {
            if (s.stream_.size()==3 || s.stream_.size()==4){
                System.out.println("В Steam: "+s.getName()+" содержится: "+ s.stream_.size()+ " группы");
            }else {
                System.out.println("В Steam: " + s.getName() + " содержится: " + s.stream_.size() + " групп");
            }
        }

        System.out.println("========================================================================================");

        Collections.sort(streamServes.getStreams(), new StreamComparator()); // Сортируем порки по количеству групп в них

        System.out.println("Потоки после сортировки");

        for (var s: streamServes.getStreams()) {
            if (s.stream_.size()==3 || s.stream_.size()==4){
                System.out.println("В Steam: "+s.getName()+" содержится: "+ s.stream_.size()+ " группы");
            }else {
                System.out.println("В Steam: " + s.getName() + " содержится: " + s.stream_.size() + " групп");

            }
        }

    }
}
