package com.toys.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.toys.model.MainTemplateConfig;
import picocli.CommandLine.Command;

import java.lang.reflect.Field;

/**
 * @author: Toys
 * @date: 2023年11月23 16:10
 **/
@Command(name = "config",mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {

    @Override
    public void run() {
        Field[] fields = ReflectUtil.getFields(MainTemplateConfig.class);
        for (Field field : fields) {
            System.out.println("字段类型: " + field.getType());
            System.out.println("字段名称: " + field.getName());
            System.out.println("---");
        }

    }
}
