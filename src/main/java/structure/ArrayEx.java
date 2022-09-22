package structure;

public class ArrayEx {

    public static void main(String[] args) {
        // 배열 선언 방법 자료형 [] 사용
        MyClass[] myClasses = {new MyClass("test1"), new MyClass("test2")};
        MyClass[] myArray = new MyClass[3];
        System.out.println("myArray = " + myArray);
    }

    private static class MyClass {
        String a;
        public MyClass(String a) {
            this.a = a;
        }
    }
}
