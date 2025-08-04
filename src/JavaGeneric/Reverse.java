package JavaGeneric;

public class Reverse<T> implements Transformer<String> {
    public String transform(String t) {
        return new StringBuilder(t).reverse().toString();
    }
}
