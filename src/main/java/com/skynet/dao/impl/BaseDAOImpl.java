package com.skynet.dao.impl;

import com.skynet.dao.BaseDAO;
import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Scope("prototype")
public class BaseDAOImpl implements BaseDAO {

    private HibernateTemplate ht;

    public HibernateTemplate getHt() {
        ht.setCacheQueries(true);
        ht.getSessionFactory().getCurrentSession().setHibernateFlushMode(FlushMode.AUTO);
        return ht;
    }

    @Autowired
    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    @Override
    public boolean add(Object o) {
        try {
            this.getHt().save(o);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Object o) {
        try {
            this.getHt().delete(o);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Object o) {
        try {
            this.getHt().update(o);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List find(Object o) {
        return this.getHt().findByExample(o);
    }
}
