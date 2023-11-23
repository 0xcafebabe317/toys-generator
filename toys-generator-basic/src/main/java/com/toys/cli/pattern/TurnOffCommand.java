package com.toys.cli.pattern;

/**
 * @author: Toys
 * @date: 2023年11月23 12:33
 **/
public class TurnOffCommand implements Command {

   private Device device;

   public TurnOffCommand(Device device) {
       this.device = device;
   }

    @Override
    public void execute() {
        device.turnOff();
    }
}
