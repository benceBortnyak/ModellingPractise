package com.codecool.Brain;

import com.codecool.Brain.Book;
import com.codecool.Brain.Kind;

import java.util.List;

public class PopUpBook extends Book {
    
    private Kind kind;

    public PopUpBook(String author, String title, int numOfPages, List<String> content, Kind kind) {
        super(author, title, numOfPages, content);
        this.kind = kind;
    }
}
