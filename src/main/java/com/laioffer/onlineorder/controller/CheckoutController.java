package com.laioffer.onlineorder.controller;

import com.laioffer.onlineorder.entity.Order;
import com.laioffer.onlineorder.service.CartService;
import com.laioffer.onlineorder.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class CheckoutController {

    @Autowired
    private CheckOutService checkOutService;

    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void checkout(@RequestBody Order order) {
        checkOutService.saveOrder(order);
    }
}
