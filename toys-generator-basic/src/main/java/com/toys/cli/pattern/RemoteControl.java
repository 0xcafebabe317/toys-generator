package com.toys.cli.pattern;

/**
 * @author: Toys
 * @date: 2023年11月23 12:37
 **/
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
