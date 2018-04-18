package com.lcy.service.impl;

import com.lcy.dao.TestDao;
import com.lcy.dao.impl.TestDaoImpl;
import com.lcy.pojo.Test;
import com.lcy.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    public void addTest(Test test) {
        testDao.addTest(test);
    }

    public List<Test> getList() {
        return testDao.getList();
    }
}
