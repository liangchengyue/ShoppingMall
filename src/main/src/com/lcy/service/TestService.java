package com.lcy.service;

import com.lcy.pojo.Test;

import java.util.List;

public interface TestService {
    public void addTest(Test test);
    public List<Test> getList();
}
