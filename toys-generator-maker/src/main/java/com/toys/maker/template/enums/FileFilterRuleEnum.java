package com.toys.maker.template.enums;

import cn.hutool.core.util.ObjectUtil;

/**
 * 文件过滤规则枚举
 * @author: Toys
 * @date: 2023年12月28 16:09
 **/
public enum FileFilterRuleEnum {

    CONTAINS("包含", "contains"),
    STARTS_WITH("前缀匹配", "startWith"),
    END_WITH("后缀匹配", "endWith"),
    REGEX("正则", "regex"),
    EQUALS("相等", "equals");

    private final String text;

    private final String value;

    FileFilterRuleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    // 根据value值获取枚举类
    public static FileFilterRuleEnum getEnumByValue(String value){
        if(ObjectUtil.isEmpty(value)){
            return  null;
        }
        for(FileFilterRuleEnum anEnum : FileFilterRuleEnum.values()){
            if(anEnum.value.equals(value)){
                return anEnum;
            }
        }
        return null;
    }

}
