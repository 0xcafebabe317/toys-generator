package com.toys.maker.model;

import lombok.Data;

/**
 * 动态模板配置
 **/
@Data
public class DataModel {

    /**
     * 作者
     */
    private String author = "toys";

    /**
     * 输出描述
     */
    private String outputText = "sum = ";

    /**
     * 是否循环
     */
    private boolean loop;
}
