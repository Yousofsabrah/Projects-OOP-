package oop.studentmanagementsystem;
//(Student Management System)
//الوصف:
//
//قم بإنشاء نظام لإدارة الطلاب يحتوي على فئات متعددة مثل Person و Student و Teacher و Course.
//الفئة Person تحتوي على معلومات عامة مثل الاسم، العمر، والعنوان.
//الفئة Student تحتوي على معلومات الطلاب مثل رقم الطالب، الدورات المسجل فيها.
//الفئة Teacher تحتوي على معلومات المدرسين مثل معرف المدرس، الدورات التي يدرسها.
//الفئة Course تحتوي على معلومات الدورة مثل معرف الدورة، اسم الدورة، والمدرس.
//المهام:
//
//الفئة Person تكون الفئة الرئيسية.
//الفئة Student ترث من الفئة Person.
//الفئة Teacher ترث من الفئة Person.
//الفئة Course تتعامل مع معلومات الدورة.
//المتطلبات:
//
//تسجيل طالب جديد.
//تعيين مدرس لدورة.
//تسجيل طالب في دورة.
//عرض قائمة الطلاب المسجلين في دورة معينة.
//(Student Management System)
//Description:
//
//Create a student management system that contains multiple classes such as Person, Student, Teacher, and Course.
//The Person class contains general information such as name, age, and address.
//The Student class contains student information such as student number,courses enrolled in.
//The Teacher class contains teacher information such as teacher ID, courses taught by the teacher.
//The Course class contains course information such as course ID, course name, and teacher.
//Tasks:
//
//The Person class is the main class.
//The Student class inherits from the Person class.
//The Teacher class inherits from the Person class.
//The Course class handles course information.
//Requirements:
//
//Register a new student.
//Assign a teacher to a course.
//Enroll a student in a course.
//View a list of students enrolled in a particular course.

public class StudentManagementSystem {

    public static void main(String[] args) {
        Student[] student = new Student[3];
        Teacher[] teacher = new Teacher[3];
        Course c1 = new Course("85633", "java", "Dua'a");

        //String studentId, String coursesEnrolledIn, String name, String address, int age
        student[0] = new Student("123456789", "java", "yousof", "qalqilya", 19);
        student[1] = new Student("123456721", "java", "sajed", "qalqilya", 19);
        student[2] = new Student("123456776", "java", "islam", "qalqilya", 19);

        teacher[0] = new Teacher("987654321", "java", "ahmad", "tulkarem", 20);
        if (c1.AddStudent(student[0])) {
            System.out.println("The student " + student[0].getName() + " has been added.");
        }
        System.out.println("========================");
        if (c1.AddTeacher(teacher[0])) {
            System.out.println("The teacher " + teacher[0].getName() + " has been added.");
        }
        System.out.println("========================");

        for (int i = 0; i < 3; i++) {
            if (c1.AddStudent(student[i])) {
                System.out.println(student[i].getName());
            }
        }
    }
}
