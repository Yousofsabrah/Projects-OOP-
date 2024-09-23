package oop.systemmanagingschool;
//تخيل أنك مكلف بتصميم نظام لإدارة مدرسة. يجب أن يكون النظام قادرًا على التعامل مع أنواع مختلفة من الأشخاص في المدرسة، مثل المعلمين والطلاب والمسؤولين. يجب أن يتضمن النظام الفئات التالية:
//
//الشخص:
//
//تمثل هذه الفئة شخصًا عامًا وتحتوي على السمات الأساسية المشتركة بين جميع الأشخاص في المدرسة، مثل الاسم والعمر والعنوان.
//يجب أن تتضمن طرقًا للحصول على هذه السمات وتعيينها (Getters وSetters).
//تتضمن طريقة مجردة role() لتحديد دور الشخص (المعلم أو الطالب أو المسؤول)، والتي سيتم تنفيذها في الفئات الفرعية.
//المعلم:
//
//ترث من الشخص وتضيف سمات إضافية مثل المادة التي يدرسها وعدد سنوات الخبرة.
//يجب أن تتضمن طريقة teach() التي تطبع رسالة تشير إلى أن المعلم يدرس المادة.
//الطالب:
//
//ترث من الشخص وتضيف سمات إضافية مثل الصف الذي يدرس فيه ومعرف الطالب الخاص به.
//يجب أن تتضمن طريقة study() التي تطبع رسالة تشير إلى أن الطالب يدرس.
//المسؤول:
//
//يرث من الشخص ويضيف سمات إضافية مثل المنصب الإداري وعدد سنوات الخبرة.
//يجب أن يتضمن طريقة manage() التي تطبع رسالة تشير إلى أن المسؤول يدير المدرسة.
//المتطلبات:
//
//قم بتطبيق مفهوم الميراث لإنشاء الفئات المذكورة أعلاه.
//استخدم التغليف لحماية السمات داخل كل فئة.
//قم بتنفيذ تعدد الأشكال باستخدام فئة الشخص للإشارة إلى فئات فرعية مختلفة (المعلم والطالب والمسؤول) وقم بتنفيذ طريقة role() بشكل مختلف في كل فئة فرعية.
//استخدم التجريد في فئة الشخص عن طريق جعلها فئة مجردة بطريقة role() مجردة.
//اكتب كود Java الذي يلبي المتطلبات المذكورة أعلاه. يجب أن يتضمن الكود اختبارًا عمليًا لكل فئة وطرقها في الفئة الرئيسية.

//Imagine you are tasked with designing a system for managing a school. The system should be capable of handling 
//different types of people in the school, such as teachers, students,
//and administrators. The system should include the following classes:
//
//Person:
//
//This class represents a general person and contains the basic attributes common to all people in the school,
//such as name, age, and address.
//It should include methods for getting and setting these attributes (Getters and Setters).
//It includes an abstract method role() to define the role of the person (Teacher, Student, or Administrator),
//which will be implemented in the subclasses.
//Teacher:
//
//Inherits from Person and adds additional attributes such as the subject they teach and the number of years of experience.
//It should include a teach() method that prints a message indicating the teacher is teaching the subject.
//Student:
//
//Inherits from Person and adds additional attributes such as the grade they are in and their student ID.
//It should include a study() method that prints a message indicating the student is studying.
//Administrator:
//
//Inherits from Person and adds additional attributes such as the administrative position 
//and the number of years of experience.
//It should include a manage() method that prints a message indicating the administrator is managing the school.
//Requirements:
//
//Apply the concept of inheritance to create the above classes.
//Use encapsulation to protect the attributes within each class.
//Implement polymorphism by using the Person class to refer to different subclasses 
//(Teacher, Student, Administrator) and implement the role() method differently in each subclass.
//Use abstraction in the Person class by making it an abstract class with an abstract role() method.
//Write the Java code that fulfills the above requirements. 
//The code should include a practical test of each class and its methods in the main class.
public class SystemManagingSchool {

    public static void main(String[] args) {
       Person teacher = new Teacher("yousof sabrah", 30, "123 Main St", "Math", 5);
        Person student = new Student("sami", 15, "456 Elm St", "10th", "S12345");
        Person admin = new Administrator("dua'a", 40, "789 Oak St", "Principal", 10);

        System.out.println(teacher.getName()+" is a "+teacher.Role());
        ((Teacher) teacher).Teach();
        System.out.println(student.getName()+" is a "+student.Role());
        ((Student)student).Study();
        System.out.println(admin.getName()+" is a "+admin.Role());
        ((Administrator)admin).Manage();
    }
}
