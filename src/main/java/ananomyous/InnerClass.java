package ananomyous;

public class InnerClass {

    private String outerStr = "outerStr";

    public void method(){

        outerStr = "dfd";
        String abc = "abc";

        class Local {
            String a;

            public void m(){
                System.out.println("Local 클래스 메서드 m 사용");
                System.out.println(outerStr);
                outerStr = "fdf";
                System.out.println(a);
                // 안에서 수정 불가능 -> 따라서 람다식에서도 수정 불가능 읽기는 가능
//                abc = "tet";
            }
        }

        Local local = new Local();
        local.m();
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.method();
    }
}
