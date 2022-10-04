package structure;

public class Final {

    public static class FinalClass {
        final int a;
        int b;

        public FinalClass(int a, int b) {
            this.a = a;
            this.b = b;
        }

        // a 로는 setter 를 만들 수 없다.
//        public void modifyA(){
//            a = 1;
//        }
    }

    public static void main(String[] args) {

    }
}
