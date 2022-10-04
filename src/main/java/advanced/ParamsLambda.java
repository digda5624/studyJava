package advanced;

public class ParamsLambda {

    public static void main(String[] args) {
        ParamInterface lambda = (String str) -> {
            System.out.println(str);
        };

        lambda.oneParam("ParamInterface 의 oneParam 실행");

        // 매개변수에 타입을 지정해도 되고 안해도 된다.
        ParamTwo paramTwo = (Integer x, Integer y) -> {
            System.out.println(x + y);
        };

        // 하나만 지정하고 다른 하나는 지정 안 할 수는 없다.
        ParamTwo paramTwo1 = (x, y) -> {
            System.out.println(x - y);
        };

        paramTwo.twoParam(1, 2);
        paramTwo1.twoParam(65, 3);
    }

    public interface ParamInterface {
        void oneParam(String str);
    }

    @FunctionalInterface
    public interface ParamTwo {
        void twoParam(Integer x, Integer y);
    }

}
