package wait生产;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: dyh
 * Date:   2019/6/19
 * Description:
 */
public class Test2ReentrantLock {
    private static int       maxsize  =10;
    private        Lock      lock     =new ReentrantLock();
    private        ArrayList list     =new ArrayList();
    private final  Condition full  = lock.newCondition();
    private final  Condition empty = lock.newCondition();

    public static void main(String[] args) {
        Test test1 = new Test();
        new Thread(test1.new Producer()).start();
        new Thread(test1.new Consumer()).start();
        new Thread(test1.new Producer()).start();
        new Thread(test1.new Consumer()).start();
        new Thread(test1.new Producer()).start();
        new Thread(test1.new Consumer()).start();
        new Thread(test1.new Producer()).start();
        new Thread(test1.new Consumer()).start();
    }

    class Consumer implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while (list.size() <= 0) {
                        try {
                            empty.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.remove("1");
                    Thread.sleep(1000);
                    System.out.println("在" + System.currentTimeMillis() + " 消费了一个产品,还剩:" + list.size() + "个产品");
                    full.notifyAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    class Producer implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while (list.size() == maxsize) {
                        try {
                            full.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.add("1");
                    Thread.sleep(1000);
                    System.out.println("在" + System.currentTimeMillis() + " 生产了一个产品,还剩:" + list.size() + "个产品");
                    empty.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }
    }
}
