package structure;

/**
 * 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
 * 메소드의 결과 값이 자기 자신에게 바로 반영된다고 생각하자
 */
public class StringBufferEx {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println("result = " + result);

        /**
         * 물론 String 을 사용해도 똑같은 결과를 도출할 수 있다. 하지만 메모리 동작방식이 다르다
         * 3개의 append 연산동안 StringBuffer 는 단 하나만 생성된다.
         * 하지만 String 자료형의 경우 java 에서 자동으로 새로운 객체를 만들어 낸다.
         * 이렇게 값을 변경 할 수 없는 것, 즉 setter 가 존재하지 않는 것을 immutable 하다고 한다.
         *
         * 그러면 StringBuffer 가 항상 좋은가?
         * StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다. 메모리 사용량도 많고 속도도 느리다
         * 딸라서 문자열 추가나 변경들의 작업이 많을 경우에는 StringBuffer를, 그렇지 않다면 String 을 사용하는
         * 편이 좋다.
         */

        /**
         * StringBuilder 또한 존재하는데 StringBuffer 는 thread-safe, StringBuilder는 thread-safe하지 않다
         * 따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer 보다는 StringBuilder를 사용하는 것이 유리
         */
    }

    public void stringBufferMethod(){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello Java!");

        // insert -> 특정 위치에 원하는 문자열을 삽입
        sb.insert(0, "hi! ");
        System.out.println(sb.toString());

        // substring -> String 자료형과 동일
        String substring = sb.substring(0, 3);
    }

}
