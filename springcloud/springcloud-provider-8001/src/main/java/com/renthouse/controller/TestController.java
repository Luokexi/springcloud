package com.renthouse.controller;


import com.renthouse.pojo.Test;
import com.renthouse.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("test/list")
    public List<Test> queryAll(){
        return testService.queryAllTest();
    }

    /**
     * 根据id查询测试信息
     * @param id
     * @return
     */
    @GetMapping("test/get/{id}")
    public Test queryTestById(@PathVariable("id")Long id){
        return testService.queryTestById(id);
    }

    /**
     * 新增测试信息
     * @param test
     * @return
     */
    @GetMapping("test/add")
    public Boolean addTest(Test test){
        return testService.addTest(test);
    }

    /**
     * 根据id删除测试信息
     * @param id
     * @return
     */
    @GetMapping("test/delete/{id}")
    public Boolean deleteTest(@PathVariable("id")Long id){
        return testService.deleteTestById(id);
    }
}
