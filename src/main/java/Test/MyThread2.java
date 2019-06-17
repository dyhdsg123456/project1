package Test;

/**
 * Author: dyh
 * Date:   2019/6/14
 * Description:
 */
public class MyThread2 extends Thread
{
    private int count=5;
    @Override
//    public void run(){
    public synchronized void run(){
        super.run();
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算,count="+count);
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread a = new Thread(myThread2, "A");
        Thread b = new Thread(myThread2, "b");
        Thread c = new Thread(myThread2, "c");
        Thread d = new Thread(myThread2, "d");
        Thread e = new Thread(myThread2, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
