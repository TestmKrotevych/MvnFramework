package com.test.util;

public class Book {
    String author;
    String title;

    public Book (String title, String author)
    {
        this.title=title;
        this.author=author;
    }

    public void setAuthor (String author)
    {
        this.author=author;
    }

    public void setTitle (String title)
    {
        this.title=title;
    }

    public String getAuthor ()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }


}
