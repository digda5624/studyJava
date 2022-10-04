package grammer.thread;

public class RunnableEx {

    public static void main(String[] args) {
        Task task = new Task();
        Thread main = Thread.currentThread();
        System.out.println("main.getName() = " + main.getName());
        Thread sub = new Thread(task);
        // 템플릿 패턴을 사용하고 있군...
        sub.start();

        // 하지만 대부분 익명 객체 사용 Runnable interface 넣어서 해결 해야하기 때문
        Thread sub2 = new Thread(() -> {
            Thread thread = Thread.currentThread();
            System.out.println("sub2.getName() = " + thread.getName());
        });

        sub2.start();
    }


    static class Task implements Runnable {

        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("sub.getName() = " + thread.getName());
        }
    }

}
