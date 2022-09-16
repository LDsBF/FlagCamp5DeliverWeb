package com.laioffer.onlineorder.controller;

import com.laioffer.onlineorder.entity.DeliverCenter;
import com.laioffer.onlineorder.entity.DeliverInfo;
import com.laioffer.onlineorder.service.DeliverCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeliverCenterController {

    @Autowired
    private DeliverCenterService deliverCenterService;

    @RequestMapping(value = "/delivercenter", method = RequestMethod.POST)
    @ResponseBody
    public List<DeliverCenter> getCenterRobot(@RequestBody DeliverInfo deliverInfo) {
        return deliverCenterService.getValidCenters(deliverInfo);
    }
}

