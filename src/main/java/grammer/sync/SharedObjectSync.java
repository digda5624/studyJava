package grammer.sync;

public class SharedObjectSync {
    private int number = 0;

    public SharedObjectSync(int number) {
        this.number = number;
    }

    public SharedObjectSync() {}

    public int getNumber() {
        return number;
    }

    // 임계영역임을 명시하여 동기화 메소드를 실행하는 즉시 객체는 잠금이 일어나게 된다. 다른 동기화 메서드들에게 또한 접근 할 수 없다.
//    public synchronized void setNumber(int number) {
    public void setNumber(int number) throws InterruptedException {

        System.out.println("싱크전에 내용 number : " + this.number);

        // 이 블록이 critical section 임을 명시한다.
        synchronized (this) {
            this.number = number;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }

            System.out.println("ThreadName() : " + Thread.currentThread().getName() + "num : " + this.number);
        }
    }

    public void update(int number){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println("this.number = " + this.number);
        this.number = number;
    }
}
