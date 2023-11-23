package com.toys.generator;

import com.toys.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author: Toys
 * @date: 2023年11月22 13:40
 **/
public class MainGenerator {
    public static void doGenerate(Object object) throws TemplateException, IOException {
        // 1、静态文件生成
        String projectPath = System.getProperty("user.dir");
        // 输入路径
        String inputPath = new File(projectPath).getParent() + File.separator+"toys-generator-demo-projects"+File.separator+"acm-template";
        // 输出路径
        String outputPath = projectPath;
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);

        // 2、动态文件生成
        String dynamicInputPath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/toys/acm/MainTemplate.java";

        DynamicGenerator.doGenerator(dynamicInputPath,dynamicOutputPath,object);

    }
}
