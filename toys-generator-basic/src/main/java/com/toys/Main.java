package com.toys;

import com.toys.cli.CommandExecutor;

/**
 * @author: Toys
 * @date: 2023年11月21 23:01
 **/
public class Main {
    public static void main(String[] args) {
        // args = new String[]{"generate", "-l", "-a", "-o"};
        // args = new String[]{"config"};
        //args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecutor(args);
    }
}
