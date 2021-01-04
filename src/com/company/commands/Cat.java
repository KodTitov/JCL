package com.company.commands;

import com.company.interfaces.Command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat implements Command {
    @Override
    public String command(String s) throws FileNotFoundException {
        Scanner in = new Scanner(new File(s));
        String line;

        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }

        return null;
    }
}
