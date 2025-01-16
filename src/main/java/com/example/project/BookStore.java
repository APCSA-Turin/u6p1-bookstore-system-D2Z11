package com.example.project;

public class BookStore {

    // requires at least 2 attributes Book[] books, User[] users (initialized to an
    // empty array of 10 max users)
    private Book[] books = new Book[5];
    private int bookIndex = 0;
    private User[] users = new User[10]; // (initialized to an empty array of 10 max users)
    private int userIndex = 0;

    // requires 1 empty constructor
    BookStore() {

    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addUser(User user) {
        users[userIndex] = user;
        userIndex++;
    }

    public void removeUser(User user) {
        // User[] newUsers = new User[10];
        for (int i = 0; i < users.length; i++) {
            // If the given user to remove matches the current user's ID they are the same
            // user so remove it
            if (users[i] == user) {
                users[i] = null;
            }
        }
        consolidateUsers();
    }

    // method to move non-null items to the front and null items to the back
    public void consolidateUsers() {
        User[] newUsers = new User[users.length];
        int newUserIndex = 0;

        for (int i = 0; i < newUsers.length; i++) {
            System.out.println(newUsers[i]);
        }
        System.out.println("----------");

        for (int i = 0; i < users.length; i++) {
            // If the User is not null then add it to the end of newUsers (using
            // newUserIndex) and increment newUserIndex.
            // Ignore all nulls because by default the new allocated array is filled with 10
            // null values
            if (users[i] != null) {
                newUsers[newUserIndex] = users[i];
                newUserIndex++;
            }
        }
        System.out.println("----------");
        for (int i = 0; i < newUsers.length; i++) {
            System.out.println(newUsers[i]);
        }
        System.out.println("----------");
        users = newUsers;
    }

    public void addBook(Book book) {
        books[bookIndex] = book;
        bookIndex++;
    }

    public void insertBook(Book book, int index) {
        Book[] newBooks = new Book[5];
        newBooks[index] = book;
        for (int i = 0; i < index; i++) {
            newBooks[i] = books[i];
        }
        for (int i = index + 1; i < books.length - 1; i++) {
            newBooks[i] = books[i - 1];
        }
        books = newBooks;
    }

    public void removeBook(Book book) {
        // Book[] newBooks = new Book[5];
        for (int i = 0; i < books.length; i++) {
            // Ensure books[i] is not null before checking if a method exists on it
            if (books[i] != null) {
                // If the given user to remove matches the current user's ID they are the same
                // user so remove it
                if (books[i] == book) {
                    // First check if the quantity is greater than 1
                    if (books[i].getQuantity() > 1) {
                        // Then, decrease the quantity by 1
                        books[i].setQuantity(books[i].getQuantity() - 1);
                    } else {
                        // This means there is only one book, so remove it completely
                        books[i] = null;
                    }
                }
            }
        }
        removeAllBookNulls();
    }

    public void removeAllBookNulls() {
        int nullAmount = 0;
        for (int i = 0; i < books.length; i++) {
            // Ensure books[i] is not null before checking if a method exists on it
            if (books[i] == null) {
                nullAmount++;
            }
        }
        // Make a new array but without the null values (book length is amount of nulls found)
        Book[] newBooks = new Book[books.length - nullAmount];
        int newBookIndex = 0;
        for (int i = 0; i < books.length; i++) {
            // Ensure books[i] is not null before checking if a method exists on it
            if (books[i] != null) {
                // Set the last index of newBooks to the book that is not null
                newBooks[newBookIndex] = books[i];
                newBookIndex++;
            }
        }
        books = newBooks;
    }

    public void removeAllUserNulls() {
        int nullAmount = 0;
        for (int i = 0; i < users.length; i++) {
            // Ensure books[i] is not null before checking if a method exists on it
            if (users[i] == null) {
                nullAmount++;
            }
        }
        System.out.println(books.length + " " + nullAmount);
        // Make a new array but without the null values (book length is amount of nulls found)
        User[] newUsers = new User[books.length - nullAmount];
        int newUserIndex = 0;
        for (int i = 0; i < books.length; i++) {
            // Ensure books[i] is not null before checking if a method exists on it
            if (books[i] != null) {
                // Set the last index of newBooks to the book that is not null
                newUsers[newUserIndex] = users[i];
                newUserIndex++;
            }
        }
        users = newUsers;
    }

    // public String bookStoreBookInfo(){

    // } //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){

    // } //you are not tested on this method but use it for debugging purposes

}