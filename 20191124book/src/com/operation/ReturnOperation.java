package com.operation;

import com.book.Book;
import com.book.BookList;

public class ReturnOperation implements IOperation {
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        System.out.println("请输入要归还书籍的名称：");
        String name = scanner.next();
        int i = 0;
        //遍历bookList数组
        Book book = null;
        for ( ; i < bookList.getUsedSize() ; i++) {
            book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                break;
            }
            if(i == bookList.getUsedSize()) {
                System.out.println("没有此书");
                return;
            }
            book = bookList.getBook(i);
            if(book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("还书成功！");
            }else {
                System.out.println("该书未被借阅");
            }
        }
    }
}
