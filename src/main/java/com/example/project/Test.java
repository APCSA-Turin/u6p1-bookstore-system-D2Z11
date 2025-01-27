package com.example.project;

class Test {
    public static void main(String[] args) {
        BookStore store = new BookStore(); 
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        Book b5 = new Book("Test","Author",1900, "1234", 1);
        store.addBook(b1);store.addBook(b2);store.addBook(b3);store.addBook(b4);store.addBook(b5);
        store.removeBook(b1);store.removeBook(b1);
        store.removeBook(b1);
        Book[] expected = {b2,b3,b4,b5};
        // DO NOT EDIT
        // for (User z : store.getUsers()) {
        //     if (z != null) {
        //         System.out.println(z.getName());
        //     } else {
        //         System.out.println("null");
        //     }
        // }
        // System.out.println();

        for (Book z : store.getBooks()) {
            if (z != null) {
                System.out.println(z.getTitle());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        for (Book z : expected) {
            if (z != null) {
                System.out.println(z.getTitle());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        // for (User z : expected) {
        //     if (z != null) {
        //         System.out.println(z.getName());
        //     } else {
        //         System.out.println("null");
        //     }
        // }
        // System.out.println();
    }
}