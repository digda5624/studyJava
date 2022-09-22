package structure.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * List 컬랙션 종류 ArrayList, Vector, LinkedList
 */
public class ListEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // list 삽입
        list.add("a");
        list.add("b");
        list.add(1, "c");
        // a, c, b 순으로 지정
        list.forEach(System.out::println);

        // 조회
        String s = list.get(0);
        System.out.println("s = " + s);

        // 삭제
        list.remove("a");
        list.remove(0);
        list.forEach(System.out::println);

        listMethod();
        danger();
    }

    public static void listMethod(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(1, "c");

        // contains()
        System.out.println(list.contains("a"));

        // isEmpty()
        System.out.println(list.isEmpty());

        // size()
        System.out.println(list.size());

        // remove()
        list.remove(1);
        list.remove("a");
        System.out.println(list.toString());

        // clear() 모든 객체 삭제
        list.clear();
        System.out.println(list.toString());
    }


    /**
     * 참조를 사용할 경우 조심해야 한다.
     */
    public static void danger(){
        List<MyClass> list = new ArrayList<>();
        MyClass test = new MyClass("test");
        list.add(test);
        list.add(test);
        test.setStr("diff");
        test.getStr();
    }

    private static class MyClass {

        public MyClass(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        String str;
    }
}
