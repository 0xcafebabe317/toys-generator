package com.toys.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

/**
 * @author: Toys
 * @date: 2023年11月22 23:05
 **/
public class Login implements Callable<Integer> {

    @Option(names = {"-u", "--user"}, description = "username",arity = "0..1",interactive = true,prompt = "please enter username:")
    String user;

    // 交互使用 interactive = true, prompt 会提示用户输入, arity 可以指定添加几个参数
    @Option(names = {"-p", "--password"}, description = "password", arity = "0..1", interactive = true, prompt = "please enter password:")
    String password;

    @Option(names = {"-cp", "--checkPassword"}, description = "check password", interactive = true, prompt = "please enter password again:")
    String checkPassword;

    @Override
    public Integer call() throws Exception {
        System.out.println("password = " + password);
        System.out.println("checkPassword = " + checkPassword);
        return 0;
    }

    public static void main(String[] args) {
        new CommandLine(new Login()).execute("-u", "-p","-cp");
    }
}
