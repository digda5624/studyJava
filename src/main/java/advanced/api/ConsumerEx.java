package advanced.api;

import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> {
            System.out.println("1");
        };
        consumer.andThen(s -> {
            System.out.println("2");
        }).andThen(s -> {
            System.out.println("3");
        }).accept("3");
    }

    public static interface InnerInterface {
        void print(String str);
    }

}
