package grammer.thread;

/**
 * 멀티 스레드는 동시성(Concurrency) 혹은 병렬성(Parallelism) 으로 실행된다.
 * 동시성은 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아가며 실행하는 성질을 말한다.
 * 병렬성은 멀티 작업을 위해 멀티 코어에서 개별 스레드를 동시에 실행하는 성질을 말한다.
 *
 * 싱글코어 CPU를 이용한 멀티 스레드 작업은 병렬적으로 실행되는 것처럼 보이지만, 사실은
 * 번갈아가며 실행하는 동시성 작업이다.
 *
 * 따라서 스레드 갯수 > 코어 수 이면 스레드를 어떤 순서에 의해 동시성으로 실행 할 것인가?
 */
public class ThreadPriority {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i ++){
            PriorityThread thread = new PriorityThread(String.valueOf(i));
            if(i == 10) {
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }

            thread.start();

        }
    }

    static class PriorityThread extends Thread {

        public PriorityThread(String name) {
            setName(name);
        }

        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("진행" + thread.getName());
        }
    }
}
