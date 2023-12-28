package com.toys.maker.template.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author: Toys
 * @date: 2023年12月28 16:02
 **/
@Data
@Builder
public class FileFilterConfig {

    /**
     * 过滤范围
     */
    private String range;

    /**
     * 过滤规则
     */
    private String rule;

    /**
     * 过滤值
     */
    private String value;
}
