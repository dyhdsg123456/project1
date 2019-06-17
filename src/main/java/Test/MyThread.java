package Test;

/**
 * Author: dyh
 * Date:   2019/6/14
 * Description:
 */
public class MyThread extends Thread
{
    private int count=5;
    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run(){
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算,count="+count);
        }

    }

    public static void main(String[] args) {
        MyThread A = new MyThread("A");
        MyThread B = new MyThread("B");
        MyThread C = new MyThread("C");
        A.start();
        B.start();
        C.start();
    }
}
