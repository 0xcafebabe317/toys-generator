package com.toys.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.toys.generator.MainGenerator;
import com.toys.model.MainTemplateConfig;
import freemarker.template.TemplateException;
import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.IOException;
import java.util.concurrent.Callable;

/**
 * @author: Toys
 * @date: 2023年11月23 16:09
 **/
@Command(name = "generate", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    /**
     * 作者
     */
    @Option(names = {"-a", "--author"}, description = "作者名称:", arity = "0..1", interactive = true)
    private String author = "toys";

    /**
     * 输出描述
     */
    @Option(names = {"-o", "--outputText"}, description = "输出文本:", arity = "0..1", interactive = true)
    private String outputText = "输出结果：";

    /**
     * 是否循环（开关）
     */
    @Option(names = {"-l", "--loop"}, description = "是否循环:", arity = "0..1", interactive = true)
    private boolean loop = false;

    @Override
    public Integer call() throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
