package interact;

import java.util.Scanner;

public class Reader {
    Scanner cmdScanner;
    CommandHandler cmdHandler;

    public Reader() {
        cmdScanner = new Scanner(System.in);
        cmdHandler = new CommandHandler();
    }

    public void read() {
        Reader reader = new Reader();
        boolean quit = false;
        while(!quit) {
            System.out.print(">");
            String response = reader.cmdScanner.next();
            switch (response) {
                case "fetch":
                    cmdHandler.fetch();
                case "help":
                    cmdHandler.help();
                    break;
                case "quit":
                    quit = true;
                    break;
                default:
                    cmdHandler.invalid(response);
            }
        }
    }
}
