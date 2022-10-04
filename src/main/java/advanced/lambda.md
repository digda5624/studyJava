# 람다식

java 에서 람다는 다음과 같이 변환 된다.

람다식 -> 매개 변수를 가진 코드 블록 -> 익명 구현 객체

따라서 람다식의 형태는 매개 변수를 가진 코드 블록이지만, 런타임 시에는 익명 구현 객체를 생성한다.

🖥 Runnable을 통한 람다식 사용
```java
public class Main{
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("익명 객체 사용");
            }
        };
        
        runnable = () -> {
            System.out.println("람다식 사용");
        };
    }
}
```

## 람다식 기본 문법
(타입 매개변수, ...) -> { 실행문; ... }

형태이다.

람다식의 형태는 매개변수를 가진 코드 블록이기 때문에 마치 자바의 매서드를 선언하는 것처럼 보여진다.
자바는 메서드를 단독으로 선언할 수 없고 항상 클래스의 구성 멤버로 선언하기 때문에 람다식은 단순히 메서드를 선언하는 것이 아니라

⭐ 메서드를 가지고 있는 객체를 생성한다. ⭐

1. 오로지 하나의 메서드를 가진 인터페이스만 구체화가 가능하다.
2. @FunctionalInterface 를 사용하여 메서드 체킹이 가능하다.
3. 두 개 이상의 추상 메서드를 선언하면 안된다.

## 매개 변수를 가지는 람다식

매개 변수가 있고 리턴 값이 있는 람다식을 만들어 보고 사용해 보자

🖥 매개 변수를 가지는 람다식
```java
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
```

## 리턴 값이 있는 람다식

리턴 값이 있는 람다식을 살펴보자

🖥 리턴 값이 있는 람다식
```java
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
```

## 람다식 주의 사항

람다식은 외부 로컬 변수에 대한 수정이 불가능 하다. 또한 this를 사용할 때 주의 해야한다.

코드로 살펴보자

🖥 주의 사항
```java
public class LambdaCaution {
    String java = "java";

    public class InnerClass{
        String c = "c";

        public void method(){
            String temp = "temp";

            Lambda lambda = () -> {
                System.out.println(c);
                // java 에 접근하기 위해서는 InnerClass 가 non-static 이거나 java가 static이여야 한다.
                System.out.println(java);

                System.out.println(this.c);
                System.out.println(LambdaCaution.this.java);
//                System.out.println(LambdaCaution.java);

                // 외부 로컬 변수의 수정은 불가능 하다.
//                temp = "dfd";
            };
        }
    }
    interface Lambda {
        void lambda();
    }
}
```

## java 에서 제공하는 
