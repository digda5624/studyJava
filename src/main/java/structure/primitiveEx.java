package structure;

public class primitiveEx {

    public static void main(String[] args) {
        /**
         * java의 데이터 타입은 기본적으로 기본 타입(primitive) vs 참조 타입(reference)
         *
         * 이전에 살펴보았던 int, long, float, boolean, char 자료형들은 원시(primitive) 자료형이라고 한다.
         * new 키워드를 사용할 수 없다.
         *
         * java 의 기본 타입 실제 값을 변수 안에다 저장 (stack 영역에 바로 값이 들어가 있음)
         * java 의 참조 타입으로 선언된 변수는 객체의 참조를 값으로 가짐 (stack 영역에 참조값 저장, 실제 객체의 값은 heap 영역에 저장)
         */

        boolean result = true;
        char capitalC = 'C';
        int i = 100000;

        // 원시 자료형들은 대응하는 Wrapper 클래스가 존재하는데 ArrayList, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신
        // 그에 상응하는 Wrapper 클래스를 사용해야 한다.
    }
}
