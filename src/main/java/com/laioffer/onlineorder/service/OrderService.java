package com.laioffer.onlineorder.service;

import com.laioffer.onlineorder.dao.OrderDao;
import com.laioffer.onlineorder.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public List<Order> getOrders(String email) {
        return orderDao.getOrders(email);
    }
}
