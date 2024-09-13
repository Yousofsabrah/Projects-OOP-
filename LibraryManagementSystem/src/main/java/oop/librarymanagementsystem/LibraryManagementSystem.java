package oop.librarymanagementsystem;
//. مشروع إدارة المكتبة (Library Management System)
public class LibraryManagementSystem {
 
//الوصف:
//
//قم بإنشاء نظام لإدارة مكتبة يحتوي على فئات متعددة مثل Book و Member و Librarian.
//الفئة Book تحتوي على معلومات عن الكتب مثل العنوان، المؤلف، ومعرف الكتاب.
//الفئة Member تحتوي على معلومات الأعضاء مثل الاسم، رقم العضوية، والكتب المستعارة.
//الفئة Librarian تحتوي على معلومات أمناء المكتبة مثل الاسم، معرف الموظف، والمهام المسندة.
//المهام:
//
//الفئة Book تكون الفئة الرئيسية.
//الفئة Member ترث من الفئة Person.
//الفئة Librarian ترث من الفئة Person.
//المتطلبات:
//
//إضافة كتاب جديد.
//تسجيل عضو جديد.
//استعارة كتاب من قبل عضو.
//عرض قائمة الكتب المتاحة.

//Create a library management system that contains multiple categories such as Book, Member, and Librarian.
//The Book class contains information about books such as title, author, and book ID.
//The Member class contains member information such as name, membership number, and borrowed books.
//The Librarian class contains librarian information such as name, employee ID, and assigned tasks.
//Tasks:
//
//The Book class is the parent class.
//The Member class inherits from the Person class.
//The Librarian class inherits from the Person class.
//Requirements:
//
//Add a new book.
//Registering a new member.
//Borrow a book from a member.
//View the list of available books.
//
//Translated with DeepL.com (free version)


   
 public static void main(String[] args) {
       Book[] books=new Book[4];
       Librarian librarian=new Librarian("nothing","11","Doua'a",1);
       Member[] members=new Member[3];
       
       Librarian.addBook(books,new Book("java","yousof","2"),0);
       Librarian.addBook(books,new Book("c++","ahmad","5"),1);
       Librarian.addBook(books,new Book("html","islam","8"),2);
         
       System.out.println("++++++++++++++++++++++++++");
       Librarian.RegisteringMember(members,new Member(500,"c++","amr",2),0);
       Librarian.RegisteringMember(members,new Member(501,"java","salman",3),1);
       Librarian.RegisteringMember(members,new Member(502,"python","amar",4),2);
       
       System.out.println("++++++++++++++++++++++++++");
       members[0].BorrowedBook(books[0]);
       
        System.out.println("Avilable Books:");
        for (Book book : books) {
            if(book != null ){
                System.out.println(book.getTitle()+" by "+book.getAuthor());
            }
            
        }
    }
}
