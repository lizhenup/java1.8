package com.user;

import com.book.BookList;
import com.operation.IOperation;
import com.sun.media.jfxmediaimpl.platform.ios.IOSPlatform;

public  abstract  class User {
    public String name;
    public abstract int menu();
    public IOperation[] operations;
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
