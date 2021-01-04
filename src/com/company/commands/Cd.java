package com.company.commands;

import com.company.interfaces.Command;

import java.io.File;

public class Cd implements Command {
    @Override
    public String command(String s) {
        String path = s;
        Dir dir = new Dir();
        dir.command(path);
        return new File(path).getAbsolutePath();
    }
}
