package com.laioffer.onlineorder.service;

import com.laioffer.onlineorder.dao.DeliverCenterDao;
import com.laioffer.onlineorder.entity.DeliverCenter;
import com.laioffer.onlineorder.entity.DeliverInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliverCenterService {
    @Autowired
    private DeliverCenterDao deliverCenterDao;

    public List<DeliverCenter> getValidCenters(DeliverInfo deliverInfo) {
        return deliverCenterDao.getAllValidCenters(deliverInfo);
    }
}
