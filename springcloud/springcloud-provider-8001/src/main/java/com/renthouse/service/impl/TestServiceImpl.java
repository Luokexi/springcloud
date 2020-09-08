package com.renthouse.service.impl;

import com.renthouse.pojo.Test;
import com.renthouse.dao.TestDao;
import com.renthouse.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    public List<Test> queryAllTest() {
        return testDao.queryAllTest();
    }

    public Test queryTestById(Long id) {
        // TODO 非null判断
        return testDao.queryTestById(id);
    }

    public boolean addTest(Test test) {
        // TODO 非null判断
        return testDao.addTest(test);
    }

    public boolean deleteTestById(Long id) {
        // TODO 非null判断
        return testDao.deleteTestById(id);
    }

    public Test modifyTestById(Long id) {
        // TODO 非null判断
        return testDao.modifyTestById(id);
    }
}
