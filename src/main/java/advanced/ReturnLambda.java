package advanced;

import tips.ListToArray;

public class ReturnLambda {

    public static void main(String[] args) {
        // 리턴 값이 있을 경우 { return x + y } 가 아닌 x + y; 로 대체가 가능하다.
        ReturnInterface returnInterface = (x, y) -> x + y;
        String result = returnInterface.append("Hello ", "Java!");
        System.out.println(result);
        ListToArray listToArray = new ListToArray();

    }

    @FunctionalInterface
    public interface ReturnInterface {
        String append(String x, String y);
    }
}
