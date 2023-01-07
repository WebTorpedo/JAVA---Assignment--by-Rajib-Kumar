/* Create a class called Book to represent a book. A Book should include four
pieces of information as instance variables‐a book name, an ISBN number, an
author name and a publisher. Your class should have a constructor that
initializes the four instance variables. Provide a mutator method and accessor
method (query method) for each instance variable. Inaddition, provide a
method named getBookInfo that returns the description of the book as a String
(the description should include all the information about the book). You
should use this keyword in member methods and constructor. Write a test
application named BookTest to create an array of object for 30 elements for
class Book to demonstrate the class Book's capabilities. */

import java.util.Scanner;


class Book {


    private String name;
    private int ISBN_number;
    private String author, publisher;
    public Book(String name, int ISBN_number, String author, String publisher ){
        this.name = name;
        this.ISBN_number = ISBN_number;
        this.author = author;
        this.publisher = publisher;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    
        public void setPublisher(String publisher){
        this.publisher = publisher;
    }
        
     public void setISBN(int ISBN_number){
         this.ISBN_number = ISBN_number;
     }
     
     String getName(){
         return name;
     }
     
     String getAuthor(){
         return author;
     }
     String getPublisher(){
         return publisher;
     }
     int getISBN(){
         return ISBN_number;
     }
     
     String getBookInfo(){
         String info = "Name:   "+ name + "\nISBN Number:  " + ISBN_number +
                 "\nAuthor:   "+author+"\nPublisher:   "+ publisher;
         return info;
     }
}


//Testing class
public class BookTest {


    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         Book [] book = new Book[30];
          System.out.printf("Enter the books data:\n");
         for(int i=0; i<30; i++){
             System.out.printf("Book %d\n", (i+1));
             String name;
             int ISBN_number; 
             String author; 
             String publisher;
             
             System.out.printf("Enter the book name\n");
             name = scan.next();
             
             System.out.printf("Enter the book ISBN Number\n");
             ISBN_number = scan.nextInt();
             
             System.out.printf("Enter the book Author\n");
             author = scan.next();
             
             System.out.printf("Enter the book Publisher\n");
             publisher = scan.next();
             book[i] = new Book(name,ISBN_number,author,publisher );
             
         }
         
         for(int i=0; i<30; i++){
             System.out.printf("\n\nBook %d\n", (i+1));
             System.out.printf("%s\n", book[i].getBookInfo());
         }
    }
    
}