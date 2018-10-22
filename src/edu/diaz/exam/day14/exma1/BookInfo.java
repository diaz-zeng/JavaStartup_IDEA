package edu.diaz.exam.day14.exma1;

public class BookInfo {
    private String title,isbn;

    private int price;

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }
    public BookInfo(String title , int price ,String isbn) {
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "书名："+getTitle()+" 价格："+getPrice()+" ISBN："+getIsbn();
    }
}
