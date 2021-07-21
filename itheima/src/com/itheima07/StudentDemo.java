package com.itheima07;

public class StudentDemo {
    public static void main(String[] args) {

        useStudentBuilder((s,i)->new Student(s,i));

        useStudentBuilder(Student::new);
    }
    private static void useStudentBuilder(StudentBuilder sb){
        Student s =sb.build("林青霞",30);
        System.out.println(s.getName()+","+s.getAge());
    }
}
