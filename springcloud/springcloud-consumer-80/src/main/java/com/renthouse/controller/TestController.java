package com.renthouse.controller;

import com.renthouse.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RestController
public class TestController {

    /** 前缀 **/
    private static final String REST_PREFIX = "http://localhost:8001";

    // 提供远程访问HTTP的方法
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查询所有测试信息
     * @return
     */
    @RequestMapping("/consumer/list")
    public List<Test> queryAll(){
        return restTemplate.getForObject(REST_PREFIX+"/test/list",List.class);
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/consumer/get{id}")
    public Test getTestById(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_PREFIX+"/test/get/"+id,Test.class);
    }
}
