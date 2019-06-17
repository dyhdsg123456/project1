package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1000);
        myThread.interrupt();
//
//        System.out.println("是否停止1?="+myThread.interrupted());
//        System.out.println("是否停止2?="+myThread.interrupted());
        System.out.println("是否停止1?="+myThread.isInterrupted());
        System.out.println("是否停止2?="+myThread.isInterrupted());
        System.out.println("end");
    }
}
