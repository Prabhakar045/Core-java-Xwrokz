package com.xworkz.LibraryMNGT;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BookDTO {

    private int bookId;
    private String bookName;
    private int noOfPages;
    private String authorName;
    private int publishedYear;
    private double price;
    private BookType bookType;
    private String publisher;


}
