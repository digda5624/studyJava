package structure.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("test1");
        set.add("test2");
        set.add("test3");

        System.out.println(set.contains("test1"));
        System.out.println(set.size());
        System.out.println(set.remove("test2"));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add("test2");

        // 물론 iterator 를 사용하지 않고 enhanced for 문을 사용해도 된다.

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            // 순서가 보장 되지 않는다.
            System.out.println(iterator.next());
        }

        for(String str: set){
            System.out.println("str = " + str);
            set.remove(str);
        }
    }
}
