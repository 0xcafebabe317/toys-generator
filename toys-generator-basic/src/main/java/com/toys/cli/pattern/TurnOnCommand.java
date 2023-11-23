package com.toys.cli.pattern;

/**
 * @author: Toys
 * @date: 2023年11月23 12:35
 **/
public class TurnOnCommand implements Command {

    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
