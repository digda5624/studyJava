package grammer.sync;

/**
 * 공유 객체를 사용할 때의 주의 점
 *
 * 싱글 스레드 프로그램에서는 한 개의 스레드가 객체를 독차지해서 사용하면 되지만, 멀티 스레드 프로그램에서는
 * 스레드들이 객체를 공유해서 작업해야 하는 경우가 있다.
 *
 * 현재 예제 에서는 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 있었다.
 *
 * 다음과 같은 영역을 critical section 이라고 한다.
 */
public class SharedObjectEx {

    public static void main(String[] args) {

        SharedObject sharedObject = new SharedObject();
        Referer refer1 = new Referer("Test", sharedObject, 10);
        Referer refer2 = new Referer("Test", sharedObject, 30);

        // 두개 다 30이 나오게 된다. 동시성 접근을 허용했기 때문이다.
        refer1.start();
        refer2.start();


        SharedObjectSync sharedObjectSync = new SharedObjectSync();
        RefererSync referSync1 = new RefererSync("Test", sharedObjectSync, 10);
        RefererSync referSync2 = new RefererSync("Test", sharedObjectSync, 30);

        // 두개 다 30이 나오게 된다. 동시성 접근을 허용했기 때문이다.
        referSync1.start();
        sharedObjectSync.update(5);
        referSync2.start();

    }

}
