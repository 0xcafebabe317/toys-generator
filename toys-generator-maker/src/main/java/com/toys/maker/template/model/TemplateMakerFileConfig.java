package com.toys.maker.template.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author: Toys
 * @date: 2023年12月28 16:04
 **/
@Data
public class TemplateMakerFileConfig {

    private List<FileInfoConfig> files;

    private FileGroupConfig fileGroupConfig;

    @Data
    public static class FileInfoConfig {
        private String path;

        private List<FileFilterConfig> filterConfigList;
    }

    @Data
    public static class FileGroupConfig {

        private String condition;

        private String groupName;

        private String groupKey;
    }


}
