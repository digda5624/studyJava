package advanced.lambda;

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
