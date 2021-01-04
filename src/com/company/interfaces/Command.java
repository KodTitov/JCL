package com.company.interfaces;

import java.io.FileNotFoundException;

public interface Command {
    String command(String s) throws FileNotFoundException;
}
