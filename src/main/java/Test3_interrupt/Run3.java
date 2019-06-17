package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        try {
            MyThread2 myThread = new MyThread2();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        }catch (InterruptedException e){
            System.out.println(" e");
        }



        System.out.println("end");
    }
}
