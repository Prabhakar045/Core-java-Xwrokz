package com.Xworkz.OurOwnObjectBookdeatils;

import com.Xworkz.ConstantEnum.BookType;

import java.util.ArrayList;
import java.util.List;

public class BookExecutor {
    public static void main(String[] args) {


        List<BookDto> dto = new ArrayList<BookDto>();
        dto.add(new BookDto(1,"Java",589, "James gosling", 1989, 400.00, BookType.coding, "pbk"));
        dto.add(new BookDto(2,"Five pinots on someone",400, "chetan Bhagath", 2013, 400.00, BookType.stories, "pbk"));
        dto.add(new BookDto(3,"C",139, "Prabhakar", 2020, 4004.00, BookType.coding, "pb"));
        dto.add(new BookDto(4,"The Birth of Shiva",1289, "madurya", 2012, 300.00, BookType.stories, "pbk1"));
        dto.add(new BookDto(5, "Python Programming", 450, "Guido van Rossum", 2015, 350.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(6, "The Great Gatsby", 180, "F. Scott Fitzgerald", 1925, 250.00, BookType.STORIES, "pbk"));
        dto.add(new BookDto(7, "Data Structures and Algorithms", 600, "Clifford A. Shaffer", 2019, 420.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(8, "To Kill a Mockingbird", 281, "Harper Lee", 1960, 270.00, BookType.STORIES, "pbk1"));
        dto.add(new BookDto(9, "Artificial Intelligence", 750, "Stuart Russell", 2022, 550.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(10, "1984", 328, "George Orwell", 1949, 280.00, BookType.STORIES, "pbk"));
        dto.add(new BookDto(11, "Machine Learning", 550, "Tom M. Mitchell", 1997, 450.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(12, "The Catcher in the Rye", 224, "J.D. Salinger", 1951, 240.00, BookType.STORIES, "pbk1"));
        dto.add(new BookDto(13, "JavaScript Basics", 350, "John Doe", 2018, 300.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(14, "Pride and Prejudice", 279, "Jane Austen", 1813, 260.00, BookType.STORIES, "pbk"));
        dto.add(new BookDto(15, "SQL Fundamentals", 400, "Alice Smith", 2020, 380.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(16, "The Lord of the Rings", 1178, "J.R.R. Tolkien", 1954, 900.00, BookType.STORIES, "pbk1"));
        dto.add(new BookDto(17, "Data Science Essentials", 600, "John Watson", 2021, 450.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(18, "Crime and Punishment", 430, "Fyodor Dostoevsky", 1866, 320.00, BookType.STORIES, "pbk"));
        dto.add(new BookDto(19, "Python for Data Analysis", 550, "Wes McKinney", 2012, 420.00, BookType.CODING, "pbk"));
        dto.add(new BookDto(20, "The Hobbit", 310, "J.R.R. Tolkien", 1937, 270.00, BookType.STORIES, "pbk"));


        for (BookDto  dto1 : dto){
            System.out.println(dto1);
        }

    }
}
