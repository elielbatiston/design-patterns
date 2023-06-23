package com.designpatterns.command;

public class TurnOnCommand implements Command {

    private LampReceiver receiver;

    public TurnOnCommand(LampReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.turnOn();
    }
}
