package structure;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, MyClass> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map.put("test", new MyClass("Java"));
        map2.put("test", 3);
        Integer num = map2.get("test");
        num += 1;
        MyClass test = map.get("test");
        test.setMyString("hahaha");
    }

    private static class MyClass {
        String myString;

        public MyClass(String myString) {
            this.myString = myString;
        }

        public String getMyString() {
            return myString;
        }

        public void setMyString(String myString) {
            this.myString = myString;
        }
    }
}
