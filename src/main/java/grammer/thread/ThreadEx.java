package grammer.thread;

import static java.lang.Thread.sleep;

public class ThreadEx {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        task.start();
        /**
         * main 에서 예외 발생시 sub Thread 또한 종료
         */
//        throw new Exception("");

//        try {
//            throw new RuntimeException();
//        } catch (Exception e){
//
//        }
        System.out.println("main Thread End");
    }

    static class Task extends Thread {

        public Task() {
            // 스레드 이름 커스터마이징 가능
            setName("Custom Thread");
        }

        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("thread.getName() = " + thread.getName());

            /**
             * subThread 에서의 예외는 main 에 영향을 미치지 않는다.
             */
//            throw new RuntimeException();
        }
    }

}
