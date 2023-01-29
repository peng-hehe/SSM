package com.dyp.spring.controller;

import com.dyp.spring.service.CheckoutService;
import com.dyp.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    public void updateBuyBook(Integer bookId , Integer userId){
        bookService.updateBuyBook(bookId,userId);
    }

    public void checkout(Integer userId,Integer[] bookIds){
        checkoutService.checkout(userId,bookIds);
    }
}
