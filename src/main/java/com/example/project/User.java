package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book[] book that is initialized to empty
    private String name;
    private String Id;
    private Book[] books = new Book[5];

    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    // ## GETTERS AND SETTERS ##

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getId() {return Id;}

    public void setId(String Id) {this.Id = Id;}

    public Book[] getBooks() {return books;}

    public void setBooks(Book[] books) {this.books = books;}

    // returns the info about the book the user owns
    public String bookListInfo(){
        String info = "";
        for (Book book : books) {
            if (book == null) {
                info += "empty";
            } else {
                info += book.bookInfo();
            }
            info += "\n";
        }
        return info;
    } //returns a booklist for the user, if empty, output "empty"

    public String userInfo(){
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    } //returns  "Name: []\nID: []\nBooks:\n[]"
       
}