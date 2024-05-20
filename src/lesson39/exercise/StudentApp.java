package lesson39.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(5, "Smith", 20),
                new Student(12, "Jones", 22),
                new Student(40, "Bill", 21)
        };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("===============");
        Arrays.sort(students, new StudentAgeAscComparator());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println(Arrays.toString(students));
    }
}
