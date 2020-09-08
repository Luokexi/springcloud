package com.renthouse.controller;

import com.renthouse.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController("consumer")
public class TestController {

    /** 前缀 **/
    private static final String REST_PREFIX = "http://loaclhost:8001";

    // 提供远程访问HTTP的方法
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查询所有测试信息
     * @return
     */
    @GetMapping("test/list")
    public List<Test> queryAll(){
        return restTemplate.getForObject(REST_PREFIX+"/test/list",List.class);
    }
}
