package com.operation;

import com.book.Book;
import com.book.BookList;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入要删除书籍的名称：");
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
            if(i == bookList.getUsedSize()) {
                System.out.println("查无此书");
                return;
            }
            for (int j = i; j < bookList.getUsedSize()-1; j++) {
                book = bookList.getBook(j+1);
                bookList.setBooks(j,book);
            }
            int curSize = bookList.getUsedSize();
            bookList.setUsedSize(curSize-1);
            System.out.println("删除成功！");

        }
    }

}
