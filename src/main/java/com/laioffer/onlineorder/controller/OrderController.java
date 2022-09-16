package com.laioffer.onlineorder.controller;

import com.laioffer.onlineorder.entity.Order;
import com.laioffer.onlineorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public List<Order> trackOrders() {
        // TODO get current login user
        return orderService.getOrders("");
    }
}
