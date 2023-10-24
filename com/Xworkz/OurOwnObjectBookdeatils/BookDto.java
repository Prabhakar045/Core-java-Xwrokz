package com.Xworkz.OurOwnObjectBookdeatils;

import com.Xworkz.ConstantEnum.BookType;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class BookDto {

    private int bookId;
    private String bookName;
    private int noOfPages;
    private String authorName;
    private int publishedYear;
    private double price;
    private BookType bookType;
    private String publisher;
}
