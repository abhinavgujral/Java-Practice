package practice;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class Student{
    int Id;
    String name;

    String locality;

    public Student(int id, String name, String locality) {
        Id = id;
        this.name = name;
        this.locality = locality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Id == student.Id && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", locality='" + locality + '\'' +
                '}';
    }
}
public class CompareObjects {
    public CompareObjects() {
    }

    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, "abhinav","ptk"));
        set.add(new Student(1, "abhinav","abc"));
        set.add(new Student(2, "abhinav","ptk"));
        System.out.println(set.toString());
    }



}
