package wait31;

/**
 * Author: dyh
 * Date:   2019/6/19
 * Description:
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object o){
        lock=o;
    }
    @Override
    public void run() {
        super.run();
        synchronized (lock){
            if(MyList.size()!=5){
                System.out.println("wait begin"+System.currentTimeMillis());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end"+System.currentTimeMillis());
            }
        }
    }
}
