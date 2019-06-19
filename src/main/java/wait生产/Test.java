package wait生产;

import java.util.ArrayList;

/**
 * Author: dyh
 * Date:   2019/6/19
 * Description:
 */
public class Test {
    //最大数量
    private static int maxsize=10;
    private Object lock= new Object();
    private ArrayList list=new ArrayList();

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
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock){
                    while (list.size()<=0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.remove("1");
                    System.out.println("在"+System.currentTimeMillis()+" 消费了一个产品,还剩:"+list.size()+"个产品");
                    lock.notifyAll();
                }
            }
        }
    }

    class Producer implements Runnable{

        @Override
        public void run() {
               for(int i=0;i<10;i++){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (lock){
                   while (list.size()==10){
                       try {
                           lock.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   list.add("1");
                   System.out.println("在"+System.currentTimeMillis()+" 生产了一个产品,还剩:"+list.size()+"个产品");
                   lock.notifyAll();
               }
            }
        }
    }
}
