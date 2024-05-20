package lesson39.exercise;

import java.util.Comparator;

public class StudentAgeAscComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getAge(), s1.getAge());
    }
}
