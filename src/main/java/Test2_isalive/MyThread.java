package Test2_isalive;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class MyThread   extends Thread
{
    @Override
    public void run(){
        System.out.println("run="+this.isAlive());
    }
    public static void main(String[] args)throws Exception {
        MyThread myThread = new MyThread();
        System.out.println("begin=="+myThread.isAlive());
        myThread.start();
//        Thread.sleep(1000);
        System.out.println("end=="+myThread.isAlive());
    }
}
