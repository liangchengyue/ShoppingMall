package com.lcy.dao;

import com.lcy.pojo.Test;

import java.util.List;

public interface TestDao {
    public void addTest(Test test);
    public List<Test> getList();
}
