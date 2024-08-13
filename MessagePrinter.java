public class MessagePrinter {
    public void printMessage() {
        System.out.println("Hello, this is a message from the MessagePrinter class!");
    }

    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();
        printer.printMessage();
    }
}
