package wait31;

/**
 * Author: dyh
 * Date:   2019/6/19
 * Description:
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            for (int i=0;i<10;i++){
                MyList.add();
                if(MyList.size()==5){
                    lock.notify();
                    System.out.println("发出通知");
                }
                System.out.println("添加了"+(i+1)+"个元素");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();

        ThreadA threada = new ThreadA(o);
        threada.start();
        Thread.sleep(50);

        ThreadB threadB = new ThreadB(o);
        threadB.start();
    }
}
