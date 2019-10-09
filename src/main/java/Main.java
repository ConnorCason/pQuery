import interact.Reader;

public class Main {

    public static void main(String args[]) {
        System.out.println();
        System.out.println("Welcome to pQuery");
        System.out.println();
        System.out.println("To get started, type 'help'");
        Reader r = new Reader();
        r.read();
        System.out.println("Shutting down pQuery...");
    }
}
