package com.toys.cli.pattern;

/**
 * @author: Toys
 * @date: 2023年11月23 12:36
 **/
public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " turn on");
    }

    public void turnOff() {
        System.out.println(name + " turn off");
    }
}
