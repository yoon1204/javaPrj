package algoPrj.day20.gpt;

class HelloWorld {
    private String message;

    public HelloWorld() {
        message = "Hello, World!";
    }

    public void showMessage() {
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.showMessage();
    }
}

