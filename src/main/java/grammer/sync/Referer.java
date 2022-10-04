package grammer.sync;

public class Referer extends Thread{

    private SharedObject sharedObject;
    private int num;

    public Referer(String name, SharedObject sharedObject, int num) {
        this.setName(name);
        this.sharedObject = sharedObject;
        this.num = num;
    }

    @Override
    public void run() {
        sharedObject.setNumber(num);
    }
}
