package oop.librarymanagementsystem;

public class Librarian extends Person {

    private String employeeID;
    private String assignedTasks;

    public Librarian(String assignedTasks,String employeeID,String name, int id) {
        super(name, id);
        this.assignedTasks=assignedTasks;
        this.employeeID=employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(String assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    public static void addBook(Book[] books, Book newBook, int index) {
        if (index < books.length) {
            books[index] = newBook;
            System.out.println(newBook.getTitle() + " has been added to the library.");
        } else {
            System.out.println("No space available to add the book.");
        }
    }

    public static void RegisteringMember(Member[] members, Member newMember, int index) {
        if (index < members.length) {
            members[index] = newMember;
            System.out.println(newMember.getName() + " has been added to the library");
        } else {
            System.out.println("No space available to add the member.");
        }
    }

}
