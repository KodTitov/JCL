package com.company.commands;

public class Exit {
    private boolean exit;

    public Exit(boolean exit) {
        this.exit = exit;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }
}
