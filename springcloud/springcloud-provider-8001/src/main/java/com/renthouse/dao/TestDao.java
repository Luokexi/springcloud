package com.renthouse.dao;


import com.renthouse.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestDao {

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
    Test queryTestById(@Param("id") Long id);

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
    boolean deleteTestById(@Param("id")Long id);

    /**
     * 修改一个测试
     * @param id
     * @return
     */
    Test modifyTestById(@Param("id")Long id);
}
