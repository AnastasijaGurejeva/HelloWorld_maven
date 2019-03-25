public class Main {

    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld();
        System.out.println(hello.greeting());
        int count = hello.count("Hello world");
        System.out.println("Word count: " + count);

    }
}
