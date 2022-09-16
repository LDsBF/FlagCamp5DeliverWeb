package com.laioffer.onlineorder.dao;

import com.laioffer.onlineorder.entity.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(Order order) {
        // TODO
    }

    public List<Order> getOrders(String email) {
        // TODO
        return null;
    }
}
