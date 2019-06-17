package Yield;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class Test1 extends Thread{


    @Override
    public void run() {

        long begin = System.currentTimeMillis();
        int count=0;
        for (int i=0;i<500000;i++){
//            Thread.yield();
            count=count+(i+1);
        }
        System.out.println("用时:"+(System.currentTimeMillis()-begin)+"毫秒");
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.start();
    }
}
