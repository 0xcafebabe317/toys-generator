package com.toys.maker.meta.enums;

/**
 * 模型类型枚举
 * @author: Toys
 * @date: 2023年12月21 15:46
 **/
public enum ModelTypeEnum {
    STRING("字符串", "String"),

    BOOLEAN("布尔值", "boolean"),

    INTEGER("整型","Integer"),

    DOUBLE("小数","double");


    private final String text;

    private final String value;

    ModelTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

}
