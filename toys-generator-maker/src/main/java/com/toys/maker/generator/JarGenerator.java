package com.toys.maker.generator;

import java.io.*;

/**
 * @author: Toys
 * @date: 2023年12月18 17:27
 **/
public class JarGenerator {
    public static void doGenerate(String projectDir) throws IOException, InterruptedException {
        // 调用process 类执行 Maven 打包命令
        String winMavenCommand = "mvn.cmd clean package -DskipTests=true";
        String otherMavenCommand = "/usr/local/apache-maven-3.8.8/bin/mvn clean package -DskipTests=true";
        String mavenCommand = otherMavenCommand;

        ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
        processBuilder.directory(new File(projectDir));

        Process process = processBuilder.start();

        //读取命令的输出
        InputStream inputStream = process.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        int exitCode = process.waitFor();
        System.out.println("命令执行结束，退出码: " + exitCode);
    }
}
