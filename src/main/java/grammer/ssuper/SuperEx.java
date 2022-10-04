package grammer.ssuper;

public class SuperEx {

    static class Parent {

        String name;

        public Parent(String name) {
            this.name = name;
        }
    }

    static class Child extends Parent {

        public Child(String name) {
            // 부모에 기본 생성자가 없다면 명시적으로 super 를 통해 부모생성자를 호출해주어야한다.
            super(name);
        }
    }
}
