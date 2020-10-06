package com.lz.dao;

import com.lz.pojo.Books;

import java.util.List;

public interface BookMapper {
    //add
    int addBook(Books books);
    //delete
    int deleteById(int bookID);
    //update
    int updateBook(Books books);
    //select
    Books queryById(int bookID);
    //selectAll
    List<Books> queryAllBook();

    Books queryByName(String bookName);
}
