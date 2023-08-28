package com.xworkz.LibraryMNGT;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
