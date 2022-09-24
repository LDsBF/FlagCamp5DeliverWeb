package com.laioffer.onlineorder.dao;

import com.laioffer.onlineorder.entity.DeliverCenter;
import com.laioffer.onlineorder.entity.DeliverInfo;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DeliverCenterDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<DeliverCenter> getAllValidCenters(DeliverInfo deliverInfo) {
        // TODO
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<DeliverCenter> criteria = builder.createQuery(DeliverCenter.class);
            criteria.from(DeliverCenter.class);
            return session.createQuery(criteria).getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new ArrayList<>();
    }
}
