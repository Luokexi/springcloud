package com.renthouse.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 测试类
 * @Data 生成set，get euqals，等方法
 * @NoArgsConstructor 提供无参构造
 * @Accessors set属性值时支持链式调用
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Test implements Serializable {

    private Long id;
    private String dbName;
    private String dbSource;

    public Test(String dbName) {
        this.dbName = dbName;
    }
}
