package com.operation;

import com.book.BookList;

import java.sql.SQLOutput;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
