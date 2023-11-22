package com.toys.model;

import lombok.Data;

/**
 * 静态模板配置
 * @author: Toys
 * @date: 2023年11月22 13:02
 **/
@Data
public class MainTemplateConfig {

    /**
     * 作者
     */
    private String author = "toys";

    /**
     * 输出描述
     */
    private String outputText = "输出结果：";

    /**
     * 是否循环（开关）
     */
    private boolean loop = false;
}
