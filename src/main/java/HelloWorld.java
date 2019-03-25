import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public HelloWorld() {
    }

    public String greeting() {
        return "Hello world";
    }

    public int count(String words) {
        String[] separateWords = StringUtils.split(words, ' ');
        return(separateWords == null) ? 0 : separateWords.length;
    }
}
