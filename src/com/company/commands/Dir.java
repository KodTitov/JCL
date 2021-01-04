package com.company.commands;

import com.company.interfaces.Command;

import java.io.File;

public class Dir implements Command {
    @Override
    public String command(String s) {
        File dir = new File(s);

        if(dir.listFiles() == null) {
            return "";
        }

        for(File f: dir.listFiles()) {
            System.out.println(f.getName());
        }

        return null;
    }
}
