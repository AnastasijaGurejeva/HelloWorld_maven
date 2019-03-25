import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @org.junit.jupiter.api.Test
    void greeting() {
        String hello = "Hello world";
        HelloWorld hi = new HelloWorld();
        assertEquals(hello, hi.greeting());
    }
}
