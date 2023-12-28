package com.toys.maker.template.model;

import lombok.Data;
import picocli.CommandLine;

import java.util.List;


/**
 * 模型配置
 * @author: Toys
 * @date: 2023年12月28 16:04
 **/
@Data
public class TemplateMakerModelConfig {

    private List<ModelInfoConfig> models;

    private ModelGroupConfig modelGroupConfig;

    @Data
    public static class ModelInfoConfig {

        private String fieldName;

        private String type;

        private String description;

        private String defaultValue;

        private String abbr;

        // 用于替换哪些文本
        private String replaceText;
    }

    @Data
    public static class ModelGroupConfig {

        private String condition;

        private String groupName;

        private String groupKey;
    }


}
