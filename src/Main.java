import java.util.*;
import java.lang.*;

class Student {
    String firstName;
    String lastName;
    String indexNo;

    public Student( String firstName, String lastName, String indexNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNo = indexNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(indexNo, student.indexNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, indexNo);
    }

    public String toString() {
        return firstName + " " + lastName + ", indexNo:" + indexNo;
    }
}

class Grades {
    Double computerScience;
    Double mathematics;
    Double science;
    Double programmingJava;
    Double programingC;

    public Grades(Double computerScience, Double mathematics, Double science, Double programmingJava, Double programingC) {
        this.computerScience = computerScience;
        this.mathematics = mathematics;
        this.science = science;
        this.programmingJava = programmingJava;
        this.programingC = programingC;
    }

    public Double getAverage() {
        return (computerScience + mathematics + science + programmingJava + programingC) / 5;
    }

    public String toString() {
        return getAverage().toString();
    }
}

 public class Main {
        public static void main(String[] args) {

            Student student1 = new Student("John", "Doe", "123456");
            Student student2 = new Student("Anna", "Smith", "654321");
            Student student3 = new Student("Patricia", "Jones", "987654");
            Student student4 = new Student("Robert", "Williams", "456789");

            Grades grades1 = new Grades(5.0, 4.5, 4.0, 5.0, 4.5);
            Grades grades2 = new Grades(4.5, 4.0, 3.5, 4.5, 4.0);
            Grades grades3 = new Grades(4.0, 3.5, 3.0, 4.0, 3.5);
            Grades grades4 = new Grades(3.5, 3.0, 2.5, 3.5, 3.0);

            HashMap<Student, Grades> students = new HashMap<>();

            students.put(student1, grades1);
            students.put(student2, grades2);
            students.put(student3, grades3);
            students.put(student4, grades4);

            for (Map.Entry<Student, Grades> entry : students.entrySet()) {
                System.out.println(entry.getKey() + " has average degrees of " + entry.getValue());
            }
        }
    }
