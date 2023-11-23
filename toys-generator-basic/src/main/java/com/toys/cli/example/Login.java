package com.toys.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/**
 * @author: Toys
 * @date: 2023年11月22 23:05
 **/
public class Login implements Callable<Integer> {

    @Option(names = {"-u", "--user"}, description = "username", arity = "0..1", interactive = true, prompt = "please enter username:")
    String user;

    // 交互使用 interactive = true, prompt 会提示用户输入, arity 可以指定添加几个参数
    @Option(names = {"-p", "--password"}, description = "password", arity = "0..1", interactive = true, prompt = "please enter password:")
    String password;

    @Option(names = {"-cp", "--checkPassword"}, description = "check password", arity = "0..1", interactive = true, prompt = "please enter password again:")
    String checkPassword;

    @Override
    public Integer call() throws Exception {
        System.out.println("username = " + user);
        System.out.println("password = " + password);
        System.out.println("checkPassword = " + checkPassword);
        return 0;
    }

    public static void main(String[] args) {

        new CommandLine(new Login()).execute();
    }
}
