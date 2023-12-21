package com.toys.maker.generator.file;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author: Toys
 * @date: 2023年11月22 13:40
 **/
public class FileGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        // 1、静态文件生成
        String projectPath = System.getProperty("user.dir");
        // 输入路径
        String inputPath = new File(projectPath).getParent() + File.separator + "toys-generator-demo-projects" + File.separator + "acm-template";
        // 输出路径
        String outputPath = projectPath;
        StaticFileGenerator.copyFilesByHutool(inputPath, outputPath);

        // 2、动态文件生成
        String dynamicInputPath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/toys/acm/MainTemplate.java";

        DynamicFileGenerator.doGenerator(dynamicInputPath, dynamicOutputPath, model);

    }
}
