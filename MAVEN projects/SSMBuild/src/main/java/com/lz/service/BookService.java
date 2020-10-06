package com.lz.service;

import com.lz.pojo.Books;

import java.util.List;

public interface BookService {
    //add
    int addBook(Books books);
    //delete
    int deleteById(int id);
    //update
    int updateBook(Books books);
    //select
    Books queryById(int id);
    //selectAll
    List<Books> queryAllBook();

    Books queryByName(String bookName);
}
