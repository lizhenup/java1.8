package com.user;
import com.book.BookList;
import com.operation.IOperation;
public abstract class User {
    public String name;
    //IOperation-->实现这个接口的类都可以放进去
    public IOperation[] operations;
    public IOperation[] Operations;
    //根据用户选项进行操作
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    //对象
    }
    public abstract  int menu();

}
