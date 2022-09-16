package com.laioffer.onlineorder.dao;

import com.laioffer.onlineorder.entity.DeliverCenter;
import com.laioffer.onlineorder.entity.DeliverInfo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeliverCenterDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<DeliverCenter> getAllValidCenters(DeliverInfo deliverInfo) {
        // TODO
        return null;
    }
}
