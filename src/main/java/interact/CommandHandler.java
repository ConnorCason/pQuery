package interact;

public class CommandHandler {

    public CommandHandler() {
        // nah
    }

    public void fetch() {
        
    }

    public void help() {

        System.out.println("You have no available commands lol");
    }

    public void invalid(String res) {
        if (res == "exit" || res == "q") {
            System.out.println("Type 'quit' to shut down pQuery");
        }
        else {
            System.out.println("'"+res+"' is not a valid command");
        }
    }
}
