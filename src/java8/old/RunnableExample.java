package java8.old;

public class RunnableExample {

    static Runnable helloWorldPrinter = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello world !");
        }
    };

    public static void main(String[] args){
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }
}
