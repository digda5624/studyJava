package advanced.lambda;

/**
 * 람다는 매개 변수를 가진 코드 블록이지만, 런타임 시에는 익명 구현 객체를 생성한다.
 * 람다식 -> 매개 변수를 가진 코드 블록 -> 익명 구현 객체
 *
 * 람다식은 (매개변수) -> {실행 코드} 형태로 작성, 마치 함수 정의 형태를 띠고 있지만
 * 런타임 시에 인터페이스의 익명 구현 객체로 생성된다.
 */
public class Lambda {

    public static void main(String[] args) {
        // 익명 구현 객체
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        };

        // 람다식을 사용
        runnable = () -> {
            System.out.println("run");
        };

        MyInterFace InterfaceForLambda = () -> {
            System.out.println("인터페이스 실행");
        };

        InterfaceForLambda.lambda();
        InterfaceForLambda.fun();


        // 추상 클래스에서는 람다식 사용이 불가능 하다.
//        MyAbstractClass abstractClassForLambda = () -> {
//            System.out.println("추상 클래스 실행");
//        }

        // 추상 클래스에서는 다음과 같이 익명 객체를 사용해야 한다.
        MyAbstractClass abstractClass = new MyAbstractClass(){
            @Override
            public void lambda(){
                System.out.println("추상 클래스 실행");
            }
        };

    }

    //@FunctionalInterface
    public interface MyInterFace {
        void lambda();

        // default 는 상관 없다.
        default void fun(){
            System.out.println("fdfd");
        }
    }

    public static abstract class MyAbstractClass{
        String abstractStr;

        public abstract void lambda();
    }
}
