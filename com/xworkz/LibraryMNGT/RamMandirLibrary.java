package com.xworkz.LibraryMNGT;

import java.util.Arrays;

public abstract class RamMandirLibrary implements Library{
    public BookDTO bookDTO[];
    public int position=0;
    private com.xworkz.LibraryMNGT.BookDTO BookDTO;

    public RamMandirLibrary(int size){
        //Initialize book array with size through constructor
        bookDTO =new BookDTO[size];
    }
    int index;
    int id;
    @Override
    public boolean addBook(BookDTO bookDTO) {
        boolean isAdded=false;
        if(bookDTO !=null){
            bookDTO.setBookId(++id);
            System.out.println(bookDTO.getBookId());
            this.bookDTO[index++]= bookDTO;
            isAdded=true;
        }
        else {
            System.out.println("Book is null... cannot add the book");
        }
        return isAdded;
    }

    @Override
    public void getBook() {
        System.out.println("List of all books:");
        for (int bookIndex = 0; bookIndex < index; bookIndex++) {
            BookDTO book = bookDTO[bookIndex];
            if (book != null) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Book Name: " + book.getBookName());
                System.out.println("Author Name: " + book.getAuthorName());
                System.out.println("Publisher: " + book.getPublisher());
                System.out.println("No. of Pages: " + book.getNoOfPages());
                System.out.println("Year of Publication: " + book.getPublishedYear());
                System.out.println("Price: " + book.getPrice());
                System.out.println("Book Type: " + book.getBookType());

            }
        }
    }

    @Override
    public String getBookNameByBookId(int bookId) {
        String bookName=null;
        for(int index = 0; index< bookDTO.length; index++) {
            if (bookDTO[index].getBookId() == bookId) {
                bookName = bookDTO[index].getBookName();
            }
        }
        return bookName;
    }

    @Override
    public int getNoOfPagesByBookName(String bookName) {
        int noOfPages=0;
        for (int index = 0; index< bookDTO.length; index++){
            if (bookDTO[index].getBookName()==bookName){
                noOfPages= bookDTO[index].getNoOfPages();
            }
        }
        return noOfPages;
    }

    @Override
    public String getAuthorNameByBookName(String bookName) {
        String authorName=null;
        for (int index = 0; index< bookDTO.length; index++){
            if (bookDTO[index].getBookName()==bookName){
                authorName= bookDTO[index].getAuthorName();
            }
        }
        return authorName;
    }

    @Override
    public int getPublishedYearByBookId(int bookId) {
        int publishedYear=0;
        for (int index = 0; index< bookDTO.length; index++){
            if (bookDTO[index].getBookId()==bookId){
                publishedYear= bookDTO[index].getPublishedYear();
            }
        }
        return publishedYear;
    }

    @Override
    public BookDTO getBookById(int id) {
        String bookName=null;
        for (int index=0; index<bookDTO.length; index++){
            if (bookDTO[index].getBookId()==id){
                bookName=bookDTO[index].getBookName();
            }
        }
        return BookDTO;
    }

        @Override
        public BookDTO[] getBookByYear(int publishedYear) {
//            BookDTO[] bookDTO = null;

            int newIndex=0;
            for (int index=0; index<bookDTO.length; index++){
                if (bookDTO[index].getPublishedYear()==publishedYear){

                    newIndex++;
                }
            }

            newIndex=0;
            bookDTO = new BookDTO[newIndex];
            for (int index=0; index<bookDTO.length; index++){
                if (bookDTO[index].getPublishedYear()==publishedYear){
                    bookDTO[newIndex++] = this.bookDTO[index];
                }
            }
            return bookDTO;
        }



    @Override
    public BookDTO[] getBooksByAuthor(String authorName) {
        int newIndex = 0;

        // Count the number of books by author
        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index] != null && bookDTO[index].getAuthorName().equals(authorName)) {
                newIndex++;
            }
        }

        BookDTO[] mBooks = new BookDTO[newIndex];     // Create a new array to hold the matching books
        newIndex = 0;

        //  the matchingBooks array with the books by the specified author
        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index] != null && bookDTO[index].getAuthorName().equals(authorName)) {
                mBooks[newIndex++] = bookDTO[index];
            }
        }

        return mBooks;
    }


    @Override
    public BookDTO getBookByPublisher(String publisher) {
        String bookName=null;
        for (int index=0; index<bookDTO.length; index++){
            if (bookDTO[index].getPublisher()==publisher){
                bookName=bookDTO[index].getBookName();
            }
        }
        return BookDTO;
    }

    @Override
    public String getBookNameByBookType(BookType bookType) {
        String bookName=null;
        for (int index=0; index<bookDTO.length; index++){
            if (bookDTO[index].getBookType()==bookType){
                bookName=bookDTO[index].getBookName();
            }
        }
        return bookName;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double price=0.0;
        for (int index=0; index<bookDTO.length; index++){
            if (bookDTO[index].getBookName()==bookName){
                price=bookDTO[index].getPrice();
            }
        }
        return price;
    }


    @Override
    public String[] getBookNameByYearOfPublish(int publishedYear) {
        int newIndex = 0;

        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index].getPublishedYear() == publishedYear) {
                newIndex++;
            }
        }


        String[] bookNames = new String[newIndex];

        newIndex = 0;
        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index].getPublishedYear() == publishedYear) {
                bookNames[newIndex++] = bookDTO[index].getBookName();
            }
        }

        return bookNames;
    }



    @Override
    public void deleteBookById(int bookId) {
        for (int i = 0; i < index; i++) {
            if (bookDTO[i] != null && bookDTO[i].getBookId() == id) {
                bookDTO[i] = null;
                break;
            }
        }
    }

    @Override
    public boolean updateBookPagesByBookName(String bookName) {
        for (int i = 0; i < index; i++) {
            if (bookDTO[i] != null && bookDTO[i].getBookName().equals(bookName)) {
                bookDTO[i].setNoOfPages(bookDTO[i].getNoOfPages());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateBookPriceByBooKId(int bookId) {
        for (int i = 0; i < index; i++) {
            if (bookDTO[i] != null && bookDTO[i].getBookId()==(bookId)) {
                bookDTO[i].setPrice(bookDTO[i].getPrice() );
                return true;
            }
        }
        return false;
    }

    @Override
    public String updatePublisherByAuthor(String authorName) {
        for (int i = 0; i < index; i++) {
            if (bookDTO[i] != null && bookDTO[i].getAuthorName().equals(authorName)) {
                bookDTO[i].setPublisher("Updated Publisher");
                return "New Publisher";
            }
        }
        return authorName;
    }
}