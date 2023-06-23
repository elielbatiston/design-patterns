package com.designpatterns.command;

public class TurnOffCommand implements Command {

    private LampReceiver receiver;

    public TurnOffCommand(LampReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.turnOff();
    }
}
