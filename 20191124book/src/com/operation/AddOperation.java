package com.operation;
import com.book.Book;
import com.book.BookList;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        System.out.println("请输入图书名称：");
        String name = scanner.next();
        System.out.println("请输入图书作者：");
        String author = scanner.next();
        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书类型：");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        int pos = bookList.getUsedSize();
        bookList.setBooks(pos,book);
        bookList.setUsedSize(pos+1);
    }


}
