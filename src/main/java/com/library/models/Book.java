package com.library.models;

public class Book {
    private String id;
    private String title;
    private String author;
    private String status; //AVAILABLE OR BORROWED
    private String issuedTo;

    public Book(String id, String title, String author, String status, String issuedTo) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
        this.issuedTo = issuedTo;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }
}
