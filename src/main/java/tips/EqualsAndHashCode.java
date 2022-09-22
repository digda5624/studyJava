package tips;

import java.util.*;

public class EqualsAndHashCode {

    /**
     * 알 수 있는 점 == 비교는 hashCode, equals 와 관련이 없다.
     * 만약 자료구조 관련하여 동등성을 부여 하고 싶다면 hashCode 를 overriding 하면서 중복 검사 가능
     * equals 를 사용해서 동등성 비교
     */
    public static void main(String[] args) {
        Example java = new Example(1L, "Java");
        Example c = new Example(2L, "C++");
        System.out.println("(java == c) = " + (java == c));
        System.out.println("java.equals(c) = " + java.equals(c));
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("c.hashCode() = " + c.hashCode());
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(java));

        // 다음은 HashMap 을 통해 HashCode의 중요성을 보인다.
        Set<Example> set = new HashSet<>();
        set.add(java);  // hashcode로 동등성을 비교하여 삽입하게 된다.
        set.add(c);     // c++ 은 저장이 되질 않는다.
        for(Example e: set){
            System.out.println(e.id + e.name);
        }

        Map<Example, String> map = new HashMap<>();
        map.put(java, "java");  // hashCode 를 통해서 같은 String 을 참조하고 있다.
        map.put(c, "c");        // 나중에 들어오는 값으로 대체 된다.

        System.out.println("map.get(java) = " + map.get(java));
        System.out.println("map.get(c) = " + map.get(c));       // hash 코드가 같아 get을 각각 해도 같은 결과가 나오게 된다.
        
    }

    public static class Example{

        Long id;
        String name;

        public Example(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            return true;
        }

        @Override
        public int hashCode() {
            return 11;
        }
    }
}
