package encryptdecrypt;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}

class Application<T extends Throwable> {

    public static void main(String[] args) {

        Application<RuntimeException> application = new Application<>();
        application.secureRun(() -> System.out.println("Hello!"));

    }

    public void secureRun(Runnable runnable) throws T {
        try {
            runnable.run();
        } catch (T e) {
            System.err.print("Error!");
        }
    }

}