package com.toys.model;

import lombok.Data;

/**
 * 数据模型
 */
@Data
public class DataModel {

    /**
    * 是否生成循环
    */
    private boolean loop = false;

    /**
    * 作者注释
    */
    private String author = "toys";

    /**
    * 输出信息
    */
    private String outputText = "sum=";
}
