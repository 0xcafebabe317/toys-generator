package com.toys.generator;

import com.toys.model.MainTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author: Toys
 * @date: 2023年11月22 13:12
 **/
public class DynamicGenerator {
    public static void main(String[] args) throws IOException, TemplateException {
        String projectPath = System.getProperty("user.dir") + File.separator + "toys-generator-basic";
        String inputPath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputPath = projectPath + File.separator + "MainTemplate.java";

        // 数据模型
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("toys");
        mainTemplateConfig.setOutputText("输出结果为:");
        mainTemplateConfig.setLoop(true);

        doGenerator(inputPath,outputPath,mainTemplateConfig);
    }

    public static void doGenerator(String inputPath, String outputPath,Object model) throws IOException, TemplateException {
        // new 出 Configuration 对象，参数为版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);

        // 指定模板文件所在的路径
        File templateFile = new File(inputPath).getParentFile();
       configuration.setDirectoryForTemplateLoading(templateFile);

        // 设置模板文件的字符集
        configuration.setDefaultEncoding("utf-8");
        configuration.setNumberFormat("0.######");

        // 创建模板对象，加载指定模板
        String templateName = new File(inputPath).getName();
        Template template = configuration.getTemplate(templateName);

        Writer out = new FileWriter(outputPath);

        template. process(model,out);

        // 生成文件后关闭
        out.close();
    }
}
