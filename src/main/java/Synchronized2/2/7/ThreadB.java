package SynchronizedTest;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class ThreadB extends Thread{
    private SynchronizedTest.Service service;

    public ThreadB(SynchronizedTest.Service service){
        this.service=service;
    }

    @Override
    public void run() {
    
        service.set("b","bb");
    }
}
