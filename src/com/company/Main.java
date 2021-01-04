package com.company;

import com.company.commands.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        File file = new File(".");
        String currentPath = file.getAbsolutePath();

        Exit e = new Exit(false);

        while (!e.isExit()) {
            System.out.print(">");
            String command = in.nextLine();

            if (command.equals("dir")) {
                Dir dir = new Dir();
                dir.command(currentPath);
            } else if (command.substring(0, 2).equals("cd")) {
                Cd cd = new Cd();
                currentPath = cd.command(command.substring(3));
            } else if (command.substring(0, 3).equals("pwd")) {
                Pwd pwd = new Pwd();
                pwd.command(currentPath);
            } else if (command.substring(0, 3).equals("cat")) {
                Cat cat = new Cat();
                String s = command.substring(4);
                cat.command(s);
            } else if (command.substring(0, 4).equals("help")) {
                Help help = new Help();
                System.out.println(help.helpInfo());
            } else if (command.substring(0, 4).equals("exit")) {
                e.setExit(true);
            } else {
                System.out.println("Команда " + command + " не поддерживаеся");
            }
        }
    }
}

