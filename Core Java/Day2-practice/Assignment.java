package com.dharshana;
import java.util.Scanner;

class Student {
    int RegNo;
    String StudentName;
    int[] arr = new int[5];
    Student(int RegNo, String StudentName) {
        this.RegNo = RegNo;
        this.StudentName = StudentName;
    }
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void displayGrade() {
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks = totalMarks+arr[i];
        }
        int average = totalMarks / 5;

        System.out.println("Student Name:" + StudentName);
        System.out.println("Registration Number:" + RegNo);
        System.out.println("Average Marks:" + average);
        if (average >= 90) {
            System.out.println("Grade:A");
        } else if (average >= 80) {
            System.out.println("Grade:B");
        } else if (average >= 70) {
            System.out.println("Grade:C");
        } else if (average >= 60) {
            System.out.println("Grade:D");
        } else {
            System.out.println("Grade:F");
        }
    }
}
public class Assignment {
    public static void main(String[] args) {
        Student student = new Student(101, "Dharshana");
        student.getMarks();
        student.displayGrade();
    }
}