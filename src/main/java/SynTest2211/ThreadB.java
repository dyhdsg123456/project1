package SynTest2211;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service){
        this.service=service;
    }

    @Override
    public void run() {
    
        service.methodB();
    }
}
