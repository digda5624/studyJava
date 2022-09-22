package structure;

/**
 * 객체를 항상 주의 하자 참조로 움직인다는 것을 주목하자
 * 참조로 움직일경우 당연하게도 메서드 결과 값이 새로운 참조를 제시해 준다는 것을 알고 가자.
 */
public class StringEx {

    public static void main(String[] args) {
        StringEx stringEx = new StringEx();

        String a = "Happy Java";
        String b = "a";
        String c = "123";

        /**
         * 단 new String 형식으로 만들어도 된다. 하지만 new String으로 하게 될 경우 항상 새로운 객체를 생성한다.
         * 둘 가지 모두 heap 메모리 영역에 할당, 하지만 literal 의 경우에 String constant pool 에 할당
         */
        stringEx.seeDifference();
        stringEx.stringMethod();
    }

    public void seeDifference(){
        String literal = "aaa";
        String literal2 = "aaa";
        String newString = new String("aaa");

        // String.equals 는 문자 내용을 비교, == 은 주소값을 비교 서로 다른 결과 발생
        System.out.println(newString.equals(literal));
        System.out.println(newString == literal);
        System.out.println(literal == literal2);

        // intern 메서드를 활용하면 String constant pool에 접근한다.
        String internPool = newString.intern();
        System.out.println(literal == internPool);

        // String 자체는 불변 객체 (immutable) 하기 때문에 thread-safe 하다.
        // 불변 객체인 String을 가지고 연산을 할 때는 새롭게 문자열이 추가되는 것이 아니라 새로운 문자열 객체를 만들고
        // 그 객체를 참조하게 한다.
    }

    // 주의 할 점은 변경을 해도 본래 String 은 변동이 일어나지 않는다.
    public void stringMethod(){
        String a = "aaa";
        String b = "bbb";

        // equals() 두개의 문자열이 동일한지를 비교하여 결과 값 반환
        System.out.println(a.equals(b)); // false

        // indexOf 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴, 아스키 코드 값 지원
        // lastIndexOf 는 반대 방향에서 찾는다.
        String helloJava = "hello Java, Java";
        System.out.println(helloJava.indexOf("Java"));
        System.out.println(helloJava.indexOf("Java", 7));

        // contains() 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴
        System.out.println(a.contains("aa"));

        // charAt() 문자열에서 특정 위치의 문자(char) 를 리턴한다.
        a.charAt(2);

        // replace -> 문자열만을 교체 가능
        String replace = helloJava.replace("Java", "C++");
        System.out.println("helloJava = " + helloJava);
        System.out.println("replace = " + replace);

        // replaceAll -> 정규식을 사용가능
        String replaceAll = helloJava.replaceAll("Java", "C++");
        System.out.println("helloJava = " + helloJava);
        System.out.println("replaceAll = " + replaceAll);

        // subString -> 문자열 중 특정 문자열을 뽑아낼 때 사용
        String subString = helloJava.substring(0, 4);
        System.out.println(subString);

        // length() -> 문자열의 길이
        Integer length = helloJava.length();
        System.out.println("length = " + length);

        // toUpperCase -> toLowerCase() 또한 존재한다.
        String upperCase = helloJava.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        // split -> 문자열을 특정 구분자로 분리하는 메서드
        String[] split = helloJava.split(" ");
        for(String s: split){
            System.out.println("s = " + s);
        }

    }
}
