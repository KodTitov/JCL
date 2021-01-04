package com.company.commands;

public class Help {
    public String helpInfo() {
        return "Командная оболчка Java Command Line \n" +
                "Cписок поддерживаемых команд: \n" +
                "dir - Выводит список файлов в текущей директории \n" +
                "cd путь - перейти  директорию \n" +
                "pwd - вывести полный путь до текущей директории \n" +
                "cat имя файла - выводит содержимое текстового документа \n" +
                "help - выводит эту справку \n" +
                "exit - Выход \n";
    }
}
