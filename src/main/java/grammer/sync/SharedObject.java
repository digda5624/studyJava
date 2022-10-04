package grammer.sync;

public class SharedObject {

    private int number = 0;

    public SharedObject(int number) {
        this.number = number;
    }

    public SharedObject() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.println("currentThreadName() : " + Thread.currentThread().getName() + "num : " + this.number);
    }
}
