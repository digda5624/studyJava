package grammer.generic;

public class Generic <T> {

    private T value;

    public <T, K> T method(T a, K b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return a;
    }

    public Generic(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Generic<String> generic = new Generic<>("abc");

        Long method = generic.method(3L, "B");

    }
}
