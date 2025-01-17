
//This is the main class
public class HandleBookDetails {
    public static void main(String[] args) {
    //For Book 1
        Book bookForC=new Book("C","Uday",256);
        Book bookForCpp =new Book("C++","Ankit",2056);
        bookForCpp.displayBookDetails();
        bookForC.displayBookDetails();
    }
}

//This is the another class

class Book{
    String title;
    String author;
    double price ;
    //Take the input using Constructor
    Book(String title, String author, double price){
        this.author=author;
        this.price= price;
        this.title=title;

    }
    //Method for displaying the details of the Books
    public void displayBookDetails(){
        System.out.println("Book Details:");
        System.out.println("Author of the Book is: "+author);
        System.out.println("Title of the Book is: "+title);
        System.out.println("Price of the Book is: "+price);
    }
}