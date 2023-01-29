package com.dyp.spring.service.impl;

import com.dyp.spring.dao.BookDao;
import com.dyp.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
//    我們不做数据的检验和抛出异常, 借助数据库 unsigned 类型抛出异常
    @Override
    public void updateBuyBook(Integer bookId, Integer userId) {
        //查询图书的价格
        Integer price = bookDao.getPriceById(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);// 有修改操作：报错
        //更新用户的余额
        bookDao.updateBlance(userId,price);
    }
}
