package com.designpatterns.command;

import java.util.Arrays;
import java.util.List;

public class MainCommand {

    public static void main(String[] args) {
        try {
            MainCommand.invoker("turnon");
            MainCommand.invoker("turnoff");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void invoker(String commandToExecute) throws Exception {
        List<Class<?>> commands = Arrays.asList(TurnOnCommand.class, TurnOffCommand.class);

        float similar = 0;
        Class<?> finalCommand = null;
        for (Class<?> command: commands) {
            float percent = SimilarHelper.similarText(commandToExecute, command.getName());
            if (percent > similar && percent > 20) {
                similar = percent;
                finalCommand = command;
            }
        }

        if (finalCommand == null) {
            throw new Exception("Command not found");
        }

        LampReceiver receiver = new LampReceiver();
        Command command = (Command) finalCommand.getDeclaredConstructor(LampReceiver.class).newInstance(receiver);
        command.execute();
    }
}
