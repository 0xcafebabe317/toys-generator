package com.toys.generator;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class MainGenerator {
    public static void doGenerate(Object model) throws TemplateException, IOException {

        String inputRootPath = "/Users/tiscy/Desktop/code/java/toys-generator/toys-generator-demo-projects/acm-template-pro";
        String outputRootPath = "/Users/tiscy/Desktop/code/java/toys-generator";

        String inputPath;
        String outputPath;

        inputPath = new File(inputRootPath,"src/main/resources/templates/MainTemplate.java.ftl").getAbsolutePath();
        outputPath = new File(outputRootPath,"src/main/resources/templates/MainTemplate.java").getAbsolutePath();
        DynamicGenerator.doGenerator(inputPath,outputPath,model);

        inputPath = new File(inputRootPath,".gitignore").getAbsolutePath();
        outputPath = new File(outputRootPath,"gitignore").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);

        inputPath = new File(inputRootPath,"README.md").getAbsolutePath();
        outputPath = new File(outputRootPath,"README.md ").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);
    }
}
