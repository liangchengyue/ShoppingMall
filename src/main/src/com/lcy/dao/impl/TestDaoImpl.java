package com.lcy.dao.impl;

import com.lcy.dao.TestDao;
import com.lcy.pojo.Test;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public void addTest(Test test) {
        sessionFactory.getCurrentSession().save(test);
    }

    public List<Test> getList() {
        return sessionFactory.getCurrentSession().createQuery("from Test").list();
    }
}
