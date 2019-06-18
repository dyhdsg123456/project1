package SynchronizedTest;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class ThreadA extends Thread{
    private SynchronizedTest.Service service;

    public ThreadA(SynchronizedTest.Service service){
        this.service=service;
    }

    @Override
    public void run() {

        service.set("a","aa");
    }
}
