package com.dyp.spring.dao;

public interface BookDao {
    Integer getPriceById(Integer bookId);

    void updateStock(Integer bookId);

    void updateBlance(Integer userId, Integer price);
}
