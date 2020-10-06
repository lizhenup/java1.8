package com.operation;

import com.book.Book;
import com.book.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        System.out.println("请输入要归还的书名：");
        String name = scanner.next();
        int i = 0;
        Book book = null;
        for ( ; i < bookList.getUsedSize(); i++) {
            book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("查无此书");
            return;
        }
        book = bookList.getBook(i);
        if(book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("归还成功");
        }else {
            System.out.println("该书未被借阅");
        }
    }
}
