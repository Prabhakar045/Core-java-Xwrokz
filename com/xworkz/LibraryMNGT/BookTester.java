package com.xworkz.LibraryMNGT;

import java.util.Arrays;
import java.util.Scanner;

public class BookTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The book size is:");
        int size = sc.nextInt();
        Library lib = new RamMandirLibrary(size) {
            @Override
            public void getAllBooks() {

            }

            @Override
            public String[] getBookNameByYearOfpublish(int yearOfPublication) {
                return new String[0];
            }
        };

        for (int index = 0; index < size; index++) {
            BookDTO bookDTO = new BookDTO();
            System.out.println("Enter the book name:");
            bookDTO.setBookName(sc.next());
            System.out.println("Enter the no of pages:");
            bookDTO.setNoOfPages(sc.nextInt());
            System.out.println("Enter the author name:");
            bookDTO.setAuthorName(sc.next());
            System.out.println("Enter the published year:");
            bookDTO.setPublishedYear(sc.nextInt());
            System.out.println("Enter the book price:");
            bookDTO.setPrice(sc.nextInt());
            System.out.println("Enter the book type:");
            bookDTO.setBookType(BookType.valueOf(sc.next()));
            System.out.println("Enter the publisher");
            bookDTO.setPublisher(sc.next());
            lib.addBook(bookDTO);
        }
        int options;
        String userInput = null;
        do {
            System.out.println("Press 1. To get the Book's's Info");
            System.out.println("Press 2. Enter the book's Id to get the book's Name");
            System.out.println("Press 3. Enter the book's name to get the no of pages");
            System.out.println("Press 4. Enter the book's name to get the author name");
            System.out.println("Press 5. Enter the book's id to get the published year");
            System.out.println("Press 6. Enter year to get book name");
            System.out.println("press 7, Enter author to get book name");
            System.out.println("press 8, Enter publisher to get book name");
            System.out.println("press 9, Enter book type to get book name");
            System.out.println("press 10, Enter book name to get book price");
            System.out.println("press 11, Enter year of publish to get book name");
            System.out.println("press 12, Enter book id to delete book");
            options = sc.nextInt();
            switch (options) {
                case 1:
                    lib.getBook();
                    break;
                case 2:
                    System.out.println("Enter the book's Id to get the book's Name");
                    String bookName = lib.getBookNameByBookId(sc.nextInt());
                    System.out.println("The book's name is:" + bookName);
                    break;
                case 3:
                    System.out.println("Enter the book's name to get the no of pages");
                    int noOfPages = lib.getNoOfPagesByBookName(sc.next());
                    System.out.println("The no of pages is:" + noOfPages);
                case 4:
                    System.out.println("Enter the book's name to get the author name");
                    String authorName = lib.getAuthorNameByBookName(sc.next());
                    System.out.println("The author name is:" + authorName);
                    break;
                case 5:
                    System.out.println("Enter the book's id to get the published year");
                    int publishedYear = lib.getPublishedYearByBookId(sc.nextInt());
                    System.out.println("The published year is:" + publishedYear);
                    break;

                case 6:
                    System.out.println("Enter year to get book name");
                    int year = sc.nextInt();
                    BookDTO[] booksByYear = lib.getBookByYear(year);
                    System.out.println("Books published in " + year + ":");
                    Arrays.toString(booksByYear);
                    System.out.println(Arrays.toString(booksByYear));
//                   for(int i=0;i<booksByYear.length;i++)
//                   {
//                       System.out.println(booksByYear[i].getBookId());
//                       System.out.println(booksByYear[i].getBookName());
//
//                   }
                    break;

                case 7:
                    System.out.println("Enter author to get book name");
                    String author = sc.next();
                    BookDTO[] booksByAuthor = lib.getBooksByAuthor(author);
                    System.out.println("Books by author " + author + ":");
//                    for (BookDTO book : booksByAuthor) {

//                        System.out.println("Book Name: " + book.getBookName());
//                    }
                    System.out.println(Arrays.toString(booksByAuthor));
                    break;

                case 8:
                    System.out.println("Enter publisher to get book name");
                    String publisher = sc.next();
                    BookDTO bookByPublisher = lib.getBookByPublisher(publisher);
                    System.out.println("Book by publisher " + publisher + ":");
                    if (bookByPublisher != null) {
                        System.out.println("Book Name: " + bookByPublisher.getBookName());
                    } else {
                        System.out.println("No book found for the given publisher.");
                    }
                    break;

                case 9:
                    System.out.println("Enter book type to get book name");
                    String bookTypeName = sc.next();
                    BookType bookType = BookType.valueOf(bookTypeName);
                    String bookNameByType = lib.getBookNameByBookType(bookType);
                    if (bookNameByType != null) {
                        System.out.println("Book Name with type " + bookTypeName + ": " + bookNameByType);
                    } else {
                        System.out.println("No book found for the given book type.");
                    }
                    break;

                case 10:
                    System.out.println("Enter book name to get book price");
                    String bookNameToSearch = sc.next();
                    double bookPrice = lib.getBookPriceByBookName(bookNameToSearch);
                    System.out.println("The price of the book " + bookNameToSearch + " is: " + bookPrice);
                    break;

                case 11:
                    System.out.println("Enter year of publish to get book names");
                    int yearOfPublish = sc.nextInt();
                    String[] bookNamesByYear = lib.getBookNameByYearOfPublish(yearOfPublish);
                    System.out.println("Books published in " + yearOfPublish + ":");
                    for (String name : bookNamesByYear) {
                        System.out.println("Book Name: " + name);
                    }
                    break;

                case 12:
                    System.out.println("Enter book id to delete book");
                    lib.deleteBookById(sc.nextInt());
            }
        } while (userInput.equals("yes"));
        System.out.println("Do you wish to continue, yes/no");
        userInput = sc.next("yes");

        lib.getBook();
    }
}
