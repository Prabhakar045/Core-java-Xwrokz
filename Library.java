package com.xworkz.LibraryMNGT;

public interface Library {


 public void getAllBooks();

 public boolean addBook(BookDTO bookDTO);

 public void getBook();

 public String getBookNameByBookId(int bookId);

 public int getNoOfPagesByBookName(String bookName);

 public String getAuthorNameByBookName(String bookName);

 public int getPublishedYearByBookId(int bookId);

 public BookDTO getBookById(int id);

 public BookDTO[] getBookByYear(int publishedYear);

 public BookDTO[] getBooksByAuthor(String authorName);

 public BookDTO getBookByPublisher(String publisher);

 public String getBookNameByBookType(BookType bookType);

 public double getBookPriceByBookName(String bookName);

 public String[] getBookNameByYearOfPublish(int publishedYear);

 public void deleteBookById(int bookId);

 public boolean updateBookPagesByBookName(String bookName);

 public boolean updateBookPriceByBooKId(int bookId);

 public String updatePublisherByAuthor(String authorName);

 String[] getBookNameByYearOfpublish(int yearOfPublication);

}

