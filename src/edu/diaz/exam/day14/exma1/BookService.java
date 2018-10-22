package edu.diaz.exam.day14.exma1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class BookService {
    private static BookService instance;
    private HashMap<String, BookInfo> bookDatas;



    private BookService() {
        bookDatas = new HashMap<String, BookInfo>();
    }

    public static BookService getInstance() {
        if (null != instance)
            return instance;
        instance = new BookService();
        return instance;
    }

    public boolean add(BookInfo bookInfo) {
        return (null == bookDatas.put(bookInfo.getIsbn(), bookInfo));
    }

    public BookInfo get(String isbn) {
        return bookDatas.getOrDefault(isbn, null);
    }

    public Collection<BookInfo> getAllBookInfo() {
        return bookDatas.values();
    }

    public boolean removeBookInfo(String isbn) {
        return (bookDatas.remove(isbn) == null);
    }
}
