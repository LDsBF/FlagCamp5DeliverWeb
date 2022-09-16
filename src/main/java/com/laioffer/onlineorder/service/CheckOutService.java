package com.laioffer.onlineorder.service;

import com.laioffer.onlineorder.dao.OrderDao;
import com.laioffer.onlineorder.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutService {
    @Autowired
    OrderDao orderDao;

    public void saveOrder(Order order) {
        // TODO add current login user's email to order

        orderDao.save(order);
    }
}
