package past18.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import past18.entities.Instructor;
import past18.entities.Student;

public class Program {
    public static void main(String[] args) {

        Set<Student> courseA = leitura('A');
        Set<Student> courseB = leitura('B');
        Set<Student> courseC = leitura('C');

        System.out.println(Instructor.studentsCount(courseA, courseB, courseC));
    }

    public static Set<Student> leitura(char course) {

        Scanner sc = new Scanner(System.in);
        Set<Student> conjunto = new HashSet<>();

        System.out.print("How many students for course " + course + "?");
        int studentsNumber = sc.nextInt();

        for (int i = 0; i < studentsNumber; i++) {

            System.out.print("Enter student ID: ");
            int studentId = sc.nextInt();
            Student student = new Student(studentId);
            conjunto.add(student);
        }

        return conjunto;
    }

}
