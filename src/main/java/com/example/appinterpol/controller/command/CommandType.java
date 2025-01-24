package com.example.appinterpol.controller.command;

public enum CommandType {
    LOGIN(new LoginCommand()),
    LOGOUT(new LogoutCommand()),
    DEFAULT(new DefaultCommand());
    private Command command;
    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public static Command defineCommand(String command) {
        return CommandType.valueOf(command.toUpperCase()).getCommand(); //TODO
    }
}
