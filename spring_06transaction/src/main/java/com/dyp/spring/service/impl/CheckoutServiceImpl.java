package com.dyp.spring.service.impl;

import com.dyp.spring.service.CheckoutService;
import com.dyp.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
    public void checkout(Integer userId,Integer[] bookIds){
        for (Integer bookId: bookIds) {
            bookService.updateBuyBook(bookId,userId);
        }
    }
}
