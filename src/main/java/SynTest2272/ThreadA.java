package SynTest2272;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service){
        this.service=service;
    }

    @Override
    public void run() {

        service.a();
    }
}
