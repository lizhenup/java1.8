package com.lz.service;

import com.lz.dao.BookMapper;
import com.lz.pojo.Books;

import java.util.List;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/13 16:19
 * @description：
 * @modified By：
 * @version: $
 */
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteById(int id) {
        return bookMapper.deleteById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryById(int id) {
        return bookMapper.queryById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryByName(String bookName) {
        return bookMapper.queryByName(bookName);
    }


}
