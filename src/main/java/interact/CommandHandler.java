package interact;

public class CommandHandler {

    public CommandHandler() {
        // nah
    }

    public void help() {

        System.out.println("You have no available commands lol");
    }

    public void invalid(String res) {

        System.out.println("'"+res+"' is not a valid command");
    }
    public void invalidQuit() {
        System.out.println("Type 'quit' to shut down pQuery");
    }
}
