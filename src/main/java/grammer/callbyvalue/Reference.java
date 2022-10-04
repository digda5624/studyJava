package grammer.callbyvalue;

/**
 * JAVA 는 call By value 이다.
 * 주소값을 복사해서 사용하게 된다.
 * 따라서 메서드를 통해 assign 하는 것은 바깥 객체에 영향을 미칠 수 없다.
 */
public class Reference {

    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(3);

        int a = 1;
        int b = 3;
        a1.change(a, b);
        System.out.println("a = " + a);

        System.out.println("a1.hashCode() = " + a1.hashCode());
        a1.change(a1, a2);
        System.out.println("a1 = " + a1.num);
        System.out.println("a2 = " + a2.num);
    }

    static class A {

        public int num;

        public A(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void change(int a, int b){
            a = b;
        }

        public void change(A a, A b){
            System.out.println("a.getClass() = " + a.hashCode());
            a = b;
            System.out.println("a.getClass() = " + a.hashCode());
        }
    }

}
