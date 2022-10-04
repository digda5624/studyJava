package grammer.sync;

public class RefererSync extends Thread {

    private SharedObjectSync sharedObject;
    private int num;

    public RefererSync(String name, SharedObjectSync sharedObject, int num) {
        this.setName(name);
        this.sharedObject = sharedObject;
        this.num = num;
    }

    @Override
    public void run() {
        try {
            sharedObject.setNumber(num);
        } catch (InterruptedException e) {}
    }
}
