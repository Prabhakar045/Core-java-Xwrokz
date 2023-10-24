package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO1 {
    private String title;
    private String author;
    private int pageCount;

    @Override
    public String toString(){
        return "[Title = "+this.title+", Author = "+this.author+", Page Count = "+this.pageCount+"]";
    }

    public void setBookId(int i) {
    }

    public String getBookId() {
        return null;
    }
}
