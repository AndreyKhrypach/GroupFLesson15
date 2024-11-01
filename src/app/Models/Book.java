package app.Models;

import app.enumHelper.Topic;

public class Book {
    public String name;
    public Topic bookType;
    public String author;

    public Book(String name, String author, Topic type) {
        this.bookType = type;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Topic getBookType() {
        return bookType;
    }

    public String getAuthor() {
        return author;
    }
}
