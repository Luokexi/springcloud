package com.renthouse.service;

import com.renthouse.pojo.Test;

import java.util.List;

public interface TestService {

    /**
     * 查询所有信息
     * @return
     */
    List<Test> queryAllTest();

    /**
     * 通过ID查询测试类
     * @param id
     * @return
     */
    Test queryTestById(Long id);

    /**
     * 新增一个测试
     * @param test
     * @return
     */
    boolean addTest(Test test);

    /**
     * 删除一个测试
     * @param id
     * @return
     */
    boolean deleteTestById(Long id);

    /**
     * 修改一个测试
     * @param id
     * @return
     */
    Test modifyTestById(Long id);
}
