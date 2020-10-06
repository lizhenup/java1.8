package com.operation;

import com.book.Book;
import com.book.BookList;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        System.out.println("请输入要添加的书籍的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的书籍作者的名字");
        String author = scanner.next();
        System.out.println("请输入要添加的书籍的价格");
        int price = scanner.nextInt();
        System.out.println("请输入要添加的书籍的类型");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUsedSize();
        bookList.setBook(curSize,book);
        bookList.setUsedSize(curSize+1);


    }
}
