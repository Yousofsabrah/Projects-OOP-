
package oop.librarymanagementsystem;

public class Member extends Person{
    private int membershipNumber;
    private String borrowedBooks;
    

    public Member(int membershipNumber,String borrowedBooks,String name,int id) {
        super(name,id);
        this.membershipNumber=membershipNumber;
        this.borrowedBooks=borrowedBooks;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
    public void BorrowedBook(Book book){
        if(membershipNumber==-1&&!book.isBorrowedBook){
            System.out.println(getName()+" has borroed "+book.getTitle());
            book.isBorrowedBook=true;      
        }else{
            System.out.println( book.getTitle()+" is already borroed");
        }
    }
    
}
