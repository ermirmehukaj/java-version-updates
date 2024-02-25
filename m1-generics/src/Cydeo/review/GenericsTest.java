package Cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

       studentList.add(new Student("Mike",101));
       studentList.add(new Student("Joe",102));
       studentList.add(new Student("Adam",103));


        List<Teacher> teacherList = new ArrayList<>();
       teacherList.add(new Teacher("ALbus",210));
        teacherList.add(new Teacher("Severus",202));

printInfo(studentList);
printInfo(teacherList);

    }
    public static <T extends Person> void printInfo(List<T> students){
        for (T student : students) {
            System.out.println(student);
        }
    }
}
