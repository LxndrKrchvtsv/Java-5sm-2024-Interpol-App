package com.example.appinterpol.controller.command;

import jakarta.servlet.http.HttpServletRequest;

public class LogoutCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return null;
    }
}
