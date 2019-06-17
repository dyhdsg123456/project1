package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class MyThread3 extends Thread {
    @Override
    public void run(){
        super.run();
       try {
           System.out.println("run begin");
           Thread.sleep(20000);
           System.out.println("run end");
       }catch (InterruptedException e){
           System.out.println("在睡眠中被停止!进入catch!"+this.isInterrupted());
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        try {
            MyThread3 myThread3 = new MyThread3();
            myThread3.start();
            Thread.sleep(200);
            myThread3.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
